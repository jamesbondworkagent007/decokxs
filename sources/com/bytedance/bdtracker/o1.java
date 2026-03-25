package com.bytedance.bdtracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList<f4> f236a = new LinkedList<>();
    public final LinkedList<String> b = new LinkedList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int a(ArrayList<f4> arrayList, d dVar, k0 k0Var) {
        int size;
        synchronized (this.f236a) {
            size = this.f236a.size();
            for (f4 f4Var : this.f236a) {
                k0Var.a(dVar, f4Var, arrayList);
                arrayList.add(f4Var);
            }
            this.f236a.clear();
        }
        return size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(f4 f4Var) {
        synchronized (this.f236a) {
            if (this.f236a.size() > 300) {
                this.f236a.poll();
            }
            this.f236a.add(f4Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(String[] strArr) {
        synchronized (this.b) {
            if (this.b.size() > 300) {
                this.b.poll();
            }
            this.b.addAll(Arrays.asList(strArr));
        }
    }
}
