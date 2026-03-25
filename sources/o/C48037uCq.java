package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uCq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48037uCq extends C43265rly {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.uCt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C48037uCq.copydefault();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return true;
    }

    /* JADX INFO: renamed from: o.uCq$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uCq.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.util.List<InterfaceC54415xHo> djBIcL() {
        return (java.util.List) this.EZpvd.getValue();
    }

    public static final java.util.List copydefault() {
        return yDY.gEmmrt(C54417xHq.AEQbTJ, C54425xHy.OLrzqt, C54418xHr.EZpvd, C54412xHl.EZpvd, C54421xHu.OLrzqt, C54420xHt.copydefault, C54423xHw.EZpvd, C54422xHv.OLrzqt, C54413xHm.copydefault, C54414xHn.KWHzl, C54424xHx.KWHzl, C54416xHp.OLrzqt, C54419xHs.EZpvd);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        interfaceC43253rlm.copydefault(uBU.class, new C48039uCs());
    }

    public static final C51000vek AYXKKw() {
        return new C51000vek();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        InterfaceC56387yDm<? extends InterfaceC43234rlT> interfaceC56387yDmCopydefault = C56392yDr.copydefault(new Function0() { // from class: o.uCu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48037uCq.AYXKKw();
            }
        });
        java.util.Iterator<T> it = djBIcL().iterator();
        while (it.hasNext()) {
            interfaceC43237rlW.copydefault((InterfaceC54415xHo) it.next(), interfaceC56387yDmCopydefault);
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        C7381aik.Companion.AEQbTJ(this, C56392yDr.copydefault(new Function0() { // from class: o.uCv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48037uCq.AhwBna();
            }
        }));
        interfaceC43299rmf.EZpvd(InterfaceC33530myG.class, C56392yDr.copydefault(new Function0() { // from class: o.uCr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48037uCq.valueOf();
            }
        }));
    }

    public static final C52021vxy AhwBna() {
        return new C52021vxy();
    }

    public static final C53683wqC valueOf() {
        return new C53683wqC();
    }
}
