package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.yJd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56540yJd extends C56542yJf implements InterfaceC56538yJb<java.lang.Long> {
    public static final Application copydefault = new Application(null);
    public static final C56540yJd gEmmrt = new C56540yJd(1, 0);

    public C56540yJd(long j, long j2) {
        super(j, j2, 1L);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Comparable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC56538yJb
    public /* synthetic */ boolean contains(java.lang.Comparable comparable) {
        return KWHzl(((java.lang.Number) comparable).longValue());
    }

    /* JADX DEBUG: Method merged with bridge method: getStart()Ljava/lang/Comparable; */
    @Override // o.InterfaceC56538yJb
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.lang.Long getStart() {
        return java.lang.Long.valueOf(OLrzqt());
    }

    /* JADX DEBUG: Method merged with bridge method: getEndInclusive()Ljava/lang/Comparable; */
    @Override // o.InterfaceC56538yJb
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Long getEndInclusive() {
        return java.lang.Long.valueOf(AEQbTJ());
    }

    public boolean KWHzl(long j) {
        return OLrzqt() <= j && j <= AEQbTJ();
    }

    @Override // o.C56542yJf, o.InterfaceC56538yJb
    public boolean isEmpty() {
        return OLrzqt() > AEQbTJ();
    }

    @Override // o.C56542yJf
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C56540yJd) {
            if (!isEmpty() || !((C56540yJd) obj).isEmpty()) {
                C56540yJd c56540yJd = (C56540yJd) obj;
                if (OLrzqt() != c56540yJd.OLrzqt() || AEQbTJ() != c56540yJd.AEQbTJ()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.C56542yJf
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (OLrzqt() ^ (OLrzqt() >>> 32))) + (AEQbTJ() ^ (AEQbTJ() >>> 32)));
    }

    @Override // o.C56542yJf
    public java.lang.String toString() {
        return OLrzqt() + ".." + AEQbTJ();
    }

    /* JADX INFO: renamed from: o.yJd$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yJd.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
