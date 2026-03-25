package o;

import com.fasterxml.jackson.core.JsonPointer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import o.InterfaceC56893yWf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56726yQa implements InterfaceC56893yWf {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final KotlinClassHeader EZpvd;
    public final java.lang.Class<?> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.Class), (r2v0 kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader) A[MD:(java.lang.Class<?>, kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader):void (m)] call: o.yQa.<init>(java.lang.Class, kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C56726yQa(java.lang.Class cls, KotlinClassHeader kotlinClassHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, kotlinClassHeader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Class<?> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56893yWf
    public KotlinClassHeader EZpvd() {
        return this.EZpvd;
    }

    public C56726yQa(java.lang.Class<?> cls, KotlinClassHeader kotlinClassHeader) {
        this.OLrzqt = cls;
        this.EZpvd = kotlinClassHeader;
    }

    /* JADX INFO: renamed from: o.yQa$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yQa.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C56726yQa OLrzqt(@NotNull java.lang.Class<?> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            C56903yWp c56903yWp = new C56903yWp();
            C56727yQb.copydefault.EZpvd(cls, c56903yWp);
            KotlinClassHeader kotlinClassHeaderAEQbTJ = c56903yWp.AEQbTJ();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (kotlinClassHeaderAEQbTJ == null) {
                return null;
            }
            return new C56726yQa(cls, kotlinClassHeaderAEQbTJ, defaultConstructorMarker);
        }
    }

    @Override // o.InterfaceC56893yWf
    public java.lang.String OLrzqt() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String name = this.OLrzqt.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        sb.append(C59449zhJ.replace$default(name, '.', JsonPointer.SEPARATOR, false, 4, (java.lang.Object) null));
        sb.append(".class");
        return sb.toString();
    }

    @Override // o.InterfaceC56893yWf
    public C56929yXo KWHzl() {
        return C56743yQr.AEQbTJ(this.OLrzqt);
    }

    @Override // o.InterfaceC56893yWf
    public void KWHzl(@NotNull InterfaceC56893yWf.TaskDescription taskDescription, byte[] bArr) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56727yQb.copydefault.EZpvd(this.OLrzqt, taskDescription);
    }

    @Override // o.InterfaceC56893yWf
    public void KWHzl(@NotNull InterfaceC56893yWf.StateListAnimator stateListAnimator, byte[] bArr) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        C56727yQb.copydefault.copydefault(this.OLrzqt, stateListAnimator);
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof C56726yQa) && Intrinsics.EZpvd(this.OLrzqt, ((C56726yQa) obj).OLrzqt);
    }

    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    public java.lang.String toString() {
        return C56726yQa.class.getName() + ": " + this.OLrzqt;
    }
}
