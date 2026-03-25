package com.okinc.trade.arch.util;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class Quartet<A, B, C, D> implements Serializable {
    public static final int $stable = 0;
    private final A first;
    private final D fourth;
    private final B second;
    private final C third;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.trade.arch.util.Quartet */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Quartet copy$default(Quartet quartet, Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5) {
        if ((i & 1) != 0) {
            obj = quartet.first;
        }
        if ((i & 2) != 0) {
            obj2 = quartet.second;
        }
        if ((i & 4) != 0) {
            obj3 = quartet.third;
        }
        if ((i & 8) != 0) {
            obj4 = quartet.fourth;
        }
        return quartet.copy(obj, obj2, obj3, obj4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final A component1() {
        return this.first;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B component2() {
        return this.second;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C component3() {
        return this.third;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final D component4() {
        return this.fourth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Quartet<A, B, C, D> copy(A a2, B b, C c, D d) {
        return new Quartet<>(a2, b, c, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Quartet)) {
            return false;
        }
        Quartet quartet = (Quartet) obj;
        return Intrinsics.EZpvd(this.first, quartet.first) && Intrinsics.EZpvd(this.second, quartet.second) && Intrinsics.EZpvd(this.third, quartet.third) && Intrinsics.EZpvd(this.fourth, quartet.fourth);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final A getFirst() {
        return this.first;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final D getFourth() {
        return this.fourth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B getSecond() {
        return this.second;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C getThird() {
        return this.third;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        A a2 = this.first;
        int iHashCode = a2 == null ? 0 : a2.hashCode();
        B b = this.second;
        int iHashCode2 = b == null ? 0 : b.hashCode();
        C c = this.third;
        int iHashCode3 = c == null ? 0 : c.hashCode();
        D d = this.fourth;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (d != null ? d.hashCode() : 0);
    }

    public Quartet(A a2, B b, C c, D d) {
        this.first = a2;
        this.second = b;
        this.third = c;
        this.fourth = d;
    }

    public String toString() {
        return "(" + this.first + ", " + this.second + ", " + this.third + ", " + this.fourth + ")";
    }
}
