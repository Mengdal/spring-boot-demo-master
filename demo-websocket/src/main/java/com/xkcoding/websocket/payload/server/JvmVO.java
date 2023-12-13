package com.xkcoding.websocket.payload.server;

import com.google.common.collect.Lists;
import com.xkcoding.websocket.model.server.Jvm;
import com.xkcoding.websocket.payload.KV;
import lombok.Data;
import org.checkerframework.checker.units.qual.K;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * JVM相关信息实体VO
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-12-14 17:28
 */
@Data
public class JvmVO {
    List<KV> data = Lists.newArrayList();
    List<HashMap<String,Object>> data1=Lists.newArrayList();
    public static JvmVO create(Jvm jvm) {
        JvmVO vo = new JvmVO();
        vo.data.add(new KV("当前JVM占用的内存总数(M)", jvm.getTotal() + "M"));
        vo.data.add(new KV("JVM最大可用内存总数(M)", jvm.getMax() + "M"));
        vo.data.add(new KV("JVM空闲内存(M)", jvm.getFree() + "M"));
        vo.data.add(new KV("JVM使用率", jvm.getUsage() + "%"));
        vo.data.add(new KV("JDK版本", jvm.getVersion()));
        vo.data.add(new KV("JDK路径", jvm.getHome()));
        vo.data.add(new KV("JDK启动时间", jvm.getStartTime()));
        vo.data.add(new KV("JDK运行时间", jvm.getRunTime()));
        return vo;
    }
  public static JvmVO create1(Jvm jvm) {
    JvmVO vo = new JvmVO();
    vo.data1.add(new HashMap<>(){{ put("当前JVM占用的内存总数(M)", jvm.getTotal() + "M");}});
    vo.data1.add(new HashMap<>(){{ put("JVM最大可用内存总数(M)",jvm.getMax() + "M");}});
    vo.data1.add(new HashMap<>(){{ put("JVM空闲内存(M)", jvm.getFree() + "M");}});
    vo.data1.add(new HashMap<>(){{ put("JVM使用率", jvm.getUsage() + "%"); }});
    vo.data1.add(new HashMap<>(){{ put("JDK版本", jvm.getVersion()); }});
    vo.data1.add(new HashMap<>(){{ put("JDK路径", jvm.getHome()); }});
    vo.data1.add(new HashMap<>(){{ put("JDK启动时间", jvm.getStartTime()); }});
    vo.data1.add(new HashMap<>(){{ put("JDK运行时间", jvm.getRunTime()); }});
    return vo;
  }


}
