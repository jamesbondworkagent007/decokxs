package o;

import com.okinc.business.defi.biz.database.extra.entity.DeletedWalletEntity;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cId, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11274cId {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final InterfaceC11269cHz AEQbTJ;

    /* JADX INFO: renamed from: o.cId$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cId.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C11274cId getInstance$default(Activity activity, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return activity.AEQbTJ(context);
        }

        public final C11274cId AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).AkhnZx();
        }
    }

    public C11274cId(@NotNull InterfaceC11269cHz interfaceC11269cHz) {
        Intrinsics.checkNotNullParameter(interfaceC11269cHz, "");
        this.AEQbTJ = interfaceC11269cHz;
    }

    public final AbstractC58260yxt<java.util.List<DeletedWalletEntity>> KWHzl(final int i) {
        AbstractC58260yxt<java.util.List<DeletedWalletEntity>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cIl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11274cId.copydefault(this.OLrzqt, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List copydefault(C11274cId c11274cId, int i) {
        return c11274cId.AEQbTJ.EZpvd(i);
    }

    public final AbstractC58260yxt<java.lang.Integer> AEQbTJ(@NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cIi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11274cId.copydefault(this.AEQbTJ, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.Integer copydefault(C11274cId c11274cId, java.util.List list) {
        return java.lang.Integer.valueOf(c11274cId.AEQbTJ.AEQbTJ(list));
    }

    public final AbstractC58260yxt<java.lang.Integer> OLrzqt() {
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cIj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11274cId.EZpvd(this.OLrzqt);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.Integer EZpvd(C11274cId c11274cId) {
        return java.lang.Integer.valueOf(c11274cId.AEQbTJ.copydefault());
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> OLrzqt(@NotNull final java.util.List<DeletedWalletEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cIh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11274cId.AEQbTJ(this.KWHzl, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List AEQbTJ(C11274cId c11274cId, java.util.List list) {
        return c11274cId.AEQbTJ.EZpvd((java.util.List<DeletedWalletEntity>) list);
    }

    public final AbstractC58260yxt<java.lang.Integer> copydefault(@NotNull final java.util.List<DeletedWalletEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cIk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11274cId.gEmmrt(this.AEQbTJ, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer gEmmrt(C11274cId c11274cId, java.util.List list) {
        return java.lang.Integer.valueOf(c11274cId.AEQbTJ.OLrzqt(list));
    }
}
