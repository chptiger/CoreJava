package Question;

import java.io.File;

public class fileView {

	public static void main(String args[]) {

		view(); // 调用查看文件列表函数

	}

	private static void view() {
		String path = "D://eclipse//LL//medium"; // 输入路径

		File file = new File(path);

		if (!file.exists() || !file.isDirectory()) { // 判断路径是否存在

			if (path.equals("end")) // 路径不存在则进入判断内，如果输入的不是end则递归调用重新输入
			{
				System.out.println("程序结束，感谢使用！");
				System.exit(-1);
			} else {
				System.out.println("输入的路径不存在,请重新输入！(输入end退出程序)");
				view();
			}

		}

		String[] names = file.list(); // 将路径下的文件和目录存入字符串数组中

		int i = 0;
		int t = 0;
		String[] filename = new String[500]; // 存放文件名字
		String[] Directory = new String[500]; // 存放目录名字

		for (String name : names) {

			File files = new File(path + "\\" + name);

			if (files.isFile()) // 判断是文件则存入文件字符串数组中
			{
				filename[i] = files.getName();
				i++;
			} else // 判断是目录则存入目录字符串数组中
			{
				Directory[t] = files.getName();
				t++;
			}

		}

		System.out.println("该目录下一共有" + (i) + "个文件，它们的列表如下："); // 输出文件名
		for (int x = 0; x < i; x++) {
			System.out.println(filename[x]);
			System.out.println();

		}

		System.out.println();

		System.out.println("该目录下一共有" + (t) + "个文件夹，它们的列表如下：");// 输出目录名
		for (int x = 0; x < t; x++) {
			System.out.println(Directory[x]);
			System.out.println();
		}

	}

}