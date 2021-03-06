package com.ljc.builder;
/**
 * 抽象Builder类
 */
public abstract class Builder {
	// 设置主机
	public abstract Builder setBoard(String board);
	// 设置显示器
	public abstract Builder setDisplay(String display);
	// 设置操作系统
	public abstract Builder setOS(String os);
	// 创建computer
	public abstract Computer build();
}