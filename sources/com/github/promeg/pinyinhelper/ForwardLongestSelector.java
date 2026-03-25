package com.github.promeg.pinyinhelper;

import com.github.promeg.pinyinhelper.Engine;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import org.ahocorasick.trie.Emit;

/* JADX INFO: loaded from: classes21.dex */
final class ForwardLongestSelector implements SegmentationSelector {
    static final Engine.EmitComparator HIT_COMPARATOR = new Engine.EmitComparator();

    @Override // com.github.promeg.pinyinhelper.SegmentationSelector
    public List<Emit> select(Collection<Emit> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList<Emit> arrayList = new ArrayList(collection);
        Collections.sort(arrayList, HIT_COMPARATOR);
        TreeSet treeSet = new TreeSet();
        int end = -1;
        for (Emit emit : arrayList) {
            if (emit.getStart() > end && emit.getEnd() > end) {
                end = emit.getEnd();
            } else {
                treeSet.add(emit);
            }
        }
        arrayList.removeAll(treeSet);
        return arrayList;
    }
}
