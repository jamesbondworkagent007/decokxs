package com.okinc.trade.arch.util;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class Septet<A, B, C, D, E, F, G> implements Serializable {
    public static final int $stable = 0;
    private final E fifth;
    private final A first;
    private final D fourth;
    private final B second;
    private final G seventh;
    private final F sixth;
    private final C third;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.trade.arch.util.Septet */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Septet copy$default(Septet septet, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, Object obj8) {
        if ((i & 1) != 0) {
            obj = septet.first;
        }
        if ((i & 2) != 0) {
            obj2 = septet.second;
        }
        Object obj9 = obj2;
        if ((i & 4) != 0) {
            obj3 = septet.third;
        }
        Object obj10 = obj3;
        if ((i & 8) != 0) {
            obj4 = septet.fourth;
        }
        Object obj11 = obj4;
        if ((i & 16) != 0) {
            obj5 = septet.fifth;
        }
        Object obj12 = obj5;
        if ((i & 32) != 0) {
            obj6 = septet.sixth;
        }
        Object obj13 = obj6;
        if ((i & 64) != 0) {
            obj7 = septet.seventh;
        }
        return septet.copy(obj, obj9, obj10, obj11, obj12, obj13, obj7);
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
    public final E component5() {
        return this.fifth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final F component6() {
        return this.sixth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final G component7() {
        return this.seventh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Septet<A, B, C, D, E, F, G> copy(A a2, B b, C c, D d, E e, F f, G g) {
        return new Septet<>(a2, b, c, d, e, f, g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Septet)) {
            return false;
        }
        Septet septet = (Septet) obj;
        return Intrinsics.EZpvd(this.first, septet.first) && Intrinsics.EZpvd(this.second, septet.second) && Intrinsics.EZpvd(this.third, septet.third) && Intrinsics.EZpvd(this.fourth, septet.fourth) && Intrinsics.EZpvd(this.fifth, septet.fifth) && Intrinsics.EZpvd(this.sixth, septet.sixth) && Intrinsics.EZpvd(this.seventh, septet.seventh);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final E getFifth() {
        return this.fifth;
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
    public final G getSeventh() {
        return this.seventh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final F getSixth() {
        return this.sixth;
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
        int iHashCode4 = d == null ? 0 : d.hashCode();
        E e = this.fifth;
        int iHashCode5 = e == null ? 0 : e.hashCode();
        F f = this.sixth;
        int iHashCode6 = f == null ? 0 : f.hashCode();
        G g = this.seventh;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (g != null ? g.hashCode() : 0);
    }

    public Septet(A a2, B b, C c, D d, E e, F f, G g) {
        this.first = a2;
        this.second = b;
        this.third = c;
        this.fourth = d;
        this.fifth = e;
        this.sixth = f;
        this.seventh = g;
    }

    public String toString() {
        return "(" + this.first + ", " + this.second + ", " + this.third + ", " + this.fourth + ", " + this.fifth + ", " + this.sixth + ", " + this.seventh + ")";
    }
}
