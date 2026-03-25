package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yaM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57008yaM {
    public final java.io.File KWHzl;
    public final java.lang.String OLrzqt;
    public final android.content.Context copydefault;

    public C57008yaM(@NotNull android.content.Context context, @NotNull java.io.File file, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = context;
        this.KWHzl = file;
        this.OLrzqt = str;
    }

    public final boolean copydefault(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return new java.io.File(this.KWHzl, str).exists();
    }

    public final AbstractC58260yxt<java.lang.Boolean> AEQbTJ(final java.lang.String str, final java.lang.String str2) {
        if (str == null || str2 == null) {
            AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(java.lang.Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.yaT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C57008yaM.OLrzqt(this.EZpvd, objectRef, str, str2, interfaceC58257yxq);
            }
        }).KWHzl(yBP.AEQbTJ()).OLrzqt(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.yaS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57008yaM.AEQbTJ(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtAEQbTJ = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58227yxM() { // from class: o.yaU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C57008yaM.OLrzqt(function1, obj);
            }
        }).AEQbTJ(new InterfaceC58222yxH() { // from class: o.yaQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C57008yaM.copydefault(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAEQbTJ, "");
        return abstractC58260yxtAEQbTJ;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, o.mqr] */
    public static final void OLrzqt(C57008yaM c57008yaM, Ref.ObjectRef objectRef, java.lang.String str, java.lang.String str2, InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        java.io.File file = new java.io.File(C57140ycm.KWHzl.copydefault(c57008yaM.copydefault), c57008yaM.OLrzqt);
        ?? c33143mqr = new C33143mqr(c57008yaM.copydefault.getApplicationContext(), str, file.getAbsolutePath(), c57008yaM.new Application(interfaceC58257yxq, file, str2));
        c33143mqr.EZpvd();
        objectRef.element = c33143mqr;
    }

    /* JADX INFO: renamed from: o.yaM$Application */
    public static final class Application implements InterfaceC33145mqt {
        public final /* synthetic */ InterfaceC58257yxq<java.lang.Boolean> AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.io.File OLrzqt;

        @Override // o.InterfaceC33145mqt
        public void copydefault(long j, long j2) {
        }

        public Application(InterfaceC58257yxq<java.lang.Boolean> interfaceC58257yxq, java.io.File file, java.lang.String str) {
            this.AEQbTJ = interfaceC58257yxq;
            this.OLrzqt = file;
            this.EZpvd = str;
        }

        @Override // o.InterfaceC33145mqt
        public void EZpvd(int i, java.lang.String str) {
            pUU.copydefault("Ledger", "onError " + i + " " + str);
            C38347pVk.OLrzqt.AEQbTJ(C57008yaM.this.KWHzl);
            this.AEQbTJ.onSuccess(java.lang.Boolean.FALSE);
        }

        @Override // o.InterfaceC33145mqt
        public void copydefault(java.lang.String str) throws java.io.IOException {
            pUU.copydefault("Ledger", "onSuccess " + str);
            C38347pVk.OLrzqt.AEQbTJ(C57008yaM.this.KWHzl);
            C38354pVr.OLrzqt(this.OLrzqt, C57008yaM.this.KWHzl);
            this.OLrzqt.delete();
            new java.io.File(C57008yaM.this.KWHzl, this.EZpvd).createNewFile();
            this.AEQbTJ.onSuccess(java.lang.Boolean.TRUE);
        }
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C57008yaM c57008yaM, java.lang.Throwable th) {
        pUU.copydefault("Ledger", "doOnError " + th.getMessage());
        C38347pVk.OLrzqt.AEQbTJ(c57008yaM.KWHzl);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(Ref.ObjectRef objectRef) {
        pUU.copydefault("Ledger", "doOnDispose");
        C33143mqr c33143mqr = (C33143mqr) objectRef.element;
        if (c33143mqr != null) {
            c33143mqr.copydefault();
        }
    }
}
