package o;

import androidx.lifecycle.LifecycleOwner;
import com.tencent.matrix.lifecycle.AutoReleaseObserverWrapper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ysj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57985ysj {

    /* JADX INFO: renamed from: o.ysj$TaskDescription */
    public static final class TaskDescription implements InterfaceC57918yrV {
        public final /* synthetic */ InterfaceC57918yrV copydefault;

        public TaskDescription(InterfaceC57918yrV interfaceC57918yrV) {
            this.copydefault = interfaceC57918yrV;
        }

        @Override // o.InterfaceC57914yrR
        public boolean AEQbTJ() {
            return !this.copydefault.AEQbTJ();
        }

        /* JADX INFO: renamed from: o.ysj$TaskDescription$StateListAnimator */
        public final class StateListAnimator implements InterfaceC57909yrM {
            public final /* synthetic */ TaskDescription EZpvd;
            public final InterfaceC57916yrT copydefault;

            public StateListAnimator(@NotNull TaskDescription taskDescription, InterfaceC57916yrT interfaceC57916yrT) {
                Intrinsics.checkNotNullParameter(interfaceC57916yrT, "");
                this.EZpvd = taskDescription;
                this.copydefault = interfaceC57916yrT;
            }

            @Override // o.InterfaceC57916yrT
            public void KWHzl() {
                this.copydefault.OLrzqt();
            }

            @Override // o.InterfaceC57916yrT
            public void OLrzqt() {
                this.copydefault.KWHzl();
            }

            public java.lang.String toString() {
                return this.copydefault.toString();
            }

            public int hashCode() {
                return this.copydefault.hashCode();
            }

            public boolean equals(java.lang.Object obj) {
                if (obj instanceof StateListAnimator) {
                    return Intrinsics.EZpvd(this.copydefault, ((StateListAnimator) obj).copydefault);
                }
                return false;
            }

            @Override // o.InterfaceC57909yrM
            public boolean copydefault() {
                InterfaceC57916yrT interfaceC57916yrT = this.copydefault;
                if (interfaceC57916yrT instanceof InterfaceC57909yrM) {
                    return ((InterfaceC57909yrM) interfaceC57916yrT).copydefault();
                }
                return false;
            }
        }

        public final StateListAnimator copydefault(InterfaceC57916yrT interfaceC57916yrT) {
            return new StateListAnimator(this, interfaceC57916yrT);
        }

        @Override // o.InterfaceC57915yrS
        public void KWHzl(@NotNull InterfaceC57916yrT interfaceC57916yrT) {
            Intrinsics.checkNotNullParameter(interfaceC57916yrT, "");
            this.copydefault.KWHzl(copydefault(interfaceC57916yrT));
        }

        @Override // o.InterfaceC57915yrS
        public void AEQbTJ(@NotNull InterfaceC57916yrT interfaceC57916yrT) {
            Intrinsics.checkNotNullParameter(interfaceC57916yrT, "");
            this.copydefault.AEQbTJ(copydefault(interfaceC57916yrT));
        }
    }

    public static final InterfaceC57918yrV EZpvd(@NotNull InterfaceC57918yrV interfaceC57918yrV) {
        Intrinsics.checkNotNullParameter(interfaceC57918yrV, "");
        return new TaskDescription(interfaceC57918yrV);
    }

    /* JADX INFO: renamed from: o.ysj$Activity */
    public static final class Activity extends C57983ysh {
        public Activity(InterfaceC57918yrV interfaceC57918yrV, final boolean z) {
            super(z);
            interfaceC57918yrV.KWHzl(new InterfaceC57909yrM() { // from class: o.ysj.Activity.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57909yrM
                public boolean copydefault() {
                    return z;
                }

                @Override // o.InterfaceC57916yrT
                public void KWHzl() {
                    Activity.this.valueOf();
                }

                @Override // o.InterfaceC57916yrT
                public void OLrzqt() {
                    Activity.this.djBIcL();
                }
            });
        }
    }

    public static final InterfaceC57918yrV OLrzqt(@NotNull InterfaceC57918yrV interfaceC57918yrV, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC57918yrV, "");
        return new Activity(interfaceC57918yrV, z);
    }

    public static final boolean OLrzqt(C57977ysb c57977ysb, LifecycleOwner lifecycleOwner) {
        boolean zOLrzqt;
        if (lifecycleOwner != null) {
            zOLrzqt = c57977ysb.OLrzqt(lifecycleOwner);
        } else {
            zOLrzqt = c57977ysb instanceof AutoReleaseObserverWrapper;
        }
        if (zOLrzqt) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        return false;
    }
}
