package com.okinc.business.defi.api.model.tx.signdata;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.yDY;

/* JADX INFO: loaded from: classes3.dex */
public final class SolanaMemeContractSignData extends SolanaContractSignData {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SolanaMemeContractSignData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00aa: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0052: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0056: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:227)) : (r28v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x006d: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r31v0 java.util.Map))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0075: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0080: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.util.Map<java.lang.String, ? extends java.lang.Object>, java.lang.String, java.lang.String):void (m)] (LINE:216) call: com.okinc.business.defi.api.model.tx.signdata.SolanaMemeContractSignData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SolanaMemeContractSignData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, String str12, Map map, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? yDY.AhwBna() : list, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : map, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14);
    }

    public SolanaMemeContractSignData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<String> list, String str11, String str12, Map<String, ? extends Object> map, String str13, String str14) {
        super(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, list, str11, str12, map, str13, str14, null, 65536, null);
    }
}
