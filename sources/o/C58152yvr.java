package o;

import androidx.lifecycle.Lifecycle;
import com.trello.rxlifecycle2.OutsideLifecycleException;

/* JADX INFO: renamed from: o.yvr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58152yvr {
    public static final InterfaceC58229yxO<Lifecycle.Event, Lifecycle.Event> copydefault = new InterfaceC58229yxO<Lifecycle.Event, Lifecycle.Event>() { // from class: o.yvr.3
        /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC58229yxO
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Lifecycle.Event apply(Lifecycle.Event event) throws java.lang.Exception {
            switch (AnonymousClass2.AEQbTJ[event.ordinal()]) {
                case 1:
                    return Lifecycle.Event.ON_DESTROY;
                case 2:
                    return Lifecycle.Event.ON_STOP;
                case 3:
                    return Lifecycle.Event.ON_PAUSE;
                case 4:
                    return Lifecycle.Event.ON_STOP;
                case 5:
                    return Lifecycle.Event.ON_DESTROY;
                case 6:
                    throw new OutsideLifecycleException("Cannot bind to Activity lifecycle when outside of it.");
                default:
                    throw new java.lang.UnsupportedOperationException("Binding to " + event + " not yet implemented");
            }
        }
    };

    private C58152yvr() {
        throw new java.lang.AssertionError("No instances");
    }

    public static <T> C58155yvu<T> OLrzqt(@androidx.annotation.NonNull AbstractC58247yxg<Lifecycle.Event> abstractC58247yxg) {
        return C58159yvy.copydefault(abstractC58247yxg, copydefault);
    }

    /* JADX INFO: renamed from: o.yvr$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            AEQbTJ = iArr;
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                AEQbTJ[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                AEQbTJ[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                AEQbTJ[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }
}
