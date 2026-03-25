package com.okinc.business.appupdate.api;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33041mov;
import o.InterfaceC46518tXh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IUpdate {
    void addUpdateStateChangeListener(@NotNull IUpdateStateChange iUpdateStateChange);

    void checkUpdate(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, boolean z);

    void checkUpdate(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, boolean z, DialogInfo dialogInfo);

    void getLatestVersion(@NotNull Function1<? super String, Unit> function1);

    InterfaceC46518tXh getUpdateManageableContainer(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull FragmentManager fragmentManager, boolean z);

    Integer getUpdateProgress();

    boolean hasNewVersion();

    void onActivityResult(int i, int i2, Intent intent);

    void removeUpdateStateChangeListener(@NotNull IUpdateStateChange iUpdateStateChange);

    void startReview(@NotNull Activity activity);

    void startReviewFlow(@NotNull Activity activity, @NotNull Function0<Unit> function0);

    /* JADX INFO: loaded from: classes14.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void checkUpdate$default(IUpdate iUpdate, AbstractActivityC33041mov abstractActivityC33041mov, boolean z, DialogInfo dialogInfo, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkUpdate");
            }
            if ((i & 4) != 0) {
                dialogInfo = null;
            }
            iUpdate.checkUpdate(abstractActivityC33041mov, z, dialogInfo);
        }
    }

    public static final class DialogInfo {
        public static final int $stable = 8;
        private CharSequence description;
        private boolean dismissAfterClick;
        private CharSequence primary;
        private DialogInterface.OnClickListener primaryOnClick;
        private CharSequence secondary;
        private DialogInterface.OnClickListener secondaryOnClick;
        private CharSequence title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DialogInfo() {
            this(null, null, null, null, null, null, false, 127, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DialogInfo copy$default(DialogInfo dialogInfo, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = dialogInfo.title;
            }
            if ((i & 2) != 0) {
                charSequence2 = dialogInfo.description;
            }
            CharSequence charSequence5 = charSequence2;
            if ((i & 4) != 0) {
                charSequence3 = dialogInfo.primary;
            }
            CharSequence charSequence6 = charSequence3;
            if ((i & 8) != 0) {
                charSequence4 = dialogInfo.secondary;
            }
            CharSequence charSequence7 = charSequence4;
            if ((i & 16) != 0) {
                onClickListener = dialogInfo.primaryOnClick;
            }
            DialogInterface.OnClickListener onClickListener3 = onClickListener;
            if ((i & 32) != 0) {
                onClickListener2 = dialogInfo.secondaryOnClick;
            }
            DialogInterface.OnClickListener onClickListener4 = onClickListener2;
            if ((i & 64) != 0) {
                z = dialogInfo.dismissAfterClick;
            }
            return dialogInfo.copy(charSequence, charSequence5, charSequence6, charSequence7, onClickListener3, onClickListener4, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence component1() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence component2() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence component3() {
            return this.primary;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence component4() {
            return this.secondary;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DialogInterface.OnClickListener component5() {
            return this.primaryOnClick;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DialogInterface.OnClickListener component6() {
            return this.secondaryOnClick;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component7() {
            return this.dismissAfterClick;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DialogInfo copy(CharSequence charSequence, CharSequence charSequence2, @NotNull CharSequence charSequence3, @NotNull CharSequence charSequence4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, boolean z) {
            Intrinsics.checkNotNullParameter(charSequence3, "");
            Intrinsics.checkNotNullParameter(charSequence4, "");
            return new DialogInfo(charSequence, charSequence2, charSequence3, charSequence4, onClickListener, onClickListener2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DialogInfo)) {
                return false;
            }
            DialogInfo dialogInfo = (DialogInfo) obj;
            return Intrinsics.EZpvd(this.title, dialogInfo.title) && Intrinsics.EZpvd(this.description, dialogInfo.description) && Intrinsics.EZpvd(this.primary, dialogInfo.primary) && Intrinsics.EZpvd(this.secondary, dialogInfo.secondary) && Intrinsics.EZpvd(this.primaryOnClick, dialogInfo.primaryOnClick) && Intrinsics.EZpvd(this.secondaryOnClick, dialogInfo.secondaryOnClick) && this.dismissAfterClick == dialogInfo.dismissAfterClick;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence getDescription() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getDismissAfterClick() {
            return this.dismissAfterClick;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence getPrimary() {
            return this.primary;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DialogInterface.OnClickListener getPrimaryOnClick() {
            return this.primaryOnClick;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence getSecondary() {
            return this.secondary;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DialogInterface.OnClickListener getSecondaryOnClick() {
            return this.secondaryOnClick;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CharSequence getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            CharSequence charSequence = this.title;
            int iHashCode = charSequence == null ? 0 : charSequence.hashCode();
            CharSequence charSequence2 = this.description;
            int iHashCode2 = charSequence2 == null ? 0 : charSequence2.hashCode();
            int iHashCode3 = this.primary.hashCode();
            int iHashCode4 = this.secondary.hashCode();
            DialogInterface.OnClickListener onClickListener = this.primaryOnClick;
            int iHashCode5 = onClickListener == null ? 0 : onClickListener.hashCode();
            DialogInterface.OnClickListener onClickListener2 = this.secondaryOnClick;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31) + Boolean.hashCode(this.dismissAfterClick);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDescription(CharSequence charSequence) {
            this.description = charSequence;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDismissAfterClick(boolean z) {
            this.dismissAfterClick = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPrimary(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.primary = charSequence;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPrimaryOnClick(DialogInterface.OnClickListener onClickListener) {
            this.primaryOnClick = onClickListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSecondary(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.secondary = charSequence;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSecondaryOnClick(DialogInterface.OnClickListener onClickListener) {
            this.secondaryOnClick = onClickListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTitle(CharSequence charSequence) {
            this.title = charSequence;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            CharSequence charSequence = this.title;
            CharSequence charSequence2 = this.description;
            CharSequence charSequence3 = this.primary;
            CharSequence charSequence4 = this.secondary;
            return "DialogInfo(title=" + ((Object) charSequence) + ", description=" + ((Object) charSequence2) + ", primary=" + ((Object) charSequence3) + ", secondary=" + ((Object) charSequence4) + ", primaryOnClick=" + this.primaryOnClick + ", secondaryOnClick=" + this.secondaryOnClick + ", dismissAfterClick=" + this.dismissAfterClick + ")";
        }

        public DialogInfo(CharSequence charSequence, CharSequence charSequence2, @NotNull CharSequence charSequence3, @NotNull CharSequence charSequence4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, boolean z) {
            Intrinsics.checkNotNullParameter(charSequence3, "");
            Intrinsics.checkNotNullParameter(charSequence4, "");
            this.title = charSequence;
            this.description = charSequence2;
            this.primary = charSequence3;
            this.secondary = charSequence4;
            this.primaryOnClick = onClickListener;
            this.secondaryOnClick = onClickListener2;
            this.dismissAfterClick = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.CharSequence) : (r6v0 java.lang.CharSequence))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.CharSequence) : (r7v0 java.lang.CharSequence))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.CharSequence))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0018: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.CharSequence))
  (wrap:android.content.DialogInterface$OnClickListener:?: TERNARY null = ((wrap:int:0x001f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null android.content.DialogInterface$OnClickListener) : (r10v0 android.content.DialogInterface$OnClickListener))
  (wrap:android.content.DialogInterface$OnClickListener:?: TERNARY null = ((wrap:int:0x0026: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 android.content.DialogInterface$OnClickListener) : (null android.content.DialogInterface$OnClickListener))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r12v0 boolean))
 A[MD:(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnClickListener, boolean):void (m)] (LINE:57) call: com.okinc.business.appupdate.api.IUpdate.DialogInfo.<init>(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnClickListener, boolean):void type: THIS */
        public /* synthetic */ DialogInfo(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? "" : charSequence3, (i & 8) != 0 ? "" : charSequence4, (i & 16) != 0 ? null : onClickListener, (i & 32) == 0 ? onClickListener2 : null, (i & 64) != 0 ? true : z);
        }
    }
}
