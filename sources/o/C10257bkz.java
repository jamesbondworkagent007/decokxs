package o;

import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.Bitmap;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bkz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10257bkz extends AbstractC33073mpa {
    public final MutableLiveData<Bitmap<java.util.List<C10219bkN>>> AEQbTJ = new MutableLiveData<>();
    public final C32941mnA<AbstractC12782ctV> copydefault = new C32941mnA<>();
    public java.lang.String KWHzl = "";
    public java.lang.String EZpvd = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32941mnA<AbstractC12782ctV> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Bitmap<java.util.List<C10219bkN>>> OLrzqt() {
        return this.AEQbTJ;
    }

    public final void AEQbTJ() {
        this.AEQbTJ.setValue(new Bitmap.TaskDescription());
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtOLrzqt = copydefault().OLrzqt(yBP.KWHzl());
        final Function1 function1 = new Function1() { // from class: o.bky
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10257bkz.KWHzl(this.OLrzqt, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bkA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10257bkz.gEmmrt(function1, obj);
            }
        }).OLrzqt(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.bkx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10257bkz.djBIcL(this.EZpvd, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bkC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10257bkz.valueOf(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.bkD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10257bkz.AEQbTJ(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58260yxtOLrzqt2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bkE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10257bkz.djBIcL(function13, obj);
            }
        }));
    }

    public static final java.util.List gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List KWHzl(C10257bkz c10257bkz, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String strAEQbTJ = C10953byF.KWHzl.AEQbTJ(c10257bkz.KWHzl);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10219bkN((AbstractC12782ctV) it.next(), c10257bkz.KWHzl, strAEQbTJ));
        }
        return arrayList;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(C10257bkz c10257bkz, java.util.List list) {
        c10257bkz.AEQbTJ.setValue(new Bitmap.StateListAnimator(list));
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C10257bkz c10257bkz, java.lang.Throwable th) {
        c10257bkz.AEQbTJ.setValue(new Bitmap.ActionBar(th.getMessage(), null, 2, null));
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.copydefault.setValue(abstractC12782ctV);
    }

    public static final java.util.List EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.List<o.ctV>> */
    public final AbstractC58260yxt<java.util.List<AbstractC12782ctV>> copydefault() {
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtAkhnZx = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AkhnZx(this.KWHzl);
        final Function1 function1 = new Function1() { // from class: o.bkB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10257bkz.AEQbTJ(this.OLrzqt, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtAkhnZx.copydefault(new InterfaceC58229yxO() { // from class: o.bkF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10257bkz.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List AEQbTJ(C10257bkz c10257bkz, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
            if (!Intrinsics.EZpvd((java.lang.Object) c10257bkz.EZpvd, (java.lang.Object) "eosOpen") || abstractC12782ctV.AubY() || abstractC12782ctV.AwvSrB()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
