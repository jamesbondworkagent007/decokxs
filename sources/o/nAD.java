package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.contacts.viewmodel.SearchContactViewModel$runSearch$1;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nAD extends AbstractC33073mpa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final MutableLiveData<C32989mnw<java.lang.Boolean>> OLrzqt = new MutableLiveData<>();
    public final MutableLiveData<C32989mnw<java.lang.String>> copydefault = new MutableLiveData<>();
    public final MutableLiveData<C32989mnw<Application>> KWHzl = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<java.lang.Boolean>> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<java.lang.String>> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Application>> OLrzqt() {
        return this.KWHzl;
    }

    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nAD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX INFO: renamed from: o.nAD$Application$Application, reason: collision with other inner class name */
        public static final class C0887Application extends Application {
            public static final int KWHzl = RelationInfo.$stable;
            public final RelationInfo AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0887Application copy$default(C0887Application c0887Application, RelationInfo relationInfo, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    relationInfo = c0887Application.AEQbTJ;
                }
                return c0887Application.copydefault(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RelationInfo AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0887Application copydefault(@NotNull RelationInfo relationInfo) {
                Intrinsics.checkNotNullParameter(relationInfo, "");
                return new C0887Application(relationInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0887Application) && Intrinsics.EZpvd(this.AEQbTJ, ((C0887Application) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "SingleContact(relationInfo=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0887Application(@NotNull RelationInfo relationInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(relationInfo, "");
                this.AEQbTJ = relationInfo;
            }
        }

        public static final class ActionBar extends Application {
            public final java.util.List<RelationInfo> EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nAD$Application$ActionBar */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = actionBar.EZpvd;
                }
                return actionBar.AEQbTJ(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar AEQbTJ(@NotNull java.util.List<RelationInfo> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new ActionBar(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.List<RelationInfo> copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.EZpvd, ((ActionBar) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ContactList(relationList=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull java.util.List<RelationInfo> list) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.EZpvd = list;
            }
        }
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.setValue(new C32989mnw<>(java.lang.Boolean.TRUE));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new SearchContactViewModel$runSearch$1(str, this, null), 2, null);
    }

    public final void OLrzqt(java.util.List<RelationInfo> list) {
        if (list.size() > 1) {
            this.KWHzl.postValue(new C32989mnw<>(new Application.ActionBar(list)));
        } else if (!list.isEmpty()) {
            this.KWHzl.postValue(new C32989mnw<>(new Application.C0887Application((RelationInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(list))));
        } else {
            copydefault(new ResponseFailedException(3905, null, null, null, 14, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.lang.Throwable th) {
        if ((th instanceof ResponseFailedException) && yEE.AhwBna(3905, 4523).contains(java.lang.Integer.valueOf(((ResponseFailedException) th).getCode()))) {
            this.copydefault.postValue(new C32989mnw<>(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DcMfJKDSqxTE)));
            return;
        }
        java.lang.String strCopydefault = C44157sFk.copydefault(th);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.DcMfJKDSqxTE);
        if (strCopydefault == null || strCopydefault.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) {
            strCopydefault = strAYXKKw;
        }
        this.copydefault.postValue(new C32989mnw<>(strCopydefault));
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nAD.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
