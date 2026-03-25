package com.okinc.account.api.service;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.fragment.app.FragmentActivity;
import com.okinc.account.api.model.usercenter.EditProfileScenario;
import com.okinc.account.api.model.usercenter.LinkXResult;
import com.okinc.account.api.model.usercenter.UnlinkXInput;
import com.okinc.account.api.model.usercenter.UnlinkXResult;
import com.okinc.business.invest_biz.data.bean.InvestButtonAction;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC43217rlC;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface UserInfoService extends InterfaceC43217rlC {
    public static final TaskDescription Companion = TaskDescription.OLrzqt;

    public interface ActionBar {
    }

    public interface Activity {
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface FragmentManager {
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface StateListAnimator {
    }

    Object AEQbTJ(@NotNull Continuation<? super Result<Boolean>> continuation);

    void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull EditProfileScenario editProfileScenario, @NotNull ActionBar actionBar, @NotNull Activity activity, String str, String str2, String str3);

    void AEQbTJ(@NotNull String str, @NotNull StateListAnimator stateListAnimator);

    ActivityResultContract<UnlinkXInput, UnlinkXResult> KWHzl();

    ActivityResultContract<Unit, LinkXResult> copydefault();

    void copydefault(String str, String str2, @NotNull FragmentManager fragmentManager);

    public static final class Application {
        public static /* synthetic */ void updateNickname$default(UserInfoService userInfoService, String str, StateListAnimator stateListAnimator, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateNickname");
            }
            if ((i & 2) != 0) {
                stateListAnimator = TaskDescription.ActionBar.EZpvd;
            }
            userInfoService.AEQbTJ(str, stateListAnimator);
        }

        public static /* synthetic */ void updateNicknames$default(UserInfoService userInfoService, String str, String str2, FragmentManager fragmentManager, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateNicknames");
            }
            if ((i & 4) != 0) {
                fragmentManager = TaskDescription.Application.KWHzl;
            }
            userInfoService.copydefault(str, str2, fragmentManager);
        }

        public static /* synthetic */ void startEditProfileFlow$default(UserInfoService userInfoService, FragmentActivity fragmentActivity, EditProfileScenario editProfileScenario, ActionBar actionBar, Activity activity, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startEditProfileFlow");
            }
            userInfoService.AEQbTJ(fragmentActivity, (i & 2) != 0 ? EditProfileScenario.UserCenter.INSTANCE : editProfileScenario, (i & 4) != 0 ? TaskDescription.C0237TaskDescription.KWHzl : actionBar, (i & 8) != 0 ? TaskDescription.Activity.AEQbTJ : activity, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) == 0 ? str3 : null);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class EditProfileResult implements Parcelable {
        public static final Parcelable.Creator<EditProfileResult> CREATOR = new Creator();
        public final boolean AEQbTJ;
        public final EditProfileAction EZpvd;
        public final boolean OLrzqt;

        /* JADX INFO: loaded from: classes22.dex */
        public static final class Creator implements Parcelable.Creator<EditProfileResult> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EditProfileResult createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new EditProfileResult(parcel.readInt() != 0, parcel.readInt() != 0, EditProfileAction.valueOf(parcel.readString()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EditProfileResult[] newArray(int i) {
                return new EditProfileResult[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ EditProfileResult copy$default(EditProfileResult editProfileResult, boolean z, boolean z2, EditProfileAction editProfileAction, int i, Object obj) {
            if ((i & 1) != 0) {
                z = editProfileResult.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z2 = editProfileResult.OLrzqt;
            }
            if ((i & 4) != 0) {
                editProfileAction = editProfileResult.EZpvd;
            }
            return editProfileResult.EZpvd(z, z2, editProfileAction);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EditProfileResult EZpvd(boolean z, boolean z2, @NotNull EditProfileAction editProfileAction) {
            Intrinsics.checkNotNullParameter(editProfileAction, "");
            return new EditProfileResult(z, z2, editProfileAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditProfileResult)) {
                return false;
            }
            EditProfileResult editProfileResult = (EditProfileResult) obj;
            return this.AEQbTJ == editProfileResult.AEQbTJ && this.OLrzqt == editProfileResult.OLrzqt && this.EZpvd == editProfileResult.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Boolean.hashCode(this.AEQbTJ) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "EditProfileResult(updated=" + this.AEQbTJ + ", isUnderReview=" + this.OLrzqt + ", action=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.AEQbTJ ? 1 : 0);
            parcel.writeInt(this.OLrzqt ? 1 : 0);
            parcel.writeString(this.EZpvd.name());
        }

        public EditProfileResult(boolean z, boolean z2, @NotNull EditProfileAction editProfileAction) {
            Intrinsics.checkNotNullParameter(editProfileAction, "");
            this.AEQbTJ = z;
            this.OLrzqt = z2;
            this.EZpvd = editProfileAction;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class EditProfileAction {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ EditProfileAction[] $VALUES;
        public static final EditProfileAction CLOSE = new EditProfileAction(InvestButtonAction.ACTION_CALLBACK_CLOSE, 0);
        public static final EditProfileAction SAVE = new EditProfileAction("SAVE", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ EditProfileAction[] $values() {
            return new EditProfileAction[]{CLOSE, SAVE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<EditProfileAction> getEntries() {
            return $ENTRIES;
        }

        private EditProfileAction(String str, int i) {
        }

        static {
            EditProfileAction[] editProfileActionArr$values = $values();
            $VALUES = editProfileActionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(editProfileActionArr$values);
        }

        public static EditProfileAction valueOf(String str) {
            return (EditProfileAction) Enum.valueOf(EditProfileAction.class, str);
        }

        public static EditProfileAction[] values() {
            return (EditProfileAction[]) $VALUES.clone();
        }
    }

    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
        }

        /* JADX INFO: renamed from: com.okinc.account.api.service.UserInfoService$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0237TaskDescription implements ActionBar {
            public static final C0237TaskDescription KWHzl = new C0237TaskDescription();

            private C0237TaskDescription() {
            }
        }

        public static final class Activity implements Activity {
            public static final Activity AEQbTJ = new Activity();

            private Activity() {
            }
        }

        /* JADX INFO: loaded from: classes14.dex */
        public static final class ActionBar implements StateListAnimator {
            public static final ActionBar EZpvd = new ActionBar();

            private ActionBar() {
            }
        }

        /* JADX INFO: loaded from: classes14.dex */
        public static final class Application implements FragmentManager {
            public static final Application KWHzl = new Application();

            private Application() {
            }
        }
    }
}
