package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cVg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11627cVg implements InterfaceC9737bbI {
    public static final C11627cVg KWHzl = new C11627cVg();

    private C11627cVg() {
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Long;Z)Lo/bbC; */
    @Override // o.InterfaceC9737bbI
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C10854bwM copydefault(java.lang.Long l, boolean z) {
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(l);
        return (c10854bwMKWHzl == null && z) ? C10598brV.AEQbTJ.OLrzqt(l) : c10854bwMKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(JZ)Lo/bbC; */
    @Override // o.InterfaceC9737bbI
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C10854bwM AEQbTJ(long j, boolean z) {
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(j);
        return (c10854bwMKWHzl == null && z) ? C10598brV.AEQbTJ.djBIcL(j) : c10854bwMKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/String;Z)Lo/bbC; */
    @Override // o.InterfaceC9737bbI
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C10854bwM EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwMEZpvd = C10954byG.EZpvd.valueOf().EZpvd(str);
        return (c10854bwMEZpvd == null && z) ? C10598brV.AEQbTJ.copydefault(str) : c10854bwMEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(JZ)Lo/bbC; */
    @Override // o.InterfaceC9737bbI
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C10854bwM EZpvd(long j, boolean z) {
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(j);
        return (c10854bwMCopydefault == null && z) ? C10598brV.AEQbTJ.AEQbTJ(j) : c10854bwMCopydefault;
    }

    public final C10854bwM copydefault(long j, boolean z, @NotNull java.lang.String str) {
        C10854bwM c10854bwMKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        if (z && str.length() > 0 && (c10854bwMKWHzl = C10598brV.AEQbTJ.KWHzl(j, str)) != null) {
            return c10854bwMKWHzl;
        }
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(j);
        return (c10854bwMCopydefault == null && z) ? C10598brV.AEQbTJ.KWHzl(j, str) : c10854bwMCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(JZ)Lo/bbC; */
    @Override // o.InterfaceC9737bbI
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public C10854bwM OLrzqt(long j, boolean z) {
        C10854bwM c10854bwMAEQbTJ = C10954byG.EZpvd.valueOf().AEQbTJ(j);
        return (c10854bwMAEQbTJ == null && z) ? C10598brV.AEQbTJ.copydefault(j) : c10854bwMAEQbTJ;
    }

    @Override // o.InterfaceC9737bbI
    public InterfaceC9731bbC AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return C10954byG.EZpvd.valueOf().KWHzl(str, str2);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/String;Z)Lo/bbC; */
    @Override // o.InterfaceC9737bbI
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C10854bwM OLrzqt(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwMAYXKKw = C10954byG.EZpvd.valueOf().AYXKKw(str);
        return (c10854bwMAYXKKw == null && z) ? C10598brV.AEQbTJ.EZpvd(str) : c10854bwMAYXKKw;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/String;JZ)Lo/bbC; */
    @Override // o.InterfaceC9737bbI
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C10854bwM KWHzl(@NotNull java.lang.String str, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwMEZpvd = C10954byG.EZpvd.valueOf().EZpvd(str, j);
        return (c10854bwMEZpvd == null && z) ? C10598brV.AEQbTJ.EZpvd(str, -j) : c10854bwMEZpvd;
    }

    @Override // o.InterfaceC9737bbI
    public java.util.List<InterfaceC9731bbC> copydefault(boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(C10954byG.EZpvd.valueOf().djBIcL());
        if (z) {
            arrayList.addAll(C10598brV.AEQbTJ.values());
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
    }

    @Override // o.InterfaceC9737bbI
    public java.util.List<InterfaceC9731bbC> KWHzl(boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(C10954byG.EZpvd.valueOf().AkhnZx());
        if (z) {
            arrayList.addAll(C10598brV.AEQbTJ.isConnected());
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
    }

    @Override // o.InterfaceC9737bbI
    public java.util.ArrayList<InterfaceC9731bbC> OLrzqt(boolean z) {
        java.util.ArrayList<InterfaceC9731bbC> arrayList = new java.util.ArrayList<>();
        arrayList.addAll(C10954byG.EZpvd.valueOf().DbNXlk());
        if (z) {
            arrayList.addAll(C10598brV.AEQbTJ.KWHzl());
        }
        return arrayList;
    }

    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Lo/bbC; */
    @Override // o.InterfaceC9737bbI
    /* JADX INFO: renamed from: isConnected, reason: merged with bridge method [inline-methods] */
    public C10854bwM gEmmrt() {
        return C10954byG.EZpvd.valueOf().iwGUEr();
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/bbC; */
    @Override // o.InterfaceC9737bbI
    /* JADX INFO: renamed from: AkhnZx, reason: merged with bridge method [inline-methods] */
    public C10854bwM EZpvd() {
        return C10954byG.EZpvd.valueOf().hDKMBd();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/bbC; */
    @Override // o.InterfaceC9737bbI
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public C10854bwM OLrzqt() {
        return C10954byG.EZpvd.valueOf().AEQbTJ();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Lo/bbC; */
    @Override // o.InterfaceC9737bbI
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public C10854bwM AEQbTJ() {
        return C10954byG.EZpvd.valueOf().uzCIH();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/bbC; */
    @Override // o.InterfaceC9737bbI
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public C10854bwM KWHzl() {
        return C10954byG.EZpvd.valueOf().EZpvd();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/bbC; */
    @Override // o.InterfaceC9737bbI
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public C10854bwM copydefault() {
        return C10954byG.EZpvd.valueOf().copydefault();
    }
}
