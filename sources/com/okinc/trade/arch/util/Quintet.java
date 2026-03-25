package com.okinc.trade.arch.util;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class Quintet<A, B, C, D, E> implements Serializable {
    public static final int $stable = 0;
    private final E fifth;
    private final A first;
    private final D fourth;
    private final B second;
    private final C third;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.trade.arch.util.Quintet */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Quintet copy$default(Quintet quintet, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, Object obj6) {
        if ((i & 1) != 0) {
            obj = quintet.first;
        }
        if ((i & 2) != 0) {
            obj2 = quintet.second;
        }
        Object obj7 = obj2;
        if ((i & 4) != 0) {
            obj3 = quintet.third;
        }
        Object obj8 = obj3;
        if ((i & 8) != 0) {
            obj4 = quintet.fourth;
        }
        Object obj9 = obj4;
        if ((i & 16) != 0) {
            obj5 = quintet.fifth;
        }
        return quintet.copy(obj, obj7, obj8, obj9, obj5);
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
    public final Quintet<A, B, C, D, E> copy(A a2, B b, C c, D d, E e) {
        return new Quintet<>(a2, b, c, d, e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Quintet)) {
            return false;
        }
        Quintet quintet = (Quintet) obj;
        return Intrinsics.EZpvd(this.first, quintet.first) && Intrinsics.EZpvd(this.second, quintet.second) && Intrinsics.EZpvd(this.third, quintet.third) && Intrinsics.EZpvd(this.fourth, quintet.fourth) && Intrinsics.EZpvd(this.fifth, quintet.fifth);
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
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (e != null ? e.hashCode() : 0);
    }

    public Quintet(A a2, B b, C c, D d, E e) {
        this.first = a2;
        this.second = b;
        this.third = c;
        this.fourth = d;
        this.fifth = e;
    }

    public String toString() {
        return "(" + this.first + ", " + this.second + ", " + this.third + ", " + this.fourth + ", " + this.fifth + ")";
    }
}
