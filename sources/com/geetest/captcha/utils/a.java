package com.geetest.captcha.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.geetest.captcha.utils.LogUtils;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LogUtils.a f378a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Looper looper, LogUtils.a aVar) {
        super(looper);
        this.f378a = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Handler
    public final void handleMessage(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "");
        super.handleMessage(message);
        try {
            if (Thread.interrupted()) {
                return;
            }
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                SimpleDateFormat simpleDateFormat = LogUtils.a.c;
                LogUtils.a.C0190a.a();
                return;
            }
            Object obj = message.obj;
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.geetest.captcha.utils.LogUtils.Logger.Item");
            }
            LogUtils.a.b bVar = (LogUtils.a.b) obj;
            LogUtils.a.a(this.f378a, LogUtils.a.C0190a.a(LogUtils.a.c, bVar.f377a, bVar.b, bVar.c));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
