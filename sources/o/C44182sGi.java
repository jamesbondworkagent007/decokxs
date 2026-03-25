package o;

import com.okinc.okimcore.feature.contact.manager.SiteInfoManagerImpl$getSiteInfo$1;
import com.okinc.okimcore.feature.core.interceptors.IMSiteInfo;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sGi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44182sGi implements sKU, sEH {
    public final java.util.Set<sKV> OLrzqt = new LinkedHashSet();

    @yCM
    public C44182sGi() {
    }

    @Override // o.sEH
    public void bp_() {
        this.OLrzqt.clear();
    }

    @Override // o.sEH
    public void bq_() {
        this.OLrzqt.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0078 -> B:21:0x007b). Please report as a decompilation issue!!! */
    @Override // o.sKU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Request request, @NotNull Continuation<? super IMSiteInfo> continuation) throws java.lang.Throwable {
        SiteInfoManagerImpl$getSiteInfo$1 siteInfoManagerImpl$getSiteInfo$1;
        Request request2;
        java.util.Collection collection;
        java.util.Iterator it;
        if (continuation instanceof SiteInfoManagerImpl$getSiteInfo$1) {
            siteInfoManagerImpl$getSiteInfo$1 = (SiteInfoManagerImpl$getSiteInfo$1) continuation;
            int i = siteInfoManagerImpl$getSiteInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                siteInfoManagerImpl$getSiteInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                siteInfoManagerImpl$getSiteInfo$1 = new SiteInfoManagerImpl$getSiteInfo$1(this, continuation);
            }
        }
        java.lang.Object obj = siteInfoManagerImpl$getSiteInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = siteInfoManagerImpl$getSiteInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.Set<sKV> set = this.OLrzqt;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(set, 10));
            java.util.Iterator it2 = set.iterator();
            request2 = request;
            collection = arrayList;
            it = it2;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (java.util.Collection) siteInfoManagerImpl$getSiteInfo$1.L$3;
            it = (java.util.Iterator) siteInfoManagerImpl$getSiteInfo$1.L$2;
            java.util.Collection collection2 = (java.util.Collection) siteInfoManagerImpl$getSiteInfo$1.L$1;
            Request request3 = (Request) siteInfoManagerImpl$getSiteInfo$1.L$0;
            C56391yDq.AEQbTJ(obj);
            collection.add((IMSiteInfo) obj);
            collection = collection2;
            request2 = request3;
            if (it.hasNext()) {
                sKV skv = (sKV) it.next();
                siteInfoManagerImpl$getSiteInfo$1.L$0 = request2;
                siteInfoManagerImpl$getSiteInfo$1.L$1 = collection;
                siteInfoManagerImpl$getSiteInfo$1.L$2 = it;
                siteInfoManagerImpl$getSiteInfo$1.L$3 = collection;
                siteInfoManagerImpl$getSiteInfo$1.label = 1;
                java.lang.Object objEZpvd = skv.EZpvd(request2, siteInfoManagerImpl$getSiteInfo$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                request3 = request2;
                obj = objEZpvd;
                collection2 = collection;
                collection.add((IMSiteInfo) obj);
                collection = collection2;
                request2 = request3;
                if (it.hasNext()) {
                    return CollectionsKt___CollectionsKt.wlaJM((java.util.List) collection);
                }
            }
        }
    }
}
