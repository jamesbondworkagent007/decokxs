package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.koin.core.error.InstanceCreationException;

/* JADX INFO: renamed from: o.ztK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59982ztK<T> {
    public static final Activity copydefault = new Activity(null);
    public final C59978ztG<T> OLrzqt;

    public abstract T AEQbTJ(@NotNull C59985ztN c59985ztN);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59978ztG<T> OLrzqt() {
        return this.OLrzqt;
    }

    public abstract boolean OLrzqt(C59985ztN c59985ztN);

    public abstract void copydefault(C60060zuj c60060zuj);

    public AbstractC59982ztK(@NotNull C59978ztG<T> c59978ztG) {
        Intrinsics.checkNotNullParameter(c59978ztG, "");
        this.OLrzqt = c59978ztG;
    }

    public T KWHzl(@NotNull C59985ztN c59985ztN) throws InstanceCreationException {
        Intrinsics.checkNotNullParameter(c59985ztN, "");
        c59985ztN.EZpvd().EZpvd("| (+) '" + this.OLrzqt + '\'');
        try {
            C60053zuc c60053zucCopydefault = c59985ztN.copydefault();
            if (c60053zucCopydefault == null) {
                c60053zucCopydefault = C60052zub.OLrzqt();
            }
            return this.OLrzqt.AEQbTJ().invoke(c59985ztN.OLrzqt(), c60053zucCopydefault);
        } catch (java.lang.Exception e) {
            java.lang.String strAEQbTJ = C60071zuu.OLrzqt.AEQbTJ(e);
            c59985ztN.EZpvd().copydefault("* Instance creation error : could not create instance for '" + this.OLrzqt + "': " + strAEQbTJ);
            throw new InstanceCreationException("Could not create instance for '" + this.OLrzqt + '\'', e);
        }
    }

    public static /* synthetic */ boolean isCreated$default(AbstractC59982ztK abstractC59982ztK, C59985ztN c59985ztN, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isCreated");
        }
        if ((i & 1) != 0) {
            c59985ztN = null;
        }
        return abstractC59982ztK.OLrzqt(c59985ztN);
    }

    public static /* synthetic */ void drop$default(AbstractC59982ztK abstractC59982ztK, C60060zuj c60060zuj, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drop");
        }
        if ((i & 1) != 0) {
            c60060zuj = null;
        }
        abstractC59982ztK.copydefault(c60060zuj);
    }

    public boolean equals(java.lang.Object obj) {
        AbstractC59982ztK abstractC59982ztK = obj instanceof AbstractC59982ztK ? (AbstractC59982ztK) obj : null;
        return Intrinsics.EZpvd(this.OLrzqt, abstractC59982ztK != null ? abstractC59982ztK.OLrzqt : null);
    }

    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    /* JADX INFO: renamed from: o.ztK$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ztK.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
