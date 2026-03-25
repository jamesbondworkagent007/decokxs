package com.bytedance.bdtracker;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static z4<String> f223a = new a();

    public static final class a extends z4<String> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.bdtracker.z4
        public String a(Object[] objArr) {
            return UUID.randomUUID().toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String a() {
        return f223a.b(new Object[0]);
    }
}
