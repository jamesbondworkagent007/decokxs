package com.okinc.trade.arch.util;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class Sextet<A, B, C, D, E, F> implements Serializable {
    public static final int $stable = 0;
    private final E fifth;
    private final A first;
    private final D fourth;
    private final B second;
    private final F sixth;
    private final C third;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.trade.arch.util.Sextet */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Sextet copy$default(Sextet sextet, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, Object obj7) {
        if ((i & 1) != 0) {
            obj = sextet.first;
        }
        if ((i & 2) != 0) {
            obj2 = sextet.second;
        }
        Object obj8 = obj2;
        if ((i & 4) != 0) {
            obj3 = sextet.third;
        }
        Object obj9 = obj3;
        if ((i & 8) != 0) {
            obj4 = sextet.fourth;
        }
        Object obj10 = obj4;
        if ((i & 16) != 0) {
            obj5 = sextet.fifth;
        }
        Object obj11 = obj5;
        if ((i & 32) != 0) {
            obj6 = sextet.sixth;
        }
        return sextet.copy(obj, obj8, obj9, obj10, obj11, obj6);
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
    public final Sextet<A, B, C, D, E, F> copy(A a2, B b, C c, D d, E e, F f) {
        return new Sextet<>(a2, b, c, d, e, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sextet)) {
            return false;
        }
        Sextet sextet = (Sextet) obj;
        return Intrinsics.EZpvd(this.first, sextet.first) && Intrinsics.EZpvd(this.second, sextet.second) && Intrinsics.EZpvd(this.third, sextet.third) && Intrinsics.EZpvd(this.fourth, sextet.fourth) && Intrinsics.EZpvd(this.fifth, sextet.fifth) && Intrinsics.EZpvd(this.sixth, sextet.sixth);
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
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (f != null ? f.hashCode() : 0);
    }

    public Sextet(A a2, B b, C c, D d, E e, F f) {
        this.first = a2;
        this.second = b;
        this.third = c;
        this.fourth = d;
        this.fifth = e;
        this.sixth = f;
    }

    public String toString() {
        return "(" + this.first + ", " + this.second + ", " + this.third + ", " + this.fourth + ", " + this.fifth + ", " + this.sixth + ")";
    }
}
