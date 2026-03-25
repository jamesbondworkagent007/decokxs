package com.bytedance.bdtracker;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes14.dex */
public class h1 extends f1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public h1(HashSet<String> hashSet, HashMap<String, HashSet<String>> map) {
        super(hashSet, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f1
    public boolean a(String str) {
        return this.f173a.contains(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.f1
    public boolean a(HashSet<String> hashSet, String str) {
        return hashSet.contains(str);
    }
}
