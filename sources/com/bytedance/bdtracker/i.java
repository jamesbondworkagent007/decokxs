package com.bytedance.bdtracker;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes14.dex */
public final class i extends Lambda implements Function1<String, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f189a = new i();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public i() {
        super(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke(String str) {
        return str == null ? "DDL failed" : (str.hashCode() == -1867169789 && str.equals("success")) ? "DDL response data empty" : str;
    }
}
