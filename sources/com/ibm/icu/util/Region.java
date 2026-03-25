package com.ibm.icu.util;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ibm.icu.impl.ICUResourceBundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public class Region implements Comparable<Region> {
    public static Map<Integer, Region> AEQbTJ = null;
    public static boolean EZpvd = false;
    public static Map<String, Region> KWHzl;
    public static ArrayList<Set<Region>> OLrzqt;
    public static Map<String, Region> copydefault;
    public static ArrayList<Region> valueOf;
    public int AhwBna;
    public RegionType DbNXlk;
    public String gEmmrt;
    public Region djBIcL = null;
    public Set<Region> AYXKKw = new TreeSet();
    public List<Region> AkhnZx = null;

    public enum RegionType {
        UNKNOWN,
        TERRITORY,
        WORLD,
        CONTINENT,
        SUBCONTINENT,
        GROUPING,
        DEPRECATED
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RegionType OLrzqt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return this.gEmmrt;
    }

    private Region() {
    }

    public static void EZpvd() {
        Region region;
        synchronized (Region.class) {
            if (EZpvd) {
                return;
            }
            KWHzl = new HashMap();
            copydefault = new HashMap();
            AEQbTJ = new HashMap();
            OLrzqt = new ArrayList<>(RegionType.values().length);
            ClassLoader classLoader = ICUResourceBundle.AEQbTJ;
            UResourceBundle uResourceBundleIsConnected = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", TtmlNode.TAG_METADATA, classLoader).isConnected(MTPushConstants.Operation.KEY_ALIAS).isConnected("territory");
            UResourceBundle uResourceBundleCopydefault = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "supplementalData", classLoader);
            UResourceBundle uResourceBundleIsConnected2 = uResourceBundleCopydefault.isConnected("codeMappings");
            UResourceBundle uResourceBundleIsConnected3 = uResourceBundleCopydefault.isConnected("idValidity").isConnected("region");
            UResourceBundle uResourceBundleIsConnected4 = uResourceBundleIsConnected3.isConnected("regular");
            UResourceBundle uResourceBundleIsConnected5 = uResourceBundleIsConnected3.isConnected("macroregion");
            UResourceBundle uResourceBundleIsConnected6 = uResourceBundleIsConnected3.isConnected("unknown");
            UResourceBundle uResourceBundleIsConnected7 = uResourceBundleCopydefault.isConnected("territoryContainment");
            UResourceBundle uResourceBundleIsConnected8 = uResourceBundleIsConnected7.isConnected("001");
            UResourceBundle uResourceBundleIsConnected9 = uResourceBundleIsConnected7.isConnected("grouping");
            List<String> listAsList = Arrays.asList(uResourceBundleIsConnected8.isConnected());
            Enumeration<String> keys = uResourceBundleIsConnected9.getKeys();
            ArrayList<String> arrayList = new ArrayList();
            ArrayList<String> arrayList2 = new ArrayList();
            arrayList2.addAll(Arrays.asList(uResourceBundleIsConnected4.isConnected()));
            arrayList2.addAll(Arrays.asList(uResourceBundleIsConnected5.isConnected()));
            arrayList2.add(uResourceBundleIsConnected6.getFieldNames());
            for (String str : arrayList2) {
                int iIndexOf = str.indexOf("~");
                if (iIndexOf > 0) {
                    StringBuilder sb = new StringBuilder(str);
                    char cCharAt = sb.charAt(iIndexOf + 1);
                    sb.setLength(iIndexOf);
                    int i = iIndexOf - 1;
                    char cCharAt2 = sb.charAt(i);
                    while (cCharAt2 <= cCharAt) {
                        arrayList.add(sb.toString());
                        cCharAt2 = (char) (cCharAt2 + 1);
                        sb.setCharAt(i, cCharAt2);
                    }
                } else {
                    arrayList.add(str);
                }
            }
            valueOf = new ArrayList<>(arrayList.size());
            for (String str2 : arrayList) {
                Region region2 = new Region();
                region2.gEmmrt = str2;
                region2.DbNXlk = RegionType.TERRITORY;
                copydefault.put(str2, region2);
                if (str2.matches("[0-9]{3}")) {
                    int iIntValue = Integer.valueOf(str2).intValue();
                    region2.AhwBna = iIntValue;
                    AEQbTJ.put(Integer.valueOf(iIntValue), region2);
                    region2.DbNXlk = RegionType.SUBCONTINENT;
                } else {
                    region2.AhwBna = -1;
                }
                valueOf.add(region2);
            }
            for (int i2 = 0; i2 < uResourceBundleIsConnected.fARcdN(); i2++) {
                UResourceBundle uResourceBundleKWHzl = uResourceBundleIsConnected.KWHzl(i2);
                String strAEQbTJ = uResourceBundleKWHzl.AEQbTJ();
                String fieldNames = uResourceBundleKWHzl.isConnected("replacement").getFieldNames();
                if (copydefault.containsKey(fieldNames) && !copydefault.containsKey(strAEQbTJ)) {
                    KWHzl.put(strAEQbTJ, copydefault.get(fieldNames));
                } else {
                    if (copydefault.containsKey(strAEQbTJ)) {
                        region = copydefault.get(strAEQbTJ);
                    } else {
                        Region region3 = new Region();
                        region3.gEmmrt = strAEQbTJ;
                        copydefault.put(strAEQbTJ, region3);
                        if (strAEQbTJ.matches("[0-9]{3}")) {
                            int iIntValue2 = Integer.valueOf(strAEQbTJ).intValue();
                            region3.AhwBna = iIntValue2;
                            AEQbTJ.put(Integer.valueOf(iIntValue2), region3);
                        } else {
                            region3.AhwBna = -1;
                        }
                        valueOf.add(region3);
                        region = region3;
                    }
                    region.DbNXlk = RegionType.DEPRECATED;
                    List<String> listAsList2 = Arrays.asList(fieldNames.split(" "));
                    region.AkhnZx = new ArrayList();
                    for (String str3 : listAsList2) {
                        if (copydefault.containsKey(str3)) {
                            region.AkhnZx.add(copydefault.get(str3));
                        }
                    }
                }
            }
            for (int i3 = 0; i3 < uResourceBundleIsConnected2.fARcdN(); i3++) {
                UResourceBundle uResourceBundleKWHzl2 = uResourceBundleIsConnected2.KWHzl(i3);
                if (uResourceBundleKWHzl2.AuCTel() == 8) {
                    String[] strArrIsConnected = uResourceBundleKWHzl2.isConnected();
                    String str4 = strArrIsConnected[0];
                    Integer numValueOf = Integer.valueOf(strArrIsConnected[1]);
                    String str5 = strArrIsConnected[2];
                    if (copydefault.containsKey(str4)) {
                        Region region4 = copydefault.get(str4);
                        int iIntValue3 = numValueOf.intValue();
                        region4.AhwBna = iIntValue3;
                        AEQbTJ.put(Integer.valueOf(iIntValue3), region4);
                        KWHzl.put(str5, region4);
                    }
                }
            }
            if (copydefault.containsKey("001")) {
                copydefault.get("001").DbNXlk = RegionType.WORLD;
            }
            if (copydefault.containsKey("ZZ")) {
                copydefault.get("ZZ").DbNXlk = RegionType.UNKNOWN;
            }
            for (String str6 : listAsList) {
                if (copydefault.containsKey(str6)) {
                    copydefault.get(str6).DbNXlk = RegionType.CONTINENT;
                }
            }
            while (keys.hasMoreElements()) {
                String strNextElement = keys.nextElement();
                if (copydefault.containsKey(strNextElement)) {
                    copydefault.get(strNextElement).DbNXlk = RegionType.GROUPING;
                }
            }
            if (copydefault.containsKey("QO")) {
                copydefault.get("QO").DbNXlk = RegionType.SUBCONTINENT;
            }
            for (int i4 = 0; i4 < uResourceBundleIsConnected7.fARcdN(); i4++) {
                UResourceBundle uResourceBundleKWHzl3 = uResourceBundleIsConnected7.KWHzl(i4);
                String strAEQbTJ2 = uResourceBundleKWHzl3.AEQbTJ();
                if (!strAEQbTJ2.equals("containedGroupings") && !strAEQbTJ2.equals("deprecated") && !strAEQbTJ2.equals("grouping")) {
                    Region region5 = copydefault.get(strAEQbTJ2);
                    for (int i5 = 0; i5 < uResourceBundleKWHzl3.fARcdN(); i5++) {
                        Region region6 = copydefault.get(uResourceBundleKWHzl3.copydefault(i5));
                        if (region5 != null && region6 != null) {
                            region5.AYXKKw.add(region6);
                            if (region5.OLrzqt() != RegionType.GROUPING) {
                                region6.djBIcL = region5;
                            }
                        }
                    }
                }
            }
            for (int i6 = 0; i6 < RegionType.values().length; i6++) {
                OLrzqt.add(new TreeSet());
            }
            for (Region region7 : valueOf) {
                Set<Region> set = OLrzqt.get(region7.DbNXlk.ordinal());
                set.add(region7);
                OLrzqt.set(region7.DbNXlk.ordinal(), set);
            }
            EZpvd = true;
        }
    }

    public static Region OLrzqt(String str) {
        str.getClass();
        EZpvd();
        Region region = copydefault.get(str);
        if (region == null) {
            region = KWHzl.get(str);
        }
        if (region != null) {
            return (region.DbNXlk == RegionType.DEPRECATED && region.AkhnZx.size() == 1) ? region.AkhnZx.get(0) : region;
        }
        throw new IllegalArgumentException("Unknown region id: " + str);
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public int compareTo(Region region) {
        return this.gEmmrt.compareTo(region.gEmmrt);
    }
}
