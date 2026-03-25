package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59355zfV<T> extends AbstractC59346zfM<T> {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public java.lang.Object[] EZpvd;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59346zfM
    public int OLrzqt() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.zfV$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zfV.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public C59355zfV(java.lang.Object[] objArr, int i) {
        super(null);
        this.EZpvd = objArr;
        this.copydefault = i;
    }

    public C59355zfV() {
        this(new java.lang.Object[20], 0);
    }

    private final void EZpvd(int i) {
        java.lang.Object[] objArr = this.EZpvd;
        if (objArr.length > i) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i);
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.EZpvd, length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        this.EZpvd = objArrCopyOf;
    }

    @Override // o.AbstractC59346zfM
    public void OLrzqt(int i, @NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        EZpvd(i);
        if (this.EZpvd[i] == null) {
            this.copydefault = OLrzqt() + 1;
        }
        this.EZpvd[i] = t;
    }

    @Override // o.AbstractC59346zfM
    public T AEQbTJ(int i) {
        return (T) yDV.gEmmrt(this.EZpvd, i);
    }

    /* JADX INFO: renamed from: o.zfV$TaskDescription */
    public static final class TaskDescription extends yDH<T> {
        public final /* synthetic */ C59355zfV<T> EZpvd;
        public int OLrzqt = -1;

        public TaskDescription(C59355zfV<T> c59355zfV) {
            this.EZpvd = c59355zfV;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.zfV$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.yDH
        public void copydefault() {
            do {
                int i = this.OLrzqt + 1;
                this.OLrzqt = i;
                if (i >= this.EZpvd.EZpvd.length) {
                    break;
                }
            } while (this.EZpvd.EZpvd[this.OLrzqt] == null);
            if (this.OLrzqt < this.EZpvd.EZpvd.length) {
                java.lang.Object obj = this.EZpvd.EZpvd[this.OLrzqt];
                Intrinsics.copydefault(obj, "");
                copydefault(obj);
                return;
            }
            KWHzl();
        }
    }

    @Override // o.AbstractC59346zfM, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return new TaskDescription(this);
    }
}
