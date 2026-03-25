package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import kotlin.jvm.internal.Intrinsics;
import o.C43418ros;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43421rov implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        C43418ros c43418ros = C43418ros.OLrzqt;
        try {
            if (c43418ros.OLrzqt().isWriteLocked()) {
                try {
                    pUU.KWHzl("PushOptimization", "lock " + chain.request().url().encodedPath() + " start");
                    C43418ros.StateListAnimator stateListAnimatorKWHzl = c43418ros.KWHzl();
                    if (stateListAnimatorKWHzl != null) {
                        stateListAnimatorKWHzl.copydefault("", "", java.lang.String.valueOf(chain.request().url()), java.lang.String.valueOf(c43418ros.copydefault()), TtmlNode.START);
                    }
                    c43418ros.OLrzqt().readLock().lock();
                    Response responseProceed = chain.proceed(chain.request());
                    pUU.KWHzl("PushOptimization", "unlock " + chain.request().url().encodedPath() + " " + responseProceed.code());
                    C43418ros.StateListAnimator stateListAnimatorKWHzl2 = c43418ros.KWHzl();
                    if (stateListAnimatorKWHzl2 != null) {
                        stateListAnimatorKWHzl2.copydefault(java.lang.String.valueOf(responseProceed.code()), "", java.lang.String.valueOf(chain.request().url()), java.lang.String.valueOf(c43418ros.copydefault()), TtmlNode.END);
                    }
                    c43418ros.OLrzqt().readLock().unlock();
                    pUU.KWHzl("PushOptimization", "unlock " + chain.request().url().encodedPath() + " end");
                    return responseProceed;
                } catch (java.lang.Exception e) {
                    pUU.KWHzl("PushOptimization", "unlock " + chain.request().url().encodedPath() + " " + e);
                    C43418ros c43418ros2 = C43418ros.OLrzqt;
                    C43418ros.StateListAnimator stateListAnimatorKWHzl3 = c43418ros2.KWHzl();
                    if (stateListAnimatorKWHzl3 != null) {
                        stateListAnimatorKWHzl3.copydefault(MultiTransferSignData.DEFAULT_INTERVAL, java.lang.String.valueOf(e), java.lang.String.valueOf(chain.request().url()), java.lang.String.valueOf(c43418ros2.copydefault()), TtmlNode.END);
                    }
                    throw e;
                }
            }
            return chain.proceed(chain.request());
        } catch (java.lang.Throwable th) {
            C43418ros.OLrzqt.OLrzqt().readLock().unlock();
            pUU.KWHzl("PushOptimization", "unlock " + chain.request().url().encodedPath() + " end");
            throw th;
        }
    }
}
