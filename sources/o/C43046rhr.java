package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.core.util.SPUtils;
import com.okinc.localization.bean.RemoteUpdateStatus;
import com.okinc.mln.miniapp.AppDiffJson;
import com.okinc.mln.miniapp.AppDiffSP;
import com.okinc.mln.miniapp.AppJson;
import com.okinc.mln.miniapp.MiniAppUpdateError;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.resource.request.MiniAppUpdateRequestBody;
import com.okinc.resource.request.MiniAppUpdateResp;
import com.okinc.resource.request.MlnUpdateRequest;
import com.okinc.rxutils.RxBus;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC48864udi;
import o.C43046rhr;
import o.InterfaceC43022rhT;
import o.InterfaceC43040rhl;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rhr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43046rhr implements InterfaceC43040rhl {
    public final C48834udE AEQbTJ;
    public final java.util.Map<java.lang.String, C43020rhR> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final C43043rho OLrzqt;
    public final AbstractC48864udi copydefault;

    /* JADX INFO: renamed from: o.rhr$StateListAnimator */
    public static final class StateListAnimator extends TypeToken<java.util.Map<java.lang.String, ? extends java.lang.String>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C43046rhr() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C43043rho AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC48864udi AhwBna() {
        return this.copydefault;
    }

    public final long OLrzqt(long j, long j2, int i, int i2) {
        if (j2 <= 0) {
            return 0L;
        }
        return j < 0 ? i : j > j2 ? i2 : ((long) i) + ((long) ((j / j2) * ((double) (i2 - i))));
    }

    public C43046rhr(AbstractC48864udi abstractC48864udi, C43043rho c43043rho) {
        C48834udE c48834udE = new C48834udE("[MiniApp]");
        this.AEQbTJ = c48834udE;
        this.EZpvd = Collections.synchronizedMap(new LinkedHashMap());
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.rhA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43046rhr.KWHzl(this.EZpvd);
            }
        });
        c48834udE.AEQbTJ(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, "init");
        this.OLrzqt = c43043rho == null ? new C43043rho() : c43043rho;
        this.copydefault = abstractC48864udi == null ? new AbstractC48864udi() { // from class: o.rhr.1
            public final C48834udE copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AbstractC48864udi
            public C48834udE AEQbTJ() {
                return this.copydefault;
            }

            {
                super("miniapp", true);
                this.copydefault = new C48834udE("[MiniApp]");
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
            @Override // o.AbstractC48864udi
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean EZpvd(java.lang.String str, java.lang.String str2) {
                boolean z;
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                C43042rhn c43042rhn = C43042rhn.AEQbTJ;
                if (c43042rhn.KWHzl(str)) {
                    str = c43042rhn.copydefault(str);
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
                    java.lang.String strOLrzqt = C43046rhr.this.gEmmrt(str).OLrzqt();
                    AEQbTJ().copydefault(str, "local version: " + strOLrzqt);
                    if (C48833udD.copydefault(str2, strOLrzqt) > 0) {
                        z = true;
                    }
                } else {
                    z = false;
                }
                AEQbTJ().copydefault(str, "should update: " + z);
                return z;
            }
        } : abstractC48864udi;
        java.util.Map map = (java.util.Map) SPUtils.getObject("miniapp_fs_md5s", java.util.Map.class, "miniapp_sp");
        java.lang.String string = SPUtils.getString("miniapp_fs_versions", "", "miniapp_sp");
        Intrinsics.copydefault((java.lang.Object) string);
        if (string.length() > 0) {
            java.util.Map map2 = (java.util.Map) new Gson().fromJson(string, new StateListAnimator().getType());
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    java.lang.String str2 = (java.lang.String) entry.getValue();
                    java.util.Map<java.lang.String, C43020rhR> map3 = this.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(map3, "");
                    C43020rhR c43020rhR = new C43020rhR(str);
                    java.lang.String strAEQbTJ = AEQbTJ(str, str2);
                    java.lang.String str3 = (java.lang.String) (map != null ? map.get(str) : null);
                    if (str3 == null) {
                        str3 = "";
                    }
                    c43020rhR.copydefault(str2, str3, strAEQbTJ);
                    map3.put(str, c43020rhR);
                }
            }
        }
        java.util.Map<java.lang.String, java.lang.String> map4 = (java.util.Map) SPUtils.getObject("miniapp_test_packets", java.util.Map.class, "miniapp_sp");
        if (map4 != null) {
            AEQbTJ().KWHzl(map4);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.udi:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.udi) : (r2v0 o.udi))
  (wrap:o.rho:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.rho) : (r3v0 o.rho))
 A[MD:(o.udi, o.rho):void (m)] (LINE:42) call: o.rhr.<init>(o.udi, o.rho):void type: THIS */
    public /* synthetic */ C43046rhr(AbstractC48864udi abstractC48864udi, C43043rho c43043rho, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : abstractC48864udi, (i & 2) != 0 ? null : c43043rho);
    }

    public java.io.File valueOf() {
        return (java.io.File) this.KWHzl.getValue();
    }

    public static final java.io.File KWHzl(C43046rhr c43046rhr) {
        return c43046rhr.copydefault.valueOf();
    }

    public final boolean fetchVPNInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C35202nqq.OLrzqt.AEQbTJ("mini_app_diff_download_" + str);
    }

    public InterfaceC43022rhT AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC43022rhT interfaceC43022rhTAEQbTJ = AEQbTJ().AEQbTJ(str);
        return interfaceC43022rhTAEQbTJ == null ? gEmmrt(str) : interfaceC43022rhTAEQbTJ;
    }

    public InterfaceC43022rhT gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Map<java.lang.String, C43020rhR> map = this.EZpvd;
        Intrinsics.checkNotNullExpressionValue(map, "");
        C43020rhR c43020rhR = map.get(str);
        if (c43020rhR == null) {
            c43020rhR = new C43020rhR(str);
            map.put(str, c43020rhR);
        }
        return c43020rhR;
    }

    public java.lang.String AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.AEQbTJ(str, str2);
    }

    public java.lang.String valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str + ".bundle";
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, C48860ude c48860ude) {
        this.AEQbTJ.EZpvd(str, "updateMiniAppInfo " + str2 + " " + str4);
        gEmmrt(str).copydefault(str2, str3, str4);
        java.util.Map<java.lang.String, C43020rhR> map = this.EZpvd;
        Intrinsics.checkNotNullExpressionValue(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((C43020rhR) entry.getValue()).gEmmrt());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) entry2.getValue())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        SPUtils.put("miniapp_fs_versions", new Gson().toJson(linkedHashMap2), "miniapp_sp");
        java.util.Map<java.lang.String, C43020rhR> map2 = this.EZpvd;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C56423yEv.copydefault(map2.size()));
        java.util.Iterator<T> it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it2.next();
            linkedHashMap3.put(entry3.getKey(), ((C43020rhR) entry3.getValue()).AhwBna());
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) entry4.getValue())) {
                linkedHashMap4.put(entry4.getKey(), entry4.getValue());
            }
        }
        SPUtils.put("miniapp_fs_md5s", linkedHashMap4, "miniapp_sp");
        copydefault(str);
        EZpvd(c48860ude);
        RxBus.AEQbTJ(new C43016rhN(str, str2));
    }

    public final void EZpvd(C48860ude c48860ude) {
        java.lang.String strValueOf;
        java.lang.String strAYXKKw;
        C43042rhn c43042rhn = C43042rhn.AEQbTJ;
        java.lang.String str = "";
        java.lang.String strGEmmrt = c43042rhn.KWHzl(c48860ude.valueOf()) ? c48860ude.gEmmrt() : "";
        if (c43042rhn.KWHzl(c48860ude.valueOf()) && (strAYXKKw = c48860ude.AYXKKw()) != null) {
            str = strAYXKKw;
        }
        if (c43042rhn.KWHzl(c48860ude.valueOf())) {
            strValueOf = c43042rhn.copydefault(c48860ude.valueOf());
        } else {
            strValueOf = c48860ude.valueOf();
        }
        SPUtils.put("miniapp_diff_" + strValueOf, new AppDiffSP(strGEmmrt, str), "miniapp_diff_sp");
    }

    public C43045rhq djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return InterfaceC43022rhT.Activity.getResourceLoader$default(AhwBna(str), null, 1, null);
    }

    public AppJson KWHzl(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return AhwBna(str).EZpvd();
    }

    public static final Unit AEQbTJ(long j, long j2) {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.rhr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkUpdateResult$default(C43046rhr c43046rhr, java.lang.String str, C48860ude c48860ude, Function2 function2, Function0 function0, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function2() { // from class: o.rhy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C43046rhr.AEQbTJ(((java.lang.Long) obj2).longValue(), ((java.lang.Long) obj3).longValue());
                }
            };
        }
        c43046rhr.KWHzl(str, c48860ude, (Function2<? super java.lang.Long, ? super java.lang.Long, Unit>) function2, (Function0<Unit>) function0, (Function1<? super MiniAppUpdateError, Unit>) function1);
    }

    public final void KWHzl(java.lang.String str, C48860ude c48860ude, Function2<? super java.lang.Long, ? super java.lang.Long, Unit> function2, Function0<Unit> function0, final Function1<? super MiniAppUpdateError, Unit> function1) {
        AppJson appJsonEZpvd = InterfaceC43022rhT.Companion.EZpvd(new C43045rhq(C43045rhq.Companion.EZpvd(), str));
        if (!Intrinsics.EZpvd((java.lang.Object) (appJsonEZpvd != null ? appJsonEZpvd.getVersion() : null), (java.lang.Object) c48860ude.AhwBna())) {
            java.lang.String version = appJsonEZpvd != null ? appJsonEZpvd.getVersion() : null;
            java.lang.String str2 = "app.json version mismatch: " + version + " != " + c48860ude.AhwBna();
            this.AEQbTJ.EZpvd(c48860ude.valueOf(), str + " -> " + str2);
            function1.invoke(new MiniAppUpdateError(305, str2, null, 4, null));
            return;
        }
        java.lang.String minFrameworkVersion = appJsonEZpvd != null ? appJsonEZpvd.getMinFrameworkVersion() : null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) minFrameworkVersion)) {
            java.lang.String strValueOf = c48860ude.valueOf();
            Intrinsics.copydefault((java.lang.Object) minFrameworkVersion);
            if (!EZpvd(strValueOf, minFrameworkVersion)) {
                this.AEQbTJ.copydefault(c48860ude.valueOf(), "Starting to wait for framework update");
                EZpvd(minFrameworkVersion, c48860ude.valueOf(), function2, function0, new Function1() { // from class: o.rhw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C43046rhr.OLrzqt(function1, (java.lang.String) obj);
                    }
                });
                return;
            }
        }
        function0.invoke();
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new MiniAppUpdateError(305, str, null, 4, null));
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(java.lang.String str, java.lang.String str2) {
        java.lang.String strGEmmrt = C7326ahi.gEmmrt();
        this.AEQbTJ.copydefault(str, "framework current version: " + strGEmmrt + ", required version: " + str2);
        return C48833udD.copydefault(str2, strGEmmrt) <= 0;
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2, Function2<? super java.lang.Long, ? super java.lang.Long, Unit> function2, Function0<Unit> function0, Function1<? super java.lang.String, Unit> function1) {
        C7791aqW c7791aqWAEQbTJ = C7788aqT.AEQbTJ();
        InterfaceC7792aqX interfaceC7792aqXCopydefault = c7791aqWAEQbTJ != null ? c7791aqWAEQbTJ.copydefault() : null;
        if (interfaceC7792aqXCopydefault == null) {
            function1.invoke("Framework updater not configured");
        } else {
            interfaceC7792aqXCopydefault.copydefault(C32979mnm.EZpvd.OLrzqt(), false, new Application(str2, str, function0, function1, function2));
        }
    }

    /* JADX INFO: renamed from: o.rhr$Application */
    public static final class Application implements AbstractC48864udi.Application {
        public final /* synthetic */ Function1<java.lang.String, Unit> AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ Function2<java.lang.Long, java.lang.Long, Unit> OLrzqt;
        public final /* synthetic */ Function0<Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(java.lang.String str, java.lang.String str2, Function0<Unit> function0, Function1<? super java.lang.String, Unit> function1, Function2<? super java.lang.Long, ? super java.lang.Long, Unit> function2) {
            this.KWHzl = str;
            this.EZpvd = str2;
            this.copydefault = function0;
            this.AEQbTJ = function1;
            this.OLrzqt = function2;
        }

        @Override // o.AbstractC48864udi.Application
        public void OLrzqt(java.lang.String str) {
            AbstractC48864udi.Application.ActionBar.OLrzqt(this, str);
        }

        @Override // o.AbstractC48864udi.Application
        public void copydefault() {
            AbstractC48864udi.Application.ActionBar.OLrzqt(this);
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd() {
            if (C43046rhr.this.EZpvd(this.KWHzl, this.EZpvd)) {
                C43046rhr.this.AEQbTJ.copydefault(this.KWHzl, "Framework updated by other tasks");
                this.copydefault.invoke();
            } else {
                C43046rhr.this.AEQbTJ.OLrzqt(this.KWHzl, "Should update framework, but skipped");
                this.AEQbTJ.invoke("Should update framework, but skipped");
            }
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(C48860ude c48860ude, java.lang.String str) {
            Intrinsics.checkNotNullParameter(c48860ude, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (C43046rhr.this.EZpvd(this.KWHzl, this.EZpvd)) {
                C43046rhr.this.AEQbTJ.copydefault(this.KWHzl, "Framework update successful");
                this.copydefault.invoke();
            } else {
                C43046rhr.this.AEQbTJ.OLrzqt(this.KWHzl, "Framework version still not sufficient after update");
                this.AEQbTJ.invoke("Framework version still not sufficient after update");
            }
        }

        @Override // o.AbstractC48864udi.Application
        public void KWHzl(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            java.lang.String str = "Framework update failed: " + th.getMessage();
            C43046rhr.this.AEQbTJ.OLrzqt(this.KWHzl, str);
            this.AEQbTJ.invoke(str);
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(long j, long j2) {
            this.OLrzqt.invoke(java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC43040rhl
    public void copydefault(@NotNull final java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, @NotNull AbstractC48864udi.ActionBar actionBar) {
        java.util.List<java.lang.String> listEZpvd;
        java.util.Map<java.lang.String, java.lang.String> mapKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.AEQbTJ.AEQbTJ(str, "updateMiniApp called");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = str3;
        if (str3 != 0 && C48833udD.copydefault(str3, str2) <= 0) {
            objectRef.element = null;
        }
        final C7841arT c7841arT = new C7841arT(str);
        final TaskDescription taskDescription = new TaskDescription(c7841arT, actionBar, this, str);
        final java.lang.String str4 = str + "diff";
        final boolean zContains = C43042rhn.AEQbTJ.AEQbTJ().contains(str4);
        if (!fetchVPNInfo(str) || !zContains ? !this.copydefault.copydefault(str, taskDescription) : !(this.copydefault.copydefault(str, taskDescription) || this.copydefault.copydefault(str4, taskDescription))) {
            if (zContains && fetchVPNInfo(str)) {
                listEZpvd = yDY.gEmmrt(str, str4);
            } else {
                listEZpvd = C56402yEa.EZpvd(str);
            }
            java.util.List<java.lang.String> list = listEZpvd;
            if (zContains) {
                if (fetchVPNInfo(str)) {
                    mapKWHzl = (str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) ? C56424yEw.KWHzl() : C56424yEw.gEmmrt(C56390yDp.OLrzqt(str, str2), C56390yDp.OLrzqt(str4, str2));
                } else {
                    mapKWHzl = (str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) ? C56424yEw.KWHzl() : C56423yEv.EZpvd(C56390yDp.OLrzqt(str, str2));
                }
            } else {
                mapKWHzl = (str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) ? C56424yEw.KWHzl() : C56423yEv.EZpvd(C56390yDp.OLrzqt(str, str2));
            }
            OLrzqt(list, mapKWHzl, z, new Function1() { // from class: o.rhE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C43046rhr.copydefault(this.AEQbTJ, str, zContains, objectRef, taskDescription, c7841arT, str4, (java.util.List) obj);
                }
            }, new Function1() { // from class: o.rhB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C43046rhr.KWHzl(taskDescription, (java.lang.Throwable) obj);
                }
            });
            return;
        }
        this.AEQbTJ.EZpvd(str, "updateMiniApp-> in progress");
    }

    /* JADX INFO: renamed from: o.rhr$TaskDescription */
    public static final class TaskDescription implements AbstractC48864udi.Application {
        public final /* synthetic */ C43046rhr AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ C7841arT OLrzqt;
        public final /* synthetic */ AbstractC48864udi.ActionBar copydefault;

        public TaskDescription(C7841arT c7841arT, AbstractC48864udi.ActionBar actionBar, C43046rhr c43046rhr, java.lang.String str) {
            this.OLrzqt = c7841arT;
            this.copydefault = actionBar;
            this.AEQbTJ = c43046rhr;
            this.EZpvd = str;
        }

        @Override // o.AbstractC48864udi.Application
        public void copydefault() {
            this.OLrzqt.OLrzqt();
        }

        @Override // o.AbstractC48864udi.Application
        public void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt.copydefault(str);
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd() {
            this.copydefault.EZpvd("");
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(final C48860ude c48860ude, final java.lang.String str) {
            Intrinsics.checkNotNullParameter(c48860ude, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (C43042rhn.AEQbTJ.KWHzl(c48860ude.valueOf())) {
                this.AEQbTJ.AEQbTJ(c48860ude, str, this.OLrzqt, this.copydefault);
                return;
            }
            final C43046rhr c43046rhr = this.AEQbTJ;
            final AbstractC48864udi.ActionBar actionBar = this.copydefault;
            Function2 function2 = new Function2() { // from class: o.rhH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C43046rhr.TaskDescription.KWHzl(actionBar, c43046rhr, ((java.lang.Long) obj).longValue(), ((java.lang.Long) obj2).longValue());
                }
            };
            final C43046rhr c43046rhr2 = this.AEQbTJ;
            final java.lang.String str2 = this.EZpvd;
            final AbstractC48864udi.ActionBar actionBar2 = this.copydefault;
            final C7841arT c7841arT = this.OLrzqt;
            Function0 function0 = new Function0() { // from class: o.rhI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43046rhr.TaskDescription.OLrzqt(c43046rhr2, str2, c48860ude, str, actionBar2, c7841arT);
                }
            };
            final AbstractC48864udi.ActionBar actionBar3 = this.copydefault;
            final C7841arT c7841arT2 = this.OLrzqt;
            c43046rhr.KWHzl(str, c48860ude, (Function2<? super java.lang.Long, ? super java.lang.Long, Unit>) function2, (Function0<Unit>) function0, (Function1<? super MiniAppUpdateError, Unit>) new Function1() { // from class: o.rhL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C43046rhr.TaskDescription.KWHzl(actionBar3, c7841arT2, (MiniAppUpdateError) obj);
                }
            });
        }

        public static final Unit OLrzqt(C43046rhr c43046rhr, java.lang.String str, C48860ude c48860ude, java.lang.String str2, AbstractC48864udi.ActionBar actionBar, C7841arT c7841arT) {
            c43046rhr.OLrzqt(str, c48860ude.AhwBna(), c48860ude.gEmmrt(), str2, c48860ude);
            actionBar.EZpvd(str2);
            c7841arT.AEQbTJ();
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(AbstractC48864udi.ActionBar actionBar, C7841arT c7841arT, MiniAppUpdateError miniAppUpdateError) {
            Intrinsics.checkNotNullParameter(miniAppUpdateError, "");
            actionBar.OLrzqt(miniAppUpdateError);
            c7841arT.KWHzl(miniAppUpdateError);
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(AbstractC48864udi.ActionBar actionBar, C43046rhr c43046rhr, long j, long j2) {
            actionBar.AEQbTJ(c43046rhr.OLrzqt(j, j2, 90, 100), 100L);
            return Unit.INSTANCE;
        }

        @Override // o.AbstractC48864udi.Application
        public void KWHzl(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.copydefault.OLrzqt(th);
            this.OLrzqt.KWHzl(th instanceof MiniAppUpdateError ? (MiniAppUpdateError) th : new MiniAppUpdateError(304, th));
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(long j, long j2) {
            this.copydefault.AEQbTJ(this.AEQbTJ.OLrzqt(j, j2, 0, 90), 100L);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(final C43046rhr c43046rhr, java.lang.String str, boolean z, Ref.ObjectRef objectRef, final TaskDescription taskDescription, final C7841arT c7841arT, java.lang.String str2, java.util.List list) {
        AbstractC58185ywX<pSD> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(list, "");
        c43046rhr.AEQbTJ.AEQbTJ(str, "updateMiniApp onSuccess");
        java.util.Iterator it = list.iterator();
        final C48860ude c48860ude = null;
        C48860ude c48860ude2 = null;
        while (it.hasNext()) {
            C48860ude c48860ude3 = (C48860ude) it.next();
            if (Intrinsics.EZpvd((java.lang.Object) c48860ude3.valueOf(), (java.lang.Object) str)) {
                c48860ude = c48860ude3;
            } else if (Intrinsics.EZpvd((java.lang.Object) c48860ude3.valueOf(), (java.lang.Object) str2)) {
                c48860ude2 = c48860ude3;
            }
        }
        if (c48860ude != null && c48860ude2 != null) {
            if (c43046rhr.fetchVPNInfo(str) && z) {
                if (C33573myx.copydefault(c48860ude2.AhwBna(), c48860ude.AhwBna()) >= 0) {
                    java.lang.String strAYXKKw = c43046rhr.AYXKKw(str);
                    if (strAYXKKw != null) {
                        if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) c48860ude2.AYXKKw())) {
                            if (c43046rhr.AEQbTJ(str)) {
                                C7843arV.EZpvd.EZpvd(str, "0", c48860ude2.AhwBna(), c48860ude2.AYXKKw(), "isHitDiff success!!!");
                                try {
                                    pUU.copydefault("diffBundle", "isHitDiff success !!!, " + c48860ude.valueOf() + ": " + c48860ude + ",   " + c48860ude2.valueOf() + ": " + c48860ude2);
                                } catch (java.lang.Exception unused) {
                                }
                                c48860ude = c48860ude2;
                            } else {
                                C7843arV.EZpvd.EZpvd(str, "5", c48860ude2.AhwBna(), c48860ude2.AYXKKw(), "fusion error");
                            }
                        } else {
                            C7843arV.EZpvd.EZpvd(str, "4", c48860ude2.AhwBna(), c48860ude2.AYXKKw(), "no fit bundle");
                        }
                    } else {
                        C7843arV.EZpvd.EZpvd(str, "3", c48860ude2.AhwBna(), c48860ude2.AYXKKw(), "no bundle");
                    }
                } else {
                    C7843arV.EZpvd.EZpvd(str, "2", c48860ude2.AhwBna(), c48860ude2.AYXKKw(), "gray publish");
                }
            } else {
                C7843arV.EZpvd.EZpvd(str, "1", c48860ude2.AhwBna(), c48860ude2.AYXKKw(), "not hit abtest");
            }
        }
        T t = objectRef.element;
        if (t != 0) {
            if (C48833udD.copydefault((java.lang.String) t, c48860ude != null ? c48860ude.AhwBna() : null) > 0) {
                java.lang.String strAhwBna = c48860ude != null ? c48860ude.AhwBna() : null;
                taskDescription.KWHzl(new MiniAppUpdateError(305, "minVersion doesn't meet the requirement. target: " + strAhwBna + ", minVersion: " + objectRef.element, null, 4, null));
                return Unit.INSTANCE;
            }
        }
        if (c48860ude == null) {
            c43046rhr.AEQbTJ.copydefault(str, "no update required");
            taskDescription.EZpvd();
            return Unit.INSTANCE;
        }
        if (z && !c43046rhr.fetchVPNInfo(str)) {
            C7843arV.EZpvd.EZpvd(str, "1", c48860ude.AhwBna(), "", "not hit abtest");
        }
        c7841arT.AEQbTJ(c48860ude.valueOf());
        c7841arT.OLrzqt(c48860ude.AhwBna());
        if (c43046rhr.copydefault.EZpvd(str, c48860ude.AhwBna())) {
            c43046rhr.AEQbTJ.AEQbTJ(str, "trigger language update");
            abstractC58185ywXKWHzl = pSC.AEQbTJ.EZpvd(C32979mnm.EZpvd.OLrzqt()).gEmmrt(60L, java.util.concurrent.TimeUnit.SECONDS).EZpvd(1L);
        } else {
            RemoteUpdateStatus remoteUpdateStatus = RemoteUpdateStatus.LATEST;
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new pSD(remoteUpdateStatus, remoteUpdateStatus, null, 4, null));
        }
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        yBI.subscribeBy$default(abstractC58185ywXKWHzl, new Function1() { // from class: o.rhD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43046rhr.AEQbTJ(taskDescription, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.rhC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43046rhr.KWHzl(this.EZpvd, c48860ude, c7841arT, taskDescription, (pSD) obj);
            }
        }, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C43046rhr c43046rhr, C48860ude c48860ude, C7841arT c7841arT, TaskDescription taskDescription, pSD psd) {
        if (psd.EZpvd().ordinal() >= RemoteUpdateStatus.LATEST.ordinal()) {
            if (c43046rhr.copydefault.EZpvd(c48860ude.valueOf(), c48860ude.AhwBna())) {
                c7841arT.EZpvd();
            }
            c43046rhr.AEQbTJ(c48860ude, taskDescription);
        } else {
            taskDescription.KWHzl(new MiniAppUpdateError(302, "language update failed: " + psd.OLrzqt(), null, 4, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(TaskDescription taskDescription, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        taskDescription.KWHzl(new MiniAppUpdateError(302, "language update failed", th));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(TaskDescription taskDescription, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        taskDescription.KWHzl(new MiniAppUpdateError(303, th));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rhr$Activity */
    public static final class Activity implements AbstractC48864udi.Application {
        public final /* synthetic */ C48860ude AEQbTJ;
        public final /* synthetic */ AbstractC48864udi.Application KWHzl;
        public final /* synthetic */ C43046rhr OLrzqt;

        public Activity(AbstractC48864udi.Application application, C43046rhr c43046rhr, C48860ude c48860ude) {
            this.KWHzl = application;
            this.OLrzqt = c43046rhr;
            this.AEQbTJ = c48860ude;
        }

        @Override // o.AbstractC48864udi.Application
        public void copydefault() {
            this.KWHzl.copydefault();
        }

        @Override // o.AbstractC48864udi.Application
        public void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl.OLrzqt(str);
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd() {
            this.KWHzl.EZpvd();
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(C48860ude c48860ude, java.lang.String str) {
            Intrinsics.checkNotNullParameter(c48860ude, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl.EZpvd(c48860ude, str);
        }

        @Override // o.AbstractC48864udi.Application
        public void KWHzl(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.OLrzqt.AEQbTJ.EZpvd(this.AEQbTJ.valueOf(), "updateMiniApp-> download error for the first time");
            AbstractC48864udi.download$default(this.OLrzqt.AhwBna(), this.AEQbTJ, this.KWHzl, false, 4, null);
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(long j, long j2) {
            this.KWHzl.EZpvd(j, j2);
        }
    }

    public final void AEQbTJ(C48860ude c48860ude, AbstractC48864udi.Application application) {
        application.EZpvd(0L, 1L);
        this.copydefault.OLrzqt(c48860ude, (AbstractC48864udi.Application) new Activity(application, this, c48860ude), true);
    }

    public java.util.Set<java.lang.String> copydefault() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(C43048rht.AEQbTJ.copydefault());
        linkedHashSet.addAll(this.EZpvd.keySet());
        return linkedHashSet;
    }

    public final java.util.List<java.lang.String> EZpvd() {
        java.util.Set<java.lang.String> setAEQbTJ = C43042rhn.AEQbTJ.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setAEQbTJ) {
            if (fetchVPNInfo(C43042rhn.AEQbTJ.copydefault((java.lang.String) obj))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public MiniAppUpdateRequestBody OLrzqt() {
        if (AEQbTJ().EZpvd()) {
            return null;
        }
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG(copydefault());
        if (listFJNWhG.isEmpty()) {
            return null;
        }
        listFJNWhG.addAll(EZpvd());
        this.AEQbTJ.AEQbTJ(CollectionsKt___CollectionsKt.joinToString$default(listFJNWhG, null, null, null, 0, null, null, 63, null), "getBatchUpdateMiniAppParams");
        return new MiniAppUpdateRequestBody(InterfaceC43040rhl.StateListAnimator.getUpdateAccount$default(this, false, 1, null), listFJNWhG, djBIcL());
    }

    public final java.util.Map<java.lang.String, java.lang.String> djBIcL() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Map<java.lang.String, C43020rhR> map = this.EZpvd;
        Intrinsics.checkNotNullExpressionValue(map, "");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap2.put(entry.getKey(), ((C43020rhR) entry.getValue()).gEmmrt());
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            java.lang.String str = (java.lang.String) entry2.getValue();
            if (str != null) {
                linkedHashMap.put(entry2.getKey(), str);
            }
        }
        for (java.lang.String str2 : EZpvd()) {
            java.lang.String str3 = (java.lang.String) linkedHashMap.get(C43042rhn.AEQbTJ.copydefault(str2));
            if (str3 != null) {
                linkedHashMap.put(str2, str3);
            }
        }
        return linkedHashMap;
    }

    public java.lang.String AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C43020rhR c43020rhR = this.EZpvd.get(str);
        if (c43020rhR != null) {
            return c43020rhR.gEmmrt();
        }
        return null;
    }

    public MlnUpdateRequest AYXKKw() {
        if (AEQbTJ().EZpvd()) {
            return null;
        }
        return new MlnUpdateRequest(InterfaceC43040rhl.StateListAnimator.getUpdateAccount$default(this, false, 1, null));
    }

    @Override // o.InterfaceC43040rhl
    public java.lang.String AEQbTJ(boolean z) {
        return (z || AEQbTJ().AYXKKw()) ? "15506877795" : "";
    }

    public void copydefault(java.util.List<MiniAppUpdateResp> list, java.util.List<MiniAppUpdateResp> list2, java.lang.Throwable th) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            java.util.ArrayList<C48860ude> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(EZpvd((MiniAppUpdateResp) it.next()));
            }
            for (C48860ude c48860ude : arrayList) {
                linkedHashMap.put(c48860ude.valueOf(), c48860ude);
            }
        }
        if (list2 != null) {
            java.util.ArrayList<C48860ude> arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            java.util.Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(EZpvd((MiniAppUpdateResp) it2.next()));
            }
            for (C48860ude c48860ude2 : arrayList2) {
                linkedHashMap.put(c48860ude2.valueOf(), c48860ude2);
            }
        }
        for (C48860ude c48860ude3 : copydefault(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(linkedHashMap.values()))) {
            C7841arT c7841arT = new C7841arT(c48860ude3.valueOf());
            c7841arT.OLrzqt(c48860ude3.AhwBna());
            if (this.copydefault.EZpvd(c48860ude3.valueOf(), c48860ude3.AhwBna())) {
                c7841arT.EZpvd();
            }
            AbstractC48864udi.download$default(this.copydefault, c48860ude3, new ActionBar(c7841arT, this), false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.rhr$ActionBar */
    public static final class ActionBar implements AbstractC48864udi.Application {
        public final /* synthetic */ C7841arT AEQbTJ;
        public final /* synthetic */ C43046rhr copydefault;

        @Override // o.AbstractC48864udi.Application
        public void EZpvd() {
        }

        public ActionBar(C7841arT c7841arT, C43046rhr c43046rhr) {
            this.AEQbTJ = c7841arT;
            this.copydefault = c43046rhr;
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(long j, long j2) {
            AbstractC48864udi.Application.ActionBar.EZpvd(this, j, j2);
        }

        @Override // o.AbstractC48864udi.Application
        public void copydefault() {
            this.AEQbTJ.OLrzqt();
        }

        @Override // o.AbstractC48864udi.Application
        public void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ.copydefault(str);
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(final C48860ude c48860ude, final java.lang.String str) {
            Intrinsics.checkNotNullParameter(c48860ude, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (C43042rhn.AEQbTJ.KWHzl(c48860ude.valueOf())) {
                this.copydefault.AEQbTJ(c48860ude, str, this.AEQbTJ, null);
                return;
            }
            final C43046rhr c43046rhr = this.copydefault;
            final C7841arT c7841arT = this.AEQbTJ;
            Function0 function0 = new Function0() { // from class: o.rhJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43046rhr.ActionBar.KWHzl(c43046rhr, c48860ude, str, c7841arT);
                }
            };
            final C7841arT c7841arT2 = this.AEQbTJ;
            C43046rhr.checkUpdateResult$default(c43046rhr, str, c48860ude, null, function0, new Function1() { // from class: o.rhG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C43046rhr.ActionBar.AEQbTJ(c7841arT2, (MiniAppUpdateError) obj);
                }
            }, 4, null);
        }

        public static final Unit KWHzl(C43046rhr c43046rhr, C48860ude c48860ude, java.lang.String str, C7841arT c7841arT) {
            c43046rhr.OLrzqt(c48860ude.valueOf(), c48860ude.AhwBna(), c48860ude.gEmmrt(), str, c48860ude);
            c7841arT.AEQbTJ();
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(C7841arT c7841arT, MiniAppUpdateError miniAppUpdateError) {
            Intrinsics.checkNotNullParameter(miniAppUpdateError, "");
            c7841arT.KWHzl(miniAppUpdateError);
            return Unit.INSTANCE;
        }

        @Override // o.AbstractC48864udi.Application
        public void KWHzl(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            AbstractC48864udi.Application.ActionBar.EZpvd(this, th);
            this.AEQbTJ.KWHzl(new MiniAppUpdateError(304, th));
        }
    }

    public final java.util.List<C48860ude> copydefault(java.util.List<C48860ude> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList<C48860ude> arrayList2 = new java.util.ArrayList();
        java.util.ArrayList<C48860ude> arrayList3 = new java.util.ArrayList();
        if (list != null) {
            for (C48860ude c48860ude : list) {
                if (C43042rhn.AEQbTJ.KWHzl(c48860ude.valueOf())) {
                    arrayList3.add(c48860ude);
                } else {
                    arrayList2.add(c48860ude);
                }
            }
        }
        for (C48860ude c48860ude2 : arrayList2) {
            java.lang.String strAYXKKw = AYXKKw(c48860ude2.valueOf());
            java.lang.String str = c48860ude2.valueOf() + "diff";
            boolean z = false;
            for (C48860ude c48860ude3 : arrayList3) {
                if (Intrinsics.EZpvd((java.lang.Object) c48860ude3.valueOf(), (java.lang.Object) str)) {
                    if (fetchVPNInfo(c48860ude2.valueOf())) {
                        if (C33573myx.copydefault(c48860ude3.AhwBna(), c48860ude2.AhwBna()) < 0) {
                            C7843arV.EZpvd.EZpvd(c48860ude2.valueOf(), "2", c48860ude3.AhwBna(), c48860ude3.AYXKKw(), "gray publish");
                        } else if (strAYXKKw != null) {
                            if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) c48860ude3.AYXKKw())) {
                                if (AEQbTJ(c48860ude2.valueOf())) {
                                    arrayList.add(c48860ude3);
                                    C7843arV.EZpvd.EZpvd(c48860ude2.valueOf(), "0", c48860ude3.AhwBna(), c48860ude3.AYXKKw(), "isHitDiff success!!!");
                                    try {
                                        pUU.copydefault("diffBundle", "isHitDiff success !!!, " + c48860ude2.valueOf() + ": " + c48860ude2 + ",   " + c48860ude3.valueOf() + ": " + c48860ude3);
                                    } catch (java.lang.Exception unused) {
                                    }
                                    z = true;
                                } else {
                                    C7843arV.EZpvd.EZpvd(c48860ude2.valueOf(), "5", c48860ude3.AhwBna(), c48860ude3.AYXKKw(), "fusion error");
                                }
                            } else {
                                C7843arV.EZpvd.EZpvd(c48860ude2.valueOf(), "4", c48860ude3.AhwBna(), c48860ude3.AYXKKw(), "no fit bundle");
                            }
                        } else {
                            C7843arV.EZpvd.EZpvd(c48860ude2.valueOf(), "3", c48860ude3.AhwBna(), c48860ude3.AYXKKw(), "no bundle");
                        }
                    } else {
                        C7843arV.EZpvd.EZpvd(c48860ude2.valueOf(), "1", c48860ude3.AhwBna(), c48860ude3.AYXKKw(), "not hit abtest");
                    }
                }
            }
            if (C43042rhn.AEQbTJ.AEQbTJ().contains(str) && !fetchVPNInfo(c48860ude2.valueOf())) {
                C7843arV.EZpvd.EZpvd(c48860ude2.valueOf(), "1", c48860ude2.AhwBna(), "", "not hit abtest");
            }
            if (!z) {
                arrayList.add(c48860ude2);
            }
        }
        java.util.Iterator<T> it = EZpvd(arrayList2, arrayList3).iterator();
        while (it.hasNext()) {
            arrayList.add((C48860ude) it.next());
        }
        return arrayList;
    }

    public final java.util.List<C48860ude> EZpvd(java.util.List<C48860ude> list, java.util.List<C48860ude> list2) {
        java.util.ArrayList<C48860ude> arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C48860ude) it.next()).valueOf());
        }
        for (C48860ude c48860ude : list2) {
            if (!arrayList3.contains(C43042rhn.AEQbTJ.copydefault(c48860ude.valueOf()))) {
                arrayList.add(c48860ude);
            }
        }
        for (C48860ude c48860ude2 : arrayList) {
            java.lang.String strCopydefault = C43042rhn.AEQbTJ.copydefault(c48860ude2.valueOf());
            java.lang.String strAYXKKw = AYXKKw(strCopydefault);
            if (!fetchVPNInfo(strCopydefault)) {
                C7843arV.EZpvd.EZpvd(strCopydefault, "1", c48860ude2.AhwBna(), c48860ude2.AYXKKw(), "not hit abtest");
            } else if (strAYXKKw != null) {
                if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) c48860ude2.AYXKKw())) {
                    if (AEQbTJ(strCopydefault)) {
                        arrayList2.add(c48860ude2);
                        C7843arV.EZpvd.EZpvd(strCopydefault, "0", c48860ude2.AhwBna(), c48860ude2.AYXKKw(), "isHitDiff success!!!");
                        try {
                            pUU.copydefault("diffBundle", "isHitDiff success !!!, " + strCopydefault + ": none,   " + c48860ude2.valueOf() + ": " + c48860ude2);
                        } catch (java.lang.Exception unused) {
                        }
                    } else {
                        C7843arV.EZpvd.EZpvd(strCopydefault, "5", c48860ude2.AhwBna(), c48860ude2.AYXKKw(), "fusion error");
                    }
                } else {
                    C7843arV.EZpvd.EZpvd(strCopydefault, "4", c48860ude2.AhwBna(), c48860ude2.AYXKKw(), "no fit bundle");
                }
            } else {
                C7843arV.EZpvd.EZpvd(strCopydefault, "3", c48860ude2.AhwBna(), c48860ude2.AYXKKw(), "no bundle");
            }
        }
        return arrayList2;
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("error_times_");
        sb.append(str);
        return SPUtils.getInt(sb.toString(), 0, "miniapp_diff_sp").intValue() < 2;
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = "error_times_" + str;
        SPUtils.put(str2, java.lang.Integer.valueOf(SPUtils.getInt(str2, 0, "miniapp_diff_sp").intValue() + 1), "miniapp_diff_sp");
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put("error_times_" + str, (java.lang.Object) 0, "miniapp_diff_sp");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x02c6 A[Catch: Exception -> 0x0386, TryCatch #3 {Exception -> 0x0386, blocks: (B:59:0x0257, B:61:0x025d, B:62:0x0261, B:64:0x0267, B:66:0x02a5, B:70:0x02c0, B:72:0x02c6, B:73:0x02ca, B:75:0x02d0, B:77:0x0310, B:79:0x0316, B:83:0x0333, B:85:0x0339, B:86:0x033d, B:88:0x0343, B:90:0x036a), top: B:150:0x0257 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x032f A[PHI: r0
  0x032f: PHI (r0v24 java.lang.String) = (r0v23 java.lang.String), (r0v35 java.lang.String) binds: [B:71:0x02c4, B:162:0x032f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0339 A[Catch: Exception -> 0x0386, TryCatch #3 {Exception -> 0x0386, blocks: (B:59:0x0257, B:61:0x025d, B:62:0x0261, B:64:0x0267, B:66:0x02a5, B:70:0x02c0, B:72:0x02c6, B:73:0x02ca, B:75:0x02d0, B:77:0x0310, B:79:0x0316, B:83:0x0333, B:85:0x0339, B:86:0x033d, B:88:0x0343, B:90:0x036a), top: B:150:0x0257 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x037f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(@NotNull final C48860ude c48860ude, @NotNull java.lang.String str, @NotNull final C7841arT c7841arT, final AbstractC48864udi.ActionBar actionBar) {
        int i;
        AppDiffJson appDiffJson;
        java.lang.String str2;
        boolean z;
        java.lang.String str3;
        boolean z2;
        java.util.List<java.lang.String> modified;
        java.lang.String str4;
        java.util.List<java.lang.String> deleted;
        java.io.File file;
        Intrinsics.checkNotNullParameter(c48860ude, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c7841arT, "");
        java.lang.String strCopydefault = c48860ude.copydefault();
        final java.lang.String strEZpvd = c48860ude.EZpvd();
        final java.lang.String strKWHzl = c48860ude.KWHzl();
        pUU.copydefault("diffBundle", "diff bundle begin combine! resource content is: " + c48860ude);
        final java.lang.String strCopydefault2 = C43042rhn.AEQbTJ.copydefault(strCopydefault);
        if (strKWHzl == null || strKWHzl.length() == 0 || strCopydefault2.length() == 0) {
            OLrzqt(new MiniAppUpdateError(306, (strKWHzl == null || strKWHzl.length() == 0) ? "fitVersion is null" : "realAppId isEmpty", null, 4, null), c7841arT, actionBar, strCopydefault2, strEZpvd, (java.lang.String) null);
            return;
        }
        java.io.File fileValueOf = valueOf();
        java.lang.String str5 = java.io.File.separator;
        java.io.File file2 = new java.io.File(fileValueOf, strCopydefault2 + str5 + strKWHzl);
        if (!file2.exists()) {
            OLrzqt(new MiniAppUpdateError(306, "diff bundle localBundle not exist", null, 4, null), c7841arT, actionBar, strCopydefault2, strEZpvd, strKWHzl);
            return;
        }
        java.io.File file3 = new java.io.File(valueOf(), strCopydefault2 + str5 + strEZpvd);
        if (!new java.io.File(str).exists() && file3.exists() && Intrinsics.EZpvd((java.lang.Object) AYXKKw(strCopydefault2), (java.lang.Object) strEZpvd)) {
            pUU.copydefault("diffBundle", "diff bundle repeat deal, direct call onSuccess");
            if (actionBar != null) {
                java.lang.String path = file3.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "");
                actionBar.EZpvd(path);
            }
            c7841arT.AEQbTJ();
            return;
        }
        if (!new java.io.File(str, "diff.json").exists()) {
            OLrzqt(new MiniAppUpdateError(306, "diff bundle diff.json not exist", null, 4, null), c7841arT, actionBar, strCopydefault2, strEZpvd, strKWHzl);
            return;
        }
        try {
            pUU.copydefault("diffBundle", "diff.json content: " + yFI.readText$default(new java.io.File(str, "diff.json"), null, 1, null));
        } catch (java.lang.Exception unused) {
        }
        java.io.File file4 = new java.io.File(str, "_ok_all_file_count.txt");
        if (!file4.exists()) {
            OLrzqt(new MiniAppUpdateError(306, "diff bundle _ok_all_file_count.txt not exist", null, 4, null), c7841arT, actionBar, strCopydefault2, strEZpvd, strKWHzl);
            return;
        }
        try {
            i = java.lang.Integer.parseInt(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) yFI.readText$default(file4, null, 1, null)).toString());
        } catch (java.lang.Exception unused2) {
            i = -1;
        }
        pUU.copydefault("diffBundle", "_ok_all_file_count: " + i);
        java.io.File file5 = new java.io.File(valueOf(), strCopydefault2 + "fusion");
        if (file5.exists()) {
            yFL.AkhnZx(file5);
        }
        file5.mkdirs();
        try {
            boolean zCopyRecursively$default = yFL.copyRecursively$default(new java.io.File(str), new java.io.File(file5, strEZpvd), true, null, 4, null);
            if (yFL.copyRecursively$default(file2, new java.io.File(file5, strKWHzl), true, null, 4, null) && !(!zCopyRecursively$default)) {
                try {
                    file = new java.io.File(file5, strEZpvd + java.io.File.separator + "diff.json");
                } catch (java.lang.Exception unused3) {
                }
                if (file.exists()) {
                    appDiffJson = null;
                    try {
                        java.lang.String text$default = yFI.readText$default(file, null, 1, null);
                        pUU.copydefault("diffBundle", "diffJson content confirm: " + text$default);
                        appDiffJson = (AppDiffJson) new Gson().fromJson(text$default, AppDiffJson.class);
                    } catch (java.lang.Exception unused4) {
                    }
                } else {
                    appDiffJson = null;
                }
                if (appDiffJson == null) {
                    OLrzqt(new MiniAppUpdateError(306, "diff.json gson parse fail", null, 4, null), c7841arT, actionBar, strCopydefault2, strEZpvd, strKWHzl);
                    return;
                }
                try {
                    pUU.copydefault("diffBundle", "diffJson parse complete!, appDiff: " + appDiffJson);
                } catch (java.lang.Exception unused5) {
                }
                try {
                    java.util.List<java.lang.String> added = appDiffJson.getAdded();
                    if (added != null) {
                        java.util.Iterator<java.lang.String> it = added.iterator();
                        while (it.hasNext()) {
                            java.lang.String next = it.next();
                            java.lang.String str6 = java.io.File.separator;
                            java.io.File file6 = new java.io.File(file5, strEZpvd + str6 + next);
                            java.util.Iterator<java.lang.String> it2 = it;
                            java.io.File file7 = new java.io.File(file5, strKWHzl + str6 + next);
                            if (!file6.exists()) {
                                str3 = "combine add operation fail，diffFile not exist";
                                z2 = false;
                                break;
                            } else {
                                yFL.copyTo$default(file6, file7, true, 0, 4, null);
                                it = it2;
                            }
                        }
                        str3 = "";
                        z2 = true;
                        modified = appDiffJson.getModified();
                        if (modified == null) {
                            java.util.Iterator<java.lang.String> it3 = modified.iterator();
                            while (it3.hasNext()) {
                                java.lang.String next2 = it3.next();
                                java.lang.String str7 = java.io.File.separator;
                                java.lang.String str8 = str3;
                                java.io.File file8 = new java.io.File(file5, strEZpvd + str7 + next2);
                                java.util.Iterator<java.lang.String> it4 = it3;
                                java.io.File file9 = new java.io.File(file5, strKWHzl + str7 + next2);
                                if (!file8.exists() || !file9.exists()) {
                                    str4 = "combine modify operation fail, diffFile or destFile not exist";
                                    z2 = false;
                                    break;
                                } else {
                                    yFL.copyTo$default(file8, file9, true, 0, 4, null);
                                    str3 = str8;
                                    it3 = it4;
                                }
                            }
                            str4 = str3;
                            deleted = appDiffJson.getDeleted();
                            if (deleted == null) {
                                for (java.lang.String str9 : deleted) {
                                    java.lang.String str10 = str4;
                                    java.io.File file10 = new java.io.File(file5, strKWHzl + java.io.File.separator + str9);
                                    if (!file10.exists() || !yFL.AkhnZx(file10)) {
                                        str4 = "combine delete operation fail, destFile not exist";
                                        z = false;
                                        break;
                                    }
                                    str4 = str10;
                                }
                                z = z2;
                                str2 = str4;
                            } else {
                                str2 = str4;
                                z = z2;
                            }
                        } else {
                            str4 = str3;
                            deleted = appDiffJson.getDeleted();
                            if (deleted == null) {
                            }
                        }
                    } else {
                        str3 = "";
                        z2 = true;
                        modified = appDiffJson.getModified();
                        if (modified == null) {
                        }
                    }
                } catch (java.lang.Exception e) {
                    java.lang.String message = e.getMessage();
                    if (message == null) {
                        message = "combine operation io fail";
                    }
                    str2 = message;
                    z = false;
                }
                if (!z) {
                    OLrzqt(new MiniAppUpdateError(306, str2, null, 4, null), c7841arT, actionBar, strCopydefault2, strEZpvd, strKWHzl);
                    return;
                }
                java.io.File file11 = new java.io.File(file5, strKWHzl);
                final java.io.File file12 = new java.io.File(valueOf(), strCopydefault2 + java.io.File.separator + strEZpvd);
                if (file12.exists()) {
                    yFL.AkhnZx(file12);
                }
                if (file11.exists()) {
                    try {
                        if (yFL.copyRecursively$default(file11, file12, true, null, 4, null)) {
                            if (EZpvd(file12, i)) {
                                java.lang.String path2 = file12.getPath();
                                Intrinsics.checkNotNullExpressionValue(path2, "");
                                final AppDiffJson appDiffJson2 = appDiffJson;
                                checkUpdateResult$default(this, path2, c48860ude, null, new Function0() { // from class: o.rhF
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return C43046rhr.KWHzl(this.KWHzl, strCopydefault2, c48860ude, appDiffJson2, file12, actionBar, c7841arT, strEZpvd, strKWHzl);
                                    }
                                }, new Function1() { // from class: o.rhz
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return C43046rhr.KWHzl(file12, this, c7841arT, actionBar, strCopydefault2, strEZpvd, strKWHzl, (MiniAppUpdateError) obj);
                                    }
                                }, 4, null);
                                return;
                            }
                            if (file12.exists()) {
                                yFL.AkhnZx(file12);
                            }
                            OLrzqt(new MiniAppUpdateError(306, "final combine all file count doesn't match expectCount", null, 4, null), c7841arT, actionBar, strCopydefault2, strEZpvd, strKWHzl);
                            return;
                        }
                    } catch (java.lang.Exception unused6) {
                    }
                    if (file12.exists()) {
                        yFL.AkhnZx(file12);
                    }
                    OLrzqt(new MiniAppUpdateError(306, "final combined bundle copy to dest error", null, 4, null), c7841arT, actionBar, strCopydefault2, strEZpvd, strKWHzl);
                    return;
                }
                OLrzqt(new MiniAppUpdateError(306, "fusion combinedFile not exist", null, 4, null), c7841arT, actionBar, strCopydefault2, strEZpvd, strKWHzl);
                return;
            }
        } catch (java.lang.Exception unused7) {
        }
        OLrzqt(new MiniAppUpdateError(306, "diff bundle or local bundle copy to fusion path fail", null, 4, null), c7841arT, actionBar, strCopydefault2, strEZpvd, strKWHzl);
    }

    public static final Unit KWHzl(C43046rhr c43046rhr, java.lang.String str, C48860ude c48860ude, AppDiffJson appDiffJson, java.io.File file, AbstractC48864udi.ActionBar actionBar, C7841arT c7841arT, java.lang.String str2, java.lang.String str3) {
        java.lang.String strAhwBna = c48860ude.AhwBna();
        java.lang.String fullpackagemd5 = appDiffJson.getFullpackagemd5();
        java.lang.String str4 = fullpackagemd5 == null ? "" : fullpackagemd5;
        java.lang.String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "");
        c43046rhr.OLrzqt(str, strAhwBna, str4, path, c48860ude);
        if (actionBar != null) {
            java.lang.String path2 = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path2, "");
            actionBar.EZpvd(path2);
        }
        c7841arT.AEQbTJ();
        c43046rhr.OLrzqt(str);
        C7843arV.EZpvd.EZpvd(str, true, str2, str3, "combine success!!!");
        pUU.copydefault("diffBundle", "combine success!!!");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.io.File file, C43046rhr c43046rhr, C7841arT c7841arT, AbstractC48864udi.ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.String str3, MiniAppUpdateError miniAppUpdateError) {
        Intrinsics.checkNotNullParameter(miniAppUpdateError, "");
        if (file.exists()) {
            yFL.AkhnZx(file);
        }
        c43046rhr.OLrzqt(miniAppUpdateError, c7841arT, actionBar, str, str2, str3);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull MiniAppUpdateError miniAppUpdateError, @NotNull C7841arT c7841arT, AbstractC48864udi.ActionBar actionBar, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(miniAppUpdateError, "");
        Intrinsics.checkNotNullParameter(c7841arT, "");
        Intrinsics.checkNotNullParameter(str, "");
        c7841arT.KWHzl(miniAppUpdateError);
        if (actionBar != null) {
            actionBar.OLrzqt(miniAppUpdateError);
        }
        C7843arV.EZpvd.EZpvd(str, false, str2, str3, miniAppUpdateError.getMessage());
        OLrzqt(str);
        EZpvd(str);
        java.lang.String message = miniAppUpdateError.getMessage();
        pUU.copydefault("diffBundle", message != null ? message : "");
    }

    public final void OLrzqt(java.lang.String str) {
        try {
            java.io.File file = new java.io.File(valueOf(), str + "fusion");
            java.io.File file2 = new java.io.File(valueOf(), str + "diff");
            if (file.exists()) {
                yFL.AkhnZx(file);
            }
            if (file2.exists()) {
                yFL.AkhnZx(file2);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final boolean EZpvd(@NotNull java.io.File file, int i) {
        int iOLrzqt;
        Intrinsics.checkNotNullParameter(file, "");
        try {
            iOLrzqt = OLrzqt(file);
            pUU.copydefault("diffBundle", "realFileCount : " + iOLrzqt + " , expectCount: " + i);
        } catch (java.lang.Exception unused) {
        }
        return iOLrzqt == i;
    }

    public final int OLrzqt(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        java.io.File[] fileArrListFiles = file.listFiles();
        int iOLrzqt = 0;
        if (fileArrListFiles != null) {
            java.util.Iterator itEZpvd = yHX.EZpvd(fileArrListFiles);
            while (itEZpvd.hasNext()) {
                java.io.File file2 = (java.io.File) itEZpvd.next();
                if (file2.isDirectory()) {
                    Intrinsics.copydefault(file2);
                    iOLrzqt += OLrzqt(file2);
                } else {
                    iOLrzqt++;
                }
            }
        }
        return iOLrzqt;
    }

    public final C48860ude EZpvd(MiniAppUpdateResp miniAppUpdateResp) {
        return new C48860ude(miniAppUpdateResp.getAppid(), miniAppUpdateResp.getMd5(), miniAppUpdateResp.getVersion(), miniAppUpdateResp.getUrl(), miniAppUpdateResp.getFitVersion());
    }

    public final void OLrzqt(java.util.List<java.lang.String> list, java.util.Map<java.lang.String, java.lang.String> map, boolean z, final Function1<? super java.util.List<C48860ude>, Unit> function1, final Function1<? super java.lang.Throwable, Unit> function12) {
        C33024moe.subscribeOnIO$default(InterfaceC48877udv.Companion.KWHzl(new MiniAppUpdateRequestBody(AEQbTJ(z), list, map)), new Function1() { // from class: o.rhx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43046rhr.EZpvd(function12, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.rhv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43046rhr.KWHzl(function1, function12, this, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit EZpvd(Function1 function1, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        function1.invoke(th);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC43015rhM
    public void KWHzl() {
        SPUtils.remove("miniapp_fs_md5s", "miniapp_sp");
        SPUtils.remove("miniapp_fs_versions", "miniapp_sp");
        SPUtils.clear("miniapp_diff_sp");
        this.EZpvd.clear();
        yFL.AkhnZx(valueOf());
        AEQbTJ().AEQbTJ();
    }

    public static final Unit KWHzl(Function1 function1, Function1 function12, C43046rhr c43046rhr, ResponseData responseData) {
        java.util.Collection collectionAhwBna;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            java.util.List list = (java.util.List) responseData.getData();
            if (list == null) {
                collectionAhwBna = yDY.AhwBna();
            } else {
                collectionAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    collectionAhwBna.add(c43046rhr.EZpvd((MiniAppUpdateResp) it.next()));
                }
            }
            function1.invoke(collectionAhwBna);
        } else {
            function12.invoke(new java.lang.Exception(responseData.getMsg()));
        }
        return Unit.INSTANCE;
    }
}
