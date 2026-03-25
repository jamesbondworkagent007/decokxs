package o;

import com.immomo.mls.ScriptStateListener;
import com.okinc.mln.miniapp.AppJson;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC48864udi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rhu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43049rhu {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final TaskDescription AEQbTJ;
    public final java.lang.String AhwBna;
    public final android.content.Context KWHzl;
    public final java.lang.Boolean OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;

    /* JADX INFO: renamed from: o.rhu$TaskDescription */
    public interface TaskDescription {
        void AEQbTJ(@NotNull C43045rhq c43045rhq, @NotNull java.lang.String str, @NotNull java.lang.String str2, com.okinc.mln.miniapp.Config config, @NotNull java.util.Map<java.lang.String, java.lang.String> map);

        void EZpvd();

        void EZpvd(long j, long j2);

        void EZpvd(@NotNull ScriptStateListener.Reason reason, @NotNull java.lang.String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    public C43049rhu(@NotNull android.content.Context context, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.KWHzl = context;
        this.AEQbTJ = taskDescription;
        this.copydefault = (java.lang.String) map.get("appid");
        this.AhwBna = (java.lang.String) map.get("pageurl");
        this.djBIcL = (java.lang.String) map.get("minversion");
        this.OLrzqt = java.lang.Boolean.valueOf(Intrinsics.EZpvd(map.get("checkupdate"), (java.lang.Object) "1"));
    }

    public final void EZpvd() {
        java.lang.String str;
        java.lang.String str2 = this.copydefault;
        if (str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2) || (str = this.AhwBna) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            this.AEQbTJ.EZpvd(ScriptStateListener.Reason.PREPARE_FAILED, "Invalid appId or pageUrl");
            return;
        }
        AppJson appJsonKWHzl = C43047rhs.AEQbTJ.KWHzl(this.copydefault);
        if (Intrinsics.EZpvd(this.OLrzqt, java.lang.Boolean.TRUE)) {
            startUpdate$default(this, appJsonKWHzl != null ? appJsonKWHzl.getVersion() : null, null, 2, null);
            return;
        }
        if (appJsonKWHzl == null) {
            startUpdate$default(this, null, this.djBIcL, 1, null);
            return;
        }
        java.lang.String version = appJsonKWHzl.getVersion();
        if (C48833udD.copydefault(version, this.djBIcL) < 0) {
            AEQbTJ(version, this.djBIcL);
        } else {
            EZpvd(appJsonKWHzl);
        }
    }

    public final void EZpvd(AppJson appJson) {
        java.util.Map mapKWHzl;
        com.okinc.mln.miniapp.Config appConfig;
        try {
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) URLDecoder.decode(this.AhwBna, com.google.android.exoplayer2.C.UTF8_NAME), new char[]{'?'}, false, 0, 6, (java.lang.Object) null);
            java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(listSplit$default);
            if (listSplit$default.size() > 1) {
                java.util.List listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) CollectionsKt___CollectionsKt.AubY(listSplit$default), new char[]{'&'}, false, 0, 6, (java.lang.Object) null);
                java.util.ArrayList<java.util.List> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default2, 10));
                java.util.Iterator it = listSplit$default2.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringsKt__StringsKt.split$default((java.lang.CharSequence) it.next(), new char[]{'='}, false, 0, 6, (java.lang.Object) null));
                }
                mapKWHzl = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
                for (java.util.List list : arrayList) {
                    kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(list.get(0), list.get(1));
                    mapKWHzl.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                }
            } else {
                mapKWHzl = C56424yEw.KWHzl();
            }
            kotlin.Pair pair = new kotlin.Pair(str, mapKWHzl);
            java.lang.String str2 = (java.lang.String) pair.component1();
            java.util.Map<java.lang.String, java.lang.String> map = (java.util.Map) pair.component2();
            C7870arw.KWHzl("[MiniApp]", "input path and params:", str2, map);
            java.util.Map<java.lang.String, java.lang.String> pages = appJson.getPages();
            java.lang.String str3 = pages != null ? pages.get(str2) : null;
            if (str3 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) {
                C7870arw.EZpvd("[MiniApp]", "unknown path: " + str2);
                this.AEQbTJ.EZpvd(ScriptStateListener.Reason.PREPARE_FAILED, "Unknown path " + str2);
                return;
            }
            C7870arw.KWHzl("[MiniApp]", "filepath:", str3);
            C43047rhs c43047rhs = C43047rhs.AEQbTJ;
            java.lang.String str4 = this.copydefault;
            Intrinsics.copydefault((java.lang.Object) str4);
            C43045rhq c43045rhqAEQbTJ = c43047rhs.AEQbTJ(str4);
            TaskDescription taskDescription = this.AEQbTJ;
            java.lang.String version = appJson.getVersion();
            java.util.Map<java.lang.String, com.okinc.mln.miniapp.Config> pageConfig = appJson.getPageConfig();
            if (pageConfig == null || (appConfig = pageConfig.get(str2)) == null) {
                appConfig = appJson.getAppConfig();
            }
            taskDescription.AEQbTJ(c43045rhqAEQbTJ, version, str3, appConfig, map);
        } catch (java.lang.Exception e) {
            C7870arw.AEQbTJ(e, "[MiniApp]", "Invalid Url: " + this.AhwBna);
            this.AEQbTJ.EZpvd(ScriptStateListener.Reason.PREPARE_FAILED, "Invalid Url: " + this.AhwBna + ", " + e.getMessage());
        }
    }

    public static /* synthetic */ boolean tryFindUsableBundle$default(C43049rhu c43049rhu, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c43049rhu.OLrzqt(str, str2);
    }

    public final boolean OLrzqt(java.lang.String str, java.lang.String str2) {
        AppJson appJsonKWHzl = C43047rhs.AEQbTJ.KWHzl(str);
        if (appJsonKWHzl == null || C48833udD.copydefault(appJsonKWHzl.getVersion(), str2) < 0) {
            return false;
        }
        C7870arw.KWHzl("[MiniApp]", "found usable bundle, version:", appJsonKWHzl.getVersion());
        EZpvd(appJsonKWHzl);
        return true;
    }

    public static /* synthetic */ void startUpdate$default(C43049rhu c43049rhu, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        c43049rhu.AEQbTJ(str, str2);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        C7870arw.KWHzl("[MiniApp]", "startUpdate currentVersion: " + str + ", minVersion: " + str2);
        this.AEQbTJ.EZpvd();
        C43047rhs c43047rhs = C43047rhs.AEQbTJ;
        java.lang.String str3 = this.copydefault;
        Intrinsics.copydefault((java.lang.Object) str3);
        c43047rhs.copydefault(str3, str, str2, false, new ActionBar(str2));
    }

    /* JADX INFO: renamed from: o.rhu$ActionBar */
    public static final class ActionBar implements AbstractC48864udi.ActionBar {
        public final /* synthetic */ java.lang.String AEQbTJ;

        public ActionBar(java.lang.String str) {
            this.AEQbTJ = str;
        }

        @Override // o.AbstractC48864udi.ActionBar
        public void EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C7870arw.KWHzl("[MiniApp]", "updateMiniApp success");
            C43049rhu c43049rhu = C43049rhu.this;
            if (c43049rhu.OLrzqt(c43049rhu.OLrzqt(), this.AEQbTJ)) {
                return;
            }
            C43049rhu.this.AEQbTJ.EZpvd(ScriptStateListener.Reason.PREPARE_FAILED, "download parse json failed");
        }

        @Override // o.AbstractC48864udi.ActionBar
        public void OLrzqt(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            C7870arw.KWHzl(th, "[MiniApp]", "updateMiniApp error");
            C43049rhu c43049rhu = C43049rhu.this;
            if (c43049rhu.OLrzqt(c43049rhu.OLrzqt(), this.AEQbTJ)) {
                return;
            }
            C43049rhu.this.AEQbTJ.EZpvd(ScriptStateListener.Reason.DOWNLOAD_FAILED, "download error, " + th.getMessage());
        }

        @Override // o.AbstractC48864udi.ActionBar
        public void AEQbTJ(long j, long j2) {
            C43049rhu.this.AEQbTJ.EZpvd(j, j2);
        }
    }

    /* JADX INFO: renamed from: o.rhu$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rhu.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
