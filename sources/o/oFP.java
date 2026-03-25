package o;

import com.okinc.im.usecase.phone.GetClickPhoneNumberActionUseCase$execute$1;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFP {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final oFY KWHzl;

    @yCM
    public oFP(@NotNull oFY ofy) {
        Intrinsics.checkNotNullParameter(ofy, "");
        this.KWHzl = ofy;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFP.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Activity extends ActionBar {
            public final java.lang.String AEQbTJ;
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = activity.copydefault;
                }
                if ((i & 2) != 0) {
                    str2 = activity.AEQbTJ;
                }
                return activity.OLrzqt(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Activity(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.copydefault.hashCode();
                java.lang.String str = this.AEQbTJ;
                return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "NavigateChatScreen(relationId=" + this.copydefault + ", channelId=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull java.lang.String str, java.lang.String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
                this.AEQbTJ = str2;
            }
        }

        private ActionBar() {
        }

        /* JADX INFO: renamed from: o.oFP$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0902ActionBar extends ActionBar {
            public final java.lang.String AEQbTJ;
            public final java.lang.String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0902ActionBar copy$default(C0902ActionBar c0902ActionBar, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = c0902ActionBar.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    str2 = c0902ActionBar.KWHzl;
                }
                return c0902ActionBar.AEQbTJ(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0902ActionBar AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new C0902ActionBar(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0902ActionBar)) {
                    return false;
                }
                C0902ActionBar c0902ActionBar = (C0902ActionBar) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c0902ActionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c0902ActionBar.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "InviteUser(localNumber=" + this.AEQbTJ + ", displayName=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0902ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.AEQbTJ = str;
                this.KWHzl = str2;
            }
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFP.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull PhoneRelation phoneRelation, @NotNull Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        GetClickPhoneNumberActionUseCase$execute$1 getClickPhoneNumberActionUseCase$execute$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object activity;
        if (continuation instanceof GetClickPhoneNumberActionUseCase$execute$1) {
            getClickPhoneNumberActionUseCase$execute$1 = (GetClickPhoneNumberActionUseCase$execute$1) continuation;
            int i = getClickPhoneNumberActionUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getClickPhoneNumberActionUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getClickPhoneNumberActionUseCase$execute$1 = new GetClickPhoneNumberActionUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getClickPhoneNumberActionUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getClickPhoneNumberActionUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Result.Application application = Result.Companion;
                oFY ofy = this.KWHzl;
                java.lang.String countryCode = phoneRelation.getCountryCode();
                if (countryCode == null) {
                    countryCode = "";
                }
                java.lang.String nationalNumber = phoneRelation.getNationalNumber();
                getClickPhoneNumberActionUseCase$execute$1.L$0 = phoneRelation;
                getClickPhoneNumberActionUseCase$execute$1.label = 1;
                objEZpvd = ofy.EZpvd(countryCode, nationalNumber, getClickPhoneNumberActionUseCase$execute$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                phoneRelation = (PhoneRelation) getClickPhoneNumberActionUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
            }
            java.util.List list = (java.util.List) objEZpvd;
            if (list.isEmpty()) {
                pUU.KWHzl("GetClickPhoneNumberActionUseCase", "Local contact not found: name=" + phoneRelation.getName());
                java.lang.String rawNumber = phoneRelation.getRawNumber();
                java.lang.String name = phoneRelation.getName();
                if (name == null) {
                    name = "";
                }
                activity = new ActionBar.C0902ActionBar(rawNumber, name);
            } else {
                InHouseIMContactInfoEntity inHouseIMContactInfoEntity = (InHouseIMContactInfoEntity) list.get(0);
                pUU.KWHzl("GetClickPhoneNumberActionUseCase", "Local contact found: contactUid=" + inHouseIMContactInfoEntity.getContactUid());
                activity = new ActionBar.Activity(inHouseIMContactInfoEntity.getContactUid(), inHouseIMContactInfoEntity.getChannelId());
            }
            objM7377constructorimpl = Result.m7377constructorimpl(activity);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return objM7377constructorimpl;
        }
        if (C43422row.OLrzqt(thM7380exceptionOrNullimpl).getCode() == 2009) {
            pUU.KWHzl("GetClickPhoneNumberActionUseCase", "Rate limit reached: name=" + phoneRelation.getName());
            java.lang.String rawNumber2 = phoneRelation.getRawNumber();
            java.lang.String name2 = phoneRelation.getName();
            return new ActionBar.C0902ActionBar(rawNumber2, name2 != null ? name2 : "");
        }
        throw thM7380exceptionOrNullimpl;
    }
}
