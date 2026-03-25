package com.geetest.captcha;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public abstract class q implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f372a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(@NotNull x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "");
        if (xVar.a()) {
            return;
        }
        if (a() >= 0) {
            a(xVar);
            return;
        }
        q qVar = this.f372a;
        if (qVar != null) {
            qVar.b(xVar);
        }
    }
}
