package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.contacts.addcontact.AddContactDialogViewModel$addContact$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nAb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33632nAb extends ViewModel {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final MutableLiveData<java.lang.Boolean> AEQbTJ;
    public final InterfaceC44177sGd AYXKKw;
    public final MutableLiveData<RelationInfo> EZpvd;
    public final MutableLiveData<C32989mnw<TaskDescription>> KWHzl;
    public final MutableLiveData<java.lang.String> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<TaskDescription>> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<RelationInfo> OLrzqt() {
        return this.EZpvd;
    }

    public C33632nAb(@NotNull InterfaceC44177sGd interfaceC44177sGd) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        this.AYXKKw = interfaceC44177sGd;
        this.AEQbTJ = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: o.nAb$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nAb.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.nAb$TaskDescription */
    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nAb.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.nAb$TaskDescription$Application */
        public static final class Application extends TaskDescription {
            public static final int OLrzqt = RelationInfo.$stable;
            public final RelationInfo EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, RelationInfo relationInfo, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    relationInfo = application.EZpvd;
                }
                return application.KWHzl(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application KWHzl(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                return new Application(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.EZpvd, ((Application) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(contactInfo=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull RelationInfo relationInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(relationInfo, "");
                this.EZpvd = relationInfo;
            }
        }

        private TaskDescription() {
        }

        /* JADX INFO: renamed from: o.nAb$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0888TaskDescription extends TaskDescription {
            public static final int KWHzl = OKServerException.$stable;
            public final OKServerException OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0888TaskDescription copy$default(C0888TaskDescription c0888TaskDescription, OKServerException oKServerException, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    oKServerException = c0888TaskDescription.OLrzqt;
                }
                return c0888TaskDescription.copydefault(oKServerException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OKServerException KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0888TaskDescription copydefault(@NotNull OKServerException oKServerException) {
                Intrinsics.checkNotNullParameter(oKServerException, "");
                return new C0888TaskDescription(oKServerException);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0888TaskDescription) && Intrinsics.EZpvd(this.OLrzqt, ((C0888TaskDescription) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "FailureExceedLimit(error=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0888TaskDescription(@NotNull OKServerException oKServerException) {
                super(null);
                Intrinsics.checkNotNullParameter(oKServerException, "");
                this.OLrzqt = oKServerException;
            }
        }

        /* JADX INFO: renamed from: o.nAb$TaskDescription$StateListAnimator */
        public static final class StateListAnimator extends TaskDescription {
            public final java.lang.Throwable OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.copydefault(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Throwable EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new StateListAnimator(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.OLrzqt, ((StateListAnimator) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failure(error=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.OLrzqt = th;
            }
        }
    }

    public final void copydefault(RelationInfo relationInfo, java.lang.String str) {
        this.EZpvd.setValue(relationInfo);
        this.OLrzqt.setValue(str);
    }

    public final void AEQbTJ() {
        RelationInfo value = this.EZpvd.getValue();
        java.lang.String contactsId = value != null ? value.getContactsId() : null;
        if (contactsId == null) {
            pUU.KWHzl("AddContactConfirmViewModel", "addContact:contactId is null");
            return;
        }
        pUU.EZpvd("AddContactConfirmViewModel", "addContact: start add contact, contactId=" + contactsId);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AddContactDialogViewModel$addContact$1(this, contactsId, null), 3, null);
    }

    public final void EZpvd(java.lang.Throwable th) {
        java.lang.Object stateListAnimator;
        pUU.EZpvd("AddContactConfirmViewModel", "addContact: on add contact failed, error=" + th.getMessage());
        java.lang.Throwable cause = th.getCause();
        if (cause instanceof OKServerException) {
            java.lang.Integer numOLrzqt = C44157sFk.OLrzqt(cause);
            stateListAnimator = (numOLrzqt != null && numOLrzqt.intValue() == 2001) ? new TaskDescription.C0888TaskDescription((OKServerException) cause) : new TaskDescription.StateListAnimator(cause);
        } else {
            if (cause != null) {
                th = cause;
            }
            stateListAnimator = new TaskDescription.StateListAnimator(th);
        }
        this.KWHzl.setValue(new C32989mnw<>(stateListAnimator));
    }

    public final void EZpvd(RelationInfo relationInfo) {
        pUU.EZpvd("AddContactConfirmViewModel", "addContact: on add contact success, contactInfo=" + relationInfo);
        this.KWHzl.setValue(new C32989mnw<>(new TaskDescription.Application(relationInfo)));
    }
}
