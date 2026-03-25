package o;

import o.InterfaceC5386Ps;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: o.mfe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C32547mfe implements InterfaceC5386Ps<C5378Pk, java.io.InputStream> {
    public final OkHttpClient EZpvd;

    public C32547mfe(OkHttpClient okHttpClient) {
        this.EZpvd = okHttpClient;
    }

    /* JADX INFO: renamed from: o.mfe$TaskDescription */
    public static class TaskDescription implements InterfaceC5390Pw<C5378Pk, java.io.InputStream> {
        public final OkHttpClient EZpvd;

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        public TaskDescription() {
            this(C32547mfe.KWHzl());
        }

        public TaskDescription(OkHttpClient okHttpClient) {
            this.EZpvd = okHttpClient;
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<C5378Pk, java.io.InputStream> AEQbTJ(@androidx.annotation.NonNull PA pa) {
            return new C32547mfe(this.EZpvd);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    public InterfaceC5386Ps.Application<java.io.InputStream> AEQbTJ(@androidx.annotation.NonNull C5378Pk c5378Pk, int i, int i2, @androidx.annotation.NonNull NM nm) {
        return new InterfaceC5386Ps.Application<>(new C32548mff(c5378Pk), new ND(this.EZpvd, c5378Pk));
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@androidx.annotation.NonNull C5378Pk c5378Pk) {
        try {
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
        return c5378Pk.valueOf() != null;
    }

    public static OkHttpClient KWHzl() {
        return EZpvd(true);
    }

    public static OkHttpClient EZpvd(boolean z) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        OkHttpClient.Builder builderWriteTimeout = builder.connectTimeout(20L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(20L, timeUnit);
        if (z && C35202nqq.OLrzqt.AEQbTJ("pic_size_statistics")) {
            builderWriteTimeout.addInterceptor(new C32545mfc());
        }
        builderWriteTimeout.addInterceptor(new C32612mgq());
        return C43398roY.copydefault.AEQbTJ(builderWriteTimeout).build();
    }
}
