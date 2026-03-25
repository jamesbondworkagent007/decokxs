package o;

import com.okinc.okex.di.SupportApiModule;
import com.okinc.okex.feedback.net.FeedbackApiService;

/* JADX INFO: renamed from: o.srw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45542srw implements InterfaceC58162ywA<FeedbackApiService> {
    public final SupportApiModule AEQbTJ;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public FeedbackApiService get() {
        return EZpvd(this.AEQbTJ);
    }

    public static FeedbackApiService EZpvd(SupportApiModule supportApiModule) {
        return (FeedbackApiService) C58165ywD.KWHzl(supportApiModule.OLrzqt());
    }
}
