package o;

import com.okinc.network.okg.unifieddomain.DomainConfig;
import com.okinc.network.okg.unifieddomain.DomainConfigProcessor$checkDomainAvailability$2;
import com.okinc.network.okg.unifieddomain.DomainConfigProcessor$findFirstAvailableDomain$1;
import com.okinc.network.okg.unifieddomain.DomainConfigProcessor$selectOptimalDomains$2;
import com.okinc.network.okg.unifieddomain.DomainConfigType;
import com.okinc.network.proxy.SafeProxySelector;
import com.okinc.network.util.DOHDispatcherIO;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.roH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43381roH {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final OkHttpClient.Builder AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC43456rpd OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C43381roH() {
        this(null, null, null, 7, null);
    }

    public C43381roH(@NotNull OkHttpClient.Builder builder, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC43456rpd interfaceC43456rpd) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC43456rpd, "");
        this.AEQbTJ = builder;
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = interfaceC43456rpd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (wrap:okhttp3.OkHttpClient$Builder:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:okhttp3.OkHttpClient$Builder:0x0006: INVOKE (wrap:o.roH$ActionBar:0x0004: SGET  A[WRAPPED] o.roH.Companion o.roH$ActionBar) VIRTUAL call: o.roH.ActionBar.AEQbTJ():okhttp3.OkHttpClient$Builder A[MD:():okhttp3.OkHttpClient$Builder (m), WRAPPED] (LINE:182)) : (r1v0 okhttp3.OkHttpClient$Builder))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x000a: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x000e: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getIO():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:55)) : (r2v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:o.rpd:?: TERNARY null = ((wrap:int:0x0012: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.rpd:0x0018: INVOKE (wrap:o.roH$ActionBar:0x0016: SGET  A[WRAPPED] o.roH.Companion o.roH$ActionBar) VIRTUAL call: o.roH.ActionBar.KWHzl():o.rpd A[MD:():o.rpd (m), WRAPPED] (LINE:182)) : (r3v0 o.rpd))
 A[MD:(okhttp3.OkHttpClient$Builder, kotlinx.coroutines.CoroutineDispatcher, o.rpd):void (m)] (LINE:53) call: o.roH.<init>(okhttp3.OkHttpClient$Builder, kotlinx.coroutines.CoroutineDispatcher, o.rpd):void type: THIS */
    public /* synthetic */ C43381roH(OkHttpClient.Builder builder, CoroutineDispatcher coroutineDispatcher, InterfaceC43456rpd interfaceC43456rpd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Companion.AEQbTJ() : builder, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i & 4) != 0 ? Companion.KWHzl() : interfaceC43456rpd);
    }

    public final java.lang.Object EZpvd(@NotNull java.util.List<DomainConfig> list, @NotNull java.lang.String str, @NotNull Continuation<? super java.util.Map<java.lang.String, java.lang.String>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new DomainConfigProcessor$selectOptimalDomains$2(list, this, str, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.Map<DomainConfigType, kotlin.Pair<java.lang.String, java.lang.String>> map, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.EZpvd, new DomainConfigProcessor$checkDomainAvailability$2(map, this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ee -> B:28:0x00f3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super C43383roJ> continuation) throws java.lang.Throwable {
        DomainConfigProcessor$findFirstAvailableDomain$1 domainConfigProcessor$findFirstAvailableDomain$1;
        java.lang.String str3;
        java.util.Iterator<java.lang.String> it;
        C43381roH c43381roH;
        java.util.List list2;
        OkHttpClient okHttpClient;
        java.util.List<java.lang.String> list3;
        DomainConfigProcessor$findFirstAvailableDomain$1 domainConfigProcessor$findFirstAvailableDomain$12;
        java.lang.String str4;
        if (continuation instanceof DomainConfigProcessor$findFirstAvailableDomain$1) {
            domainConfigProcessor$findFirstAvailableDomain$1 = (DomainConfigProcessor$findFirstAvailableDomain$1) continuation;
            int i = domainConfigProcessor$findFirstAvailableDomain$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                domainConfigProcessor$findFirstAvailableDomain$1.label = i - Integer.MIN_VALUE;
            } else {
                domainConfigProcessor$findFirstAvailableDomain$1 = new DomainConfigProcessor$findFirstAvailableDomain$1(this, continuation);
            }
        }
        java.lang.Object obj = domainConfigProcessor$findFirstAvailableDomain$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = domainConfigProcessor$findFirstAvailableDomain$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
                pUU.valueOf("DomainConfigProcessor", "Health check path is blank for scenario: " + str2 + ", returning first domain");
                return new C43383roJ((java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(list), yDY.AhwBna());
            }
            str3 = str2;
            OkHttpClient okHttpClientBuild = this.AEQbTJ.build();
            it = list.iterator();
            c43381roH = this;
            list2 = arrayList;
            okHttpClient = okHttpClientBuild;
            list3 = list;
            domainConfigProcessor$findFirstAvailableDomain$12 = domainConfigProcessor$findFirstAvailableDomain$1;
            str4 = str;
            while (it.hasNext()) {
            }
            pUU.valueOf("DomainConfigProcessor", "No available domain found for scenario: " + str3 + " in list: " + list3 + " with path: " + str4);
            return new C43383roJ(null, list2);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        java.lang.String str5 = (java.lang.String) domainConfigProcessor$findFirstAvailableDomain$1.L$7;
        java.util.Iterator<java.lang.String> it2 = (java.util.Iterator) domainConfigProcessor$findFirstAvailableDomain$1.L$6;
        OkHttpClient okHttpClient2 = (OkHttpClient) domainConfigProcessor$findFirstAvailableDomain$1.L$5;
        java.util.List list4 = (java.util.List) domainConfigProcessor$findFirstAvailableDomain$1.L$4;
        java.lang.String str6 = (java.lang.String) domainConfigProcessor$findFirstAvailableDomain$1.L$3;
        java.lang.String str7 = (java.lang.String) domainConfigProcessor$findFirstAvailableDomain$1.L$2;
        java.util.List<java.lang.String> list5 = (java.util.List) domainConfigProcessor$findFirstAvailableDomain$1.L$1;
        c43381roH = (C43381roH) domainConfigProcessor$findFirstAvailableDomain$1.L$0;
        C56391yDq.AEQbTJ(obj);
        domainConfigProcessor$findFirstAvailableDomain$12 = domainConfigProcessor$findFirstAvailableDomain$1;
        str4 = str7;
        java.lang.String next = str5;
        str3 = str6;
        list2 = list4;
        okHttpClient = okHttpClient2;
        it = it2;
        if (!((java.lang.Boolean) obj).booleanValue()) {
            pUU.EZpvd("DomainConfigProcessor", "Found available domain for " + str3 + ": " + next);
            return new C43383roJ(next, list2);
        }
        pUU.KWHzl("DomainConfigProcessor", "Domain unavailable for " + str3 + ": " + next);
        list2.add(next);
        list3 = list5;
        while (it.hasNext()) {
            next = it.next();
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) next)) {
                InterfaceC43456rpd interfaceC43456rpd = c43381roH.OLrzqt;
                CoroutineDispatcher coroutineDispatcher = c43381roH.EZpvd;
                domainConfigProcessor$findFirstAvailableDomain$12.L$0 = c43381roH;
                domainConfigProcessor$findFirstAvailableDomain$12.L$1 = list3;
                domainConfigProcessor$findFirstAvailableDomain$12.L$2 = str4;
                domainConfigProcessor$findFirstAvailableDomain$12.L$3 = str3;
                domainConfigProcessor$findFirstAvailableDomain$12.L$4 = list2;
                domainConfigProcessor$findFirstAvailableDomain$12.L$5 = okHttpClient;
                domainConfigProcessor$findFirstAvailableDomain$12.L$6 = it;
                domainConfigProcessor$findFirstAvailableDomain$12.L$7 = next;
                domainConfigProcessor$findFirstAvailableDomain$12.label = 1;
                java.lang.Object objOLrzqt = interfaceC43456rpd.OLrzqt(okHttpClient, next + str4, coroutineDispatcher, domainConfigProcessor$findFirstAvailableDomain$12);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                list5 = list3;
                obj = objOLrzqt;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                }
            }
        }
        pUU.valueOf("DomainConfigProcessor", "No available domain found for scenario: " + str3 + " in list: " + list3 + " with path: " + str4);
        return new C43383roJ(null, list2);
    }

    /* JADX INFO: renamed from: o.roH$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.roH.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final InterfaceC43456rpd KWHzl() {
            return ((InterfaceC43269rmB) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC43269rmB.class)).DCUTEIdCUTEI();
        }

        public final OkHttpClient.Builder AEQbTJ() {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.dispatcher(new Dispatcher(DOHDispatcherIO.Companion.KWHzl().getThreadPool()));
            builder.proxySelector(new SafeProxySelector(null, 1, null));
            return builder;
        }
    }
}
