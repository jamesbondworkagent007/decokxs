package o;

import android.icu.util.Calendar;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40894qgZ implements InterfaceC49405unt<ActionBar, java.lang.Long> {
    @yCM
    public C40894qgZ() {
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Long EZpvd(@NotNull ActionBar actionBar) {
        return (java.lang.Long) InterfaceC49405unt.Activity.EZpvd(this, actionBar);
    }

    /* JADX INFO: renamed from: o.qgZ$ActionBar */
    public static final class ActionBar {
        public final int AEQbTJ;
        public final int KWHzl;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = actionBar.OLrzqt;
            }
            if ((i4 & 2) != 0) {
                i2 = actionBar.KWHzl;
            }
            if ((i4 & 4) != 0) {
                i3 = actionBar.AEQbTJ;
            }
            return actionBar.KWHzl(i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(int i, int i2, int i3) {
            return new ActionBar(i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.OLrzqt == actionBar.OLrzqt && this.KWHzl == actionBar.KWHzl && this.AEQbTJ == actionBar.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Integer.hashCode(this.OLrzqt) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Params(year=" + this.OLrzqt + ", month=" + this.KWHzl + ", day=" + this.AEQbTJ + ")";
        }

        public ActionBar(int i, int i2, int i3) {
            this.OLrzqt = i;
            this.KWHzl = i2;
            this.AEQbTJ = i3;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    public java.lang.Long AEQbTJ(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, actionBar.copydefault());
        calendar.set(2, actionBar.KWHzl());
        calendar.set(5, actionBar.OLrzqt());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return java.lang.Long.valueOf(calendar.getTimeInMillis());
    }
}
