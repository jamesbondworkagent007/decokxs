package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class yIU extends yIT implements InterfaceC56538yJb<java.lang.Character> {
    public static final Application EZpvd = new Application(null);
    public static final yIU djBIcL = new yIU(1, 0);

    public yIU(char c, char c2) {
        super(c, c2, 1);
    }

    @Override // o.InterfaceC56538yJb
    public /* synthetic */ boolean contains(java.lang.Comparable comparable) {
        return copydefault(((java.lang.Character) comparable).charValue());
    }

    /* JADX DEBUG: Method merged with bridge method: getStart()Ljava/lang/Comparable; */
    @Override // o.InterfaceC56538yJb
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Character getStart() {
        return java.lang.Character.valueOf(KWHzl());
    }

    /* JADX DEBUG: Method merged with bridge method: getEndInclusive()Ljava/lang/Comparable; */
    @Override // o.InterfaceC56538yJb
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Character getEndInclusive() {
        return java.lang.Character.valueOf(copydefault());
    }

    public boolean copydefault(char c) {
        return Intrinsics.copydefault((int) KWHzl(), (int) c) <= 0 && Intrinsics.copydefault((int) c, (int) copydefault()) <= 0;
    }

    @Override // o.yIT, o.InterfaceC56538yJb
    public boolean isEmpty() {
        return Intrinsics.copydefault((int) KWHzl(), (int) copydefault()) > 0;
    }

    @Override // o.yIT
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof yIU) {
            if (!isEmpty() || !((yIU) obj).isEmpty()) {
                yIU yiu = (yIU) obj;
                if (KWHzl() != yiu.KWHzl() || copydefault() != yiu.copydefault()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.yIT
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (KWHzl() * 31) + copydefault();
    }

    @Override // o.yIT
    public java.lang.String toString() {
        return KWHzl() + ".." + copydefault();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yIU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
