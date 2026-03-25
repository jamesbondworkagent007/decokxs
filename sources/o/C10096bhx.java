package o;

import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C10026bgg;
import o.C10407bnq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bhx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C10096bhx extends AbstractC33073mpa {
    public java.lang.String EZpvd;
    public final C10407bnq KWHzl;
    public java.util.ArrayList<C10026bgg.TaskDescription> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C10096bhx() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.util.ArrayList<C10026bgg.TaskDescription> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.OLrzqt = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.bnq:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bnq:0x0007: INVOKE 
  (wrap:o.bnq$ActionBar:0x0004: SGET  A[WRAPPED] (LINE:8) o.bnq.Companion o.bnq$ActionBar)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.bnq.ActionBar.getInstance$default(o.bnq$ActionBar, android.content.Context, int, java.lang.Object):o.bnq A[MD:(o.bnq$ActionBar, android.content.Context, int, java.lang.Object):o.bnq (m), WRAPPED] (LINE:8)) : (r1v0 o.bnq))
 A[MD:(o.bnq):void (m)] (LINE:7) call: o.bhx.<init>(o.bnq):void type: THIS */
    public /* synthetic */ C10096bhx(C10407bnq c10407bnq, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null) : c10407bnq);
    }

    public C10096bhx(@NotNull C10407bnq c10407bnq) {
        Intrinsics.checkNotNullParameter(c10407bnq, "");
        this.KWHzl = c10407bnq;
        this.EZpvd = "";
        this.OLrzqt = new java.util.ArrayList<>();
    }

    public final java.util.ArrayList<C10026bgg.TaskDescription> copydefault(@NotNull java.util.ArrayList<C10026bgg.TaskDescription> arrayList, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<C10026bgg.TaskDescription> arrayList2 = new java.util.ArrayList<>();
        if (str.length() == 0) {
            arrayList2.addAll(arrayList);
        } else {
            arrayList2.addAll(OLrzqt(arrayList, str));
        }
        this.EZpvd = str;
        this.OLrzqt = arrayList2;
        return arrayList2;
    }

    public final java.util.List<C10026bgg.TaskDescription> OLrzqt(java.util.List<C10026bgg.TaskDescription> list, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (C10026bgg.TaskDescription taskDescription : list) {
            java.lang.String strIsConnected = taskDescription.isConnected();
            if (C59449zhJ.gEmmrt(strIsConnected, str, true)) {
                arrayList.add(taskDescription);
            } else if (C59449zhJ.AYXKKw(strIsConnected, str, true)) {
                arrayList2.add(taskDescription);
            } else if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) strIsConnected, (java.lang.CharSequence) str, true)) {
                arrayList3.add(taskDescription);
            }
        }
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList, (java.lang.Iterable) arrayList2), (java.lang.Iterable) arrayList3);
    }

    public final void OLrzqt(@NotNull final java.util.ArrayList<C10026bgg.TaskDescription> arrayList, @NotNull final C10026bgg.TaskDescription taskDescription, @NotNull final yHO<? super java.lang.Integer, ? super java.lang.Boolean, ? super java.lang.Boolean, Unit> yho) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(yho, "");
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtCopydefault = this.KWHzl.copydefault(taskDescription.AhwBna(), true);
        final Function1 function1 = new Function1() { // from class: o.bhA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10096bhx.OLrzqt(arrayList, taskDescription, this, yho, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<java.lang.Long>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bhy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10096bhx.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.bhz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10096bhx.copydefault((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bhE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10096bhx.KWHzl(function12, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.util.ArrayList arrayList, C10026bgg.TaskDescription taskDescription, C10096bhx c10096bhx, yHO yho, java.util.List list) {
        try {
            arrayList.remove(taskDescription);
            int iIndexOf = c10096bhx.OLrzqt.indexOf(taskDescription);
            if (iIndexOf >= 0) {
                c10096bhx.OLrzqt.remove(iIndexOf);
                yho.invoke(java.lang.Integer.valueOf(iIndexOf), java.lang.Boolean.valueOf(arrayList.isEmpty()), java.lang.Boolean.valueOf(c10096bhx.OLrzqt.isEmpty()));
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("openCoin error: " + e.getMessage());
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }
}
