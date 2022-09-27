package practice;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Sorting {
	public static void sort(int a[])
	{
		int num;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					num=a[j];
					a[j]=a[j+1];
					a[j+1]=num;
				}
			}
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}
	public static void main(String[] args) {
		int arr[]= {520,21,5632,542,23,456,20};
		sort(arr);
	}

}
