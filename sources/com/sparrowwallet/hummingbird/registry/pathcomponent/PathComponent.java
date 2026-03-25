package com.sparrowwallet.hummingbird.registry.pathcomponent;

import java.util.ArrayList;
import java.util.List;
import o.C5205It;
import o.C5211Iz;
import o.IG;
import o.IL;

/* JADX INFO: loaded from: classes24.dex */
public abstract class PathComponent {
    public static final int HARDENED_BIT = Integer.MIN_VALUE;

    public static C5211Iz toCbor(List<PathComponent> list) {
        C5205It c5205It = new C5205It();
        for (PathComponent pathComponent : list) {
            if (pathComponent instanceof WildcardPathComponent) {
                c5205It.EZpvd(new C5205It());
                c5205It.EZpvd(((WildcardPathComponent) pathComponent).isHardened() ? IG.EZpvd : IG.AEQbTJ);
            } else if (pathComponent instanceof RangePathComponent) {
                RangePathComponent rangePathComponent = (RangePathComponent) pathComponent;
                C5205It c5205It2 = new C5205It();
                c5205It2.EZpvd(new IL(rangePathComponent.getStart()));
                c5205It2.EZpvd(new IL(rangePathComponent.getEnd()));
                c5205It.EZpvd(c5205It2);
                c5205It.EZpvd(rangePathComponent.isHardened() ? IG.EZpvd : IG.AEQbTJ);
            } else if (pathComponent instanceof PairPathComponent) {
                PairPathComponent pairPathComponent = (PairPathComponent) pathComponent;
                C5205It c5205It3 = new C5205It();
                c5205It3.EZpvd(new IL(pairPathComponent.getExternal().getIndex()));
                c5205It3.EZpvd(pairPathComponent.getExternal().isHardened() ? IG.EZpvd : IG.AEQbTJ);
                c5205It3.EZpvd(new IL(pairPathComponent.getInternal().getIndex()));
                c5205It3.EZpvd(pairPathComponent.getInternal().isHardened() ? IG.EZpvd : IG.AEQbTJ);
                c5205It.EZpvd(c5205It3);
            } else {
                if (!(pathComponent instanceof IndexPathComponent)) {
                    throw new IllegalArgumentException("Unknown path component of " + pathComponent.getClass());
                }
                IndexPathComponent indexPathComponent = (IndexPathComponent) pathComponent;
                c5205It.EZpvd(new IL(indexPathComponent.getIndex()));
                c5205It.EZpvd(indexPathComponent.isHardened() ? IG.EZpvd : IG.AEQbTJ);
            }
        }
        return c5205It;
    }

    public static List<PathComponent> fromCbor(C5211Iz c5211Iz) {
        ArrayList arrayList = new ArrayList();
        C5205It c5205It = (C5205It) c5211Iz;
        int i = 0;
        while (i < c5205It.AEQbTJ().size()) {
            C5211Iz c5211Iz2 = c5205It.AEQbTJ().get(i);
            if (c5211Iz2 instanceof C5205It) {
                C5205It c5205It2 = (C5205It) c5211Iz2;
                if (c5205It2.AEQbTJ().isEmpty()) {
                    i++;
                    arrayList.add(new WildcardPathComponent(c5205It.AEQbTJ().get(i) == IG.EZpvd));
                } else if (c5205It2.AEQbTJ().size() == 2) {
                    i++;
                    arrayList.add(new RangePathComponent(((IL) c5205It2.AEQbTJ().get(0)).KWHzl().intValue(), ((IL) c5205It2.AEQbTJ().get(1)).KWHzl().intValue(), c5205It.AEQbTJ().get(i) == IG.EZpvd));
                } else if (c5205It2.AEQbTJ().size() == 4) {
                    IL il = (IL) c5205It2.AEQbTJ().get(0);
                    C5211Iz c5211Iz3 = c5205It2.AEQbTJ().get(1);
                    IG ig = IG.EZpvd;
                    arrayList.add(new PairPathComponent(new IndexPathComponent(il.KWHzl().intValue(), c5211Iz3 == ig), new IndexPathComponent(((IL) c5205It2.AEQbTJ().get(2)).KWHzl().intValue(), c5205It2.AEQbTJ().get(3) == ig)));
                }
            } else if (c5211Iz2 instanceof IL) {
                i++;
                arrayList.add(new IndexPathComponent(((IL) c5211Iz2).KWHzl().intValue(), c5205It.AEQbTJ().get(i) == IG.EZpvd));
            }
            i++;
        }
        return arrayList;
    }
}
