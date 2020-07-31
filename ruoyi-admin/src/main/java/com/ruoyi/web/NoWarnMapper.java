package com.ruoyi.web;

import org.mybatis.spring.annotation.MapperScan;

/**
 * @version 1.0
 * @ClassName: NoWarnMapper
 * @Author lee
 * @date 2020/7/31 16:20
 */
@org.apache.ibatis.annotations.Mapper
public interface NoWarnMapper {
//    SpringBoot 去除"No MyBatis mapper was found in '[com.pollyduan.cms]' package. " 警告
//https://developer.aliyun.com/article/573148
//    springboot项目，集成了mybatis。
//
//    偶然发现，项目每次启动都警告：
//
//    No MyBatis mapper was found in '[com.pollyduan.cms]' package. Please check your configuration.
//    我在 com.pollyduan.cms.CmsApplication 主类上使用 @MapperScan(basePackages="com.pollyduan.cms.mapper") 扫描指定包里的mapper接口，没有配置其他。莫名其妙警告 'com.pollyduan.cms' 找不到Mapper，真是莫名了奇妙。
//
//    仔细观察发现，这个包恰恰是 Application 主类的包，看样子是默认扫描了。
//
//    强迫症犯了，虽然不影响使用，但心里膈应，怎么去掉这个警告呢？网上搜了半天，都是瞎扯。
//
//    跟源码也可以找到 doScan() 方法里扫描 Mapper 注解。却没有找到怎么让他不扫描。
//
//    偶然想到一个思路，既然你要找主类包里的mapper，我就给你一个mapper。
//
//            package com.pollyduan.cms;
//
//    @org.apache.ibatis.annotations.Mapper
//    public interface NoWarnMapper{}
}
