package com.example.demokaka.Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InDb {

    /**
     * 获取一个文件夹下的所有文件全路径
     *
     * @param path
     */
    public static ArrayList<String> getAllFileName(String path) {
        ArrayList<String> listFileName = new ArrayList<String>();
        File file = new File(path);
        System.out.println(file.getAbsolutePath());
        File[] files = file.listFiles();
        String[] names = file.list();
        if (names != null) {
            String[] completNames = new String[names.length];
            for (int i = 0; i < names.length; i++) {
                completNames[i] = path + names[i];
            }
            listFileName.addAll(Arrays.asList(completNames));
        }
        return listFileName;
    }

    public static List<String> readFile(String fileName) {
        List<String> oneRegulation = new ArrayList<String>(Arrays.asList(new String(), new String(), new String(), new String(), new String()));
        //读取文件
        BufferedReader br = null;
        StringBuffer sb = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8")); //这里可以控制编码
            sb = new StringBuffer();
            String line = null, nextLine = null;
            line = br.readLine();
            while (true) {
                if (line.contains("法规正文")||line.contains("法规内容")) break;
                nextLine = br.readLine();
                if ((line.contains("：")||(line.contains(":"))) && (nextLine.contains("：")||nextLine.contains(":"))) {
                    String[] split;
                    if (line.contains("："))
                        split = line.trim().split("：");
                    else
                        split = line.trim().split(":");
                    if (split.length == 2) {
//                        System.out.println(split[1]);
                        switch (split[0]) {
                            case "法规标题":
                                oneRegulation.set(0, split[1]);
                                break;
                            case "颁布时间":
                                oneRegulation.set(1, split[1]);
                                break;
                            case "颁布主体":
                                oneRegulation.set(2, split[1]);
                                break;
                            case "通过会议":
                                oneRegulation.set(3, split[1]);
                                break;
                        }
                    }
                } else {
                    line+=nextLine;
                    continue;
                }
                line = nextLine;
            }

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String s = new String(sb); //StringBuffer ==> String
//        System.out.println(s);
        oneRegulation.set(4, s);
        return oneRegulation;
    }

    public static void main(String[] args) {
        ArrayList<String> allFileName = getAllFileName("src\\main\\resources\\docs\\");
        for (String name : allFileName) {
            System.out.println(name);
            List<String> strings = readFile(name);
        }
    }

}
