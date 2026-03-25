package com.okinc.okex.rating.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.biz.model.SubmitRatingResult;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.bean.PreSubmitRatingBean;
import com.okinc.okex.rating.bean.RatingLabelDisplayModel;
import com.okinc.okex.rating.viewmodel.RatingSubmitViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.C32989mnw;
import o.C56403yEb;
import o.C56423yEv;
import o.C56548yJl;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.sxK;
import o.syS;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class RatingSubmitViewModel extends ViewModel {
    public final MutableLiveData<GetSupportRatingBean> AEQbTJ;
    public final MutableLiveData<Boolean> AYXKKw;
    public final MutableLiveData<C32989mnw<Unit>> AhwBna;
    public final MutableLiveData<MandatoryFeedbackModel> AkhnZx;
    public final MutableLiveData<Boolean> AuCTel;
    public final LiveData<LabelModel> AuCTelauCTel;
    public final LiveData<StarModel> AubY;
    public final MutableLiveData<C32989mnw<Unit>> DbNXlk;
    public final MutableLiveData<String> EZpvd;
    public final MutableLiveData<String> KWHzl;
    public final MutableLiveData<C32989mnw<Unit>> OLrzqt;
    public final MutableLiveData<C32989mnw<Unit>> copydefault;
    public final MutableLiveData<Boolean> djBIcL;
    public final MutableLiveData<HashSet<Long>> ejfBZ;
    public final MutableLiveData<String> fARcdN;
    public final MutableLiveData<Integer> fIwbmz;
    public final MutableLiveData<Long> fJNWhG;
    public final MutableLiveData<JsonObject> fetchVPNInfo;
    public final MutableLiveData<String> gEmmrt;
    public final LiveData<FeedbackModel> getFieldNames;
    public final MutableLiveData<SubmitRatingResult> getNewProxyInstance;
    public final MutableLiveData<C32989mnw<Application>> hDKMBd;
    public final MutableLiveData<Integer> isConnected;
    public final LiveData<TaskDescription> iwGUEr;
    public final syS sSMYrx;
    public final LiveData<Activity> uzCIH;
    public final MutableLiveData<Boolean> valueOf;
    public final MutableLiveData<PreSubmitRatingBean> values;
    public final LiveData<Boolean> wlaJM;
    public final LiveData<Boolean> zLjUOn;
    public final LiveData<IsAgreeToJoinResearchModel> zsXlph;
    public final LiveData<TitleModel> zuBGHE;

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> AkhnZx() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> AuCTel() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AuCTelauCTel() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<TitleModel> AubY() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Activity> DbNXlk() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> ejfBZ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<LabelModel> fARcdN() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<FeedbackModel> fIwbmz() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<TaskDescription> fJNWhG() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<MandatoryFeedbackModel> getNewProxyInstance() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> hDKMBd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<SubmitRatingResult> iwGUEr() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<StarModel> uzCIH() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> wlaJM() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<IsAgreeToJoinResearchModel> zLjUOn() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Application>> zsXlph() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> zuBGHE() {
        return this.zLjUOn;
    }

    public RatingSubmitViewModel(@NotNull syS sys) {
        Intrinsics.checkNotNullParameter(sys, "");
        this.sSMYrx = sys;
        this.AEQbTJ = new MutableLiveData<>();
        this.fARcdN = new MutableLiveData<>();
        this.fetchVPNInfo = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>(null);
        this.AYXKKw = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        this.DbNXlk = new MutableLiveData<>();
        MutableLiveData<C32989mnw<Unit>> mutableLiveData = new MutableLiveData<>();
        this.copydefault = mutableLiveData;
        this.hDKMBd = new MutableLiveData<>();
        this.getNewProxyInstance = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.valueOf = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.djBIcL = mutableLiveData3;
        MutableLiveData<String> mutableLiveData4 = new MutableLiveData<>();
        this.EZpvd = mutableLiveData4;
        MutableLiveData<HashSet<Long>> mutableLiveData5 = new MutableLiveData<>();
        this.ejfBZ = mutableLiveData5;
        MutableLiveData<Integer> mutableLiveData6 = new MutableLiveData<>();
        this.isConnected = mutableLiveData6;
        this.fIwbmz = new MutableLiveData<>(null);
        this.AuCTel = new MutableLiveData<>(null);
        this.fJNWhG = new MutableLiveData<>();
        MutableLiveData<String> mutableLiveData7 = new MutableLiveData<>();
        this.gEmmrt = mutableLiveData7;
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(mutableLiveData2, new ActionBar(new Function1() { // from class: o.szj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.DbNXlk(mediatorLiveData, this, (java.lang.Boolean) obj);
            }
        }));
        this.wlaJM = mediatorLiveData;
        final MediatorLiveData mediatorLiveData2 = new MediatorLiveData();
        mediatorLiveData2.addSource(mutableLiveData2, new ActionBar(new Function1() { // from class: o.szi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.fetchVPNInfo(mediatorLiveData2, this, (java.lang.Boolean) obj);
            }
        }));
        this.zLjUOn = mediatorLiveData2;
        final MediatorLiveData mediatorLiveData3 = new MediatorLiveData();
        mediatorLiveData3.addSource(mutableLiveData2, new ActionBar(new Function1() { // from class: o.szn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.values(mediatorLiveData3, this, (java.lang.Boolean) obj);
            }
        }));
        this.iwGUEr = mediatorLiveData3;
        final MediatorLiveData mediatorLiveData4 = new MediatorLiveData();
        mediatorLiveData4.addSource(mutableLiveData2, new ActionBar(new Function1() { // from class: o.szo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.AuCTel(mediatorLiveData4, this, (java.lang.Boolean) obj);
            }
        }));
        this.zuBGHE = mediatorLiveData4;
        final MediatorLiveData mediatorLiveData5 = new MediatorLiveData();
        mediatorLiveData5.addSource(mutableLiveData2, new ActionBar(new Function1() { // from class: o.szm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.fARcdN(mediatorLiveData5, this, (java.lang.Boolean) obj);
            }
        }));
        mediatorLiveData5.addSource(mutableLiveData6, new ActionBar(new Function1() { // from class: o.szl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.copydefault(mediatorLiveData5, this, (java.lang.Integer) obj);
            }
        }));
        this.AubY = mediatorLiveData5;
        final MediatorLiveData mediatorLiveData6 = new MediatorLiveData();
        mediatorLiveData6.addSource(mutableLiveData2, new ActionBar(new Function1() { // from class: o.szp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.fIwbmz(mediatorLiveData6, this, (java.lang.Boolean) obj);
            }
        }));
        mediatorLiveData6.addSource(mutableLiveData5, new ActionBar(new Function1() { // from class: o.szr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.AEQbTJ(mediatorLiveData6, this, (java.util.HashSet) obj);
            }
        }));
        this.AuCTelauCTel = mediatorLiveData6;
        MutableLiveData<MandatoryFeedbackModel> mutableLiveData8 = new MutableLiveData<>();
        this.AkhnZx = mutableLiveData8;
        final MediatorLiveData mediatorLiveData7 = new MediatorLiveData();
        mediatorLiveData7.addSource(mutableLiveData2, new ActionBar(new Function1() { // from class: o.szt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.AhwBna(mediatorLiveData7, this, (java.lang.Boolean) obj);
            }
        }));
        mediatorLiveData7.addSource(mutableLiveData4, new ActionBar(new Function1() { // from class: o.szq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.KWHzl(mediatorLiveData7, this, (java.lang.String) obj);
            }
        }));
        this.getFieldNames = mediatorLiveData7;
        final MediatorLiveData mediatorLiveData8 = new MediatorLiveData();
        mediatorLiveData8.addSource(mutableLiveData2, new ActionBar(new Function1() { // from class: o.szg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.isConnected(mediatorLiveData8, this, (java.lang.Boolean) obj);
            }
        }));
        mediatorLiveData8.addSource(mutableLiveData3, new ActionBar(new Function1() { // from class: o.szs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.AkhnZx(mediatorLiveData8, this, (java.lang.Boolean) obj);
            }
        }));
        mediatorLiveData8.addSource(mutableLiveData, new ActionBar(new Function1() { // from class: o.szv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.copydefault(mediatorLiveData8, this, (C32989mnw) obj);
            }
        }));
        this.zsXlph = mediatorLiveData8;
        final MediatorLiveData mediatorLiveData9 = new MediatorLiveData();
        mediatorLiveData9.addSource(mediatorLiveData5, new ActionBar(new Function1() { // from class: o.szw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.OLrzqt(mediatorLiveData9, this, (RatingSubmitViewModel.StarModel) obj);
            }
        }));
        mediatorLiveData9.addSource(mediatorLiveData6, new ActionBar(new Function1() { // from class: o.szA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.AEQbTJ(mediatorLiveData9, this, (RatingSubmitViewModel.LabelModel) obj);
            }
        }));
        mediatorLiveData9.addSource(mediatorLiveData7, new ActionBar(new Function1() { // from class: o.szE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.KWHzl(mediatorLiveData9, this, (RatingSubmitViewModel.FeedbackModel) obj);
            }
        }));
        mediatorLiveData9.addSource(mutableLiveData, new ActionBar(new Function1() { // from class: o.szC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.AEQbTJ(mediatorLiveData9, this, (C32989mnw) obj);
            }
        }));
        mediatorLiveData9.addSource(mutableLiveData8, new ActionBar(new Function1() { // from class: o.szD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.AEQbTJ(mediatorLiveData9, this, (RatingSubmitViewModel.MandatoryFeedbackModel) obj);
            }
        }));
        mediatorLiveData9.addSource(mutableLiveData7, new ActionBar(new Function1() { // from class: o.szB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitViewModel.AEQbTJ(mediatorLiveData9, this, (java.lang.String) obj);
            }
        }));
        this.uzCIH = mediatorLiveData9;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.rating.viewmodel.RatingSubmitViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: com.okinc.okex.rating.viewmodel.RatingSubmitViewModel$Application$Application, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class C0551Application extends Application {
            public static final C0551Application KWHzl = new C0551Application();

            private C0551Application() {
                super(null);
            }
        }

        private Application() {
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class StateListAnimator extends Application {
            public final String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.KWHzl;
                }
                return stateListAnimator.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator OLrzqt(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((StateListAnimator) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "MessageFromBackend(message=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = str;
            }
        }
    }

    public static final Unit DbNXlk(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, Boolean bool) {
        mediatorLiveData.setValue(Boolean.valueOf(ratingSubmitViewModel.AwvSrB()));
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, Boolean bool) {
        mediatorLiveData.setValue(Boolean.valueOf(ratingSubmitViewModel.sSMYrx()));
        return Unit.INSTANCE;
    }

    public static final class TaskDescription {
        public static final TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }
    }

    public static final Unit values(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, Boolean bool) {
        mediatorLiveData.setValue(ratingSubmitViewModel.KWHzl());
        return Unit.INSTANCE;
    }

    public static final class TitleModel implements Parcelable {
        public final String EZpvd;
        public final int OLrzqt;
        public static final ActionBar Companion = new ActionBar(null);
        public static final Parcelable.Creator<TitleModel> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<TitleModel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TitleModel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new TitleModel(parcel.readString(), parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TitleModel[] newArray(int i) {
                return new TitleModel[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TitleModel copy$default(TitleModel titleModel, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = titleModel.EZpvd;
            }
            if ((i2 & 2) != 0) {
                i = titleModel.OLrzqt;
            }
            return titleModel.copydefault(str, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TitleModel copydefault(String str, int i) {
            return new TitleModel(str, i);
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
            if (!(obj instanceof TitleModel)) {
                return false;
            }
            TitleModel titleModel = (TitleModel) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) titleModel.EZpvd) && this.OLrzqt == titleModel.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.EZpvd;
            return ((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TitleModel(title=" + this.EZpvd + ", style=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.EZpvd);
            parcel.writeInt(this.OLrzqt);
        }

        public TitleModel(String str, int i) {
            this.EZpvd = str;
            this.OLrzqt = i;
        }

        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.rating.viewmodel.RatingSubmitViewModel.TitleModel.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }
        }
    }

    public static final Unit AuCTel(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, Boolean bool) {
        mediatorLiveData.setValue(ratingSubmitViewModel.valueOf());
        return Unit.INSTANCE;
    }

    public static final class StarModel implements Parcelable {
        public static final Parcelable.Creator<StarModel> CREATOR = new Creator();
        public final int OLrzqt;
        public final HashMap<Integer, String> copydefault;

        public static final class Creator implements Parcelable.Creator<StarModel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StarModel createFromParcel(Parcel parcel) {
                HashMap map;
                Intrinsics.checkNotNullParameter(parcel, "");
                int i = parcel.readInt();
                if (parcel.readInt() == 0) {
                    map = null;
                } else {
                    int i2 = parcel.readInt();
                    HashMap map2 = new HashMap(i2);
                    for (int i3 = 0; i3 != i2; i3++) {
                        map2.put(Integer.valueOf(parcel.readInt()), parcel.readString());
                    }
                    map = map2;
                }
                return new StarModel(i, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StarModel[] newArray(int i) {
                return new StarModel[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.rating.viewmodel.RatingSubmitViewModel$StarModel */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StarModel copy$default(StarModel starModel, int i, HashMap map, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = starModel.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                map = starModel.copydefault;
            }
            return starModel.OLrzqt(i, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StarModel OLrzqt(int i, HashMap<Integer, String> map) {
            return new StarModel(i, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HashMap<Integer, String> copydefault() {
            return this.copydefault;
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
            if (!(obj instanceof StarModel)) {
                return false;
            }
            StarModel starModel = (StarModel) obj;
            return this.OLrzqt == starModel.OLrzqt && Intrinsics.EZpvd(this.copydefault, starModel.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.OLrzqt);
            HashMap<Integer, String> map = this.copydefault;
            return (iHashCode * 31) + (map == null ? 0 : map.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "StarModel(selectedRating=" + this.OLrzqt + ", starLabels=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.OLrzqt);
            HashMap<Integer, String> map = this.copydefault;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                parcel.writeInt(entry.getKey().intValue());
                parcel.writeString(entry.getValue());
            }
        }

        public StarModel(int i, HashMap<Integer, String> map) {
            this.OLrzqt = i;
            this.copydefault = map;
        }
    }

    public static final Unit fARcdN(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, Boolean bool) {
        mediatorLiveData.setValue(ratingSubmitViewModel.djBIcL());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, Integer num) {
        mediatorLiveData.setValue(ratingSubmitViewModel.djBIcL());
        return Unit.INSTANCE;
    }

    public static final class LabelModel implements Parcelable {
        public static final Parcelable.Creator<LabelModel> CREATOR = new Creator();
        public final List<RatingLabelDisplayModel> KWHzl;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<LabelModel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LabelModel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(RatingLabelDisplayModel.CREATOR.createFromParcel(parcel));
                }
                return new LabelModel(string, arrayList);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LabelModel[] newArray(int i) {
                return new LabelModel[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.rating.viewmodel.RatingSubmitViewModel$LabelModel */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LabelModel copy$default(LabelModel labelModel, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = labelModel.copydefault;
            }
            if ((i & 2) != 0) {
                list = labelModel.KWHzl;
            }
            return labelModel.AEQbTJ(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LabelModel AEQbTJ(String str, @NotNull List<RatingLabelDisplayModel> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new LabelModel(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<RatingLabelDisplayModel> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.copydefault;
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
            if (!(obj instanceof LabelModel)) {
                return false;
            }
            LabelModel labelModel = (LabelModel) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) labelModel.copydefault) && Intrinsics.EZpvd(this.KWHzl, labelModel.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.copydefault;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LabelModel(title=" + this.copydefault + ", listOfLabelDisplay=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
            List<RatingLabelDisplayModel> list = this.KWHzl;
            parcel.writeInt(list.size());
            Iterator<RatingLabelDisplayModel> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }

        public LabelModel(String str, @NotNull List<RatingLabelDisplayModel> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = str;
            this.KWHzl = list;
        }

        public static final class LabelDetailModel implements Parcelable {
            public static final Parcelable.Creator<LabelDetailModel> CREATOR = new Creator();
            public final boolean AEQbTJ;
            public final GetSupportRatingBean.Label.LabelDetail copydefault;

            public static final class Creator implements Parcelable.Creator<LabelDetailModel> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LabelDetailModel createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new LabelDetailModel(GetSupportRatingBean.Label.LabelDetail.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LabelDetailModel[] newArray(int i) {
                    return new LabelDetailModel[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ LabelDetailModel copy$default(LabelDetailModel labelDetailModel, GetSupportRatingBean.Label.LabelDetail labelDetail, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    labelDetail = labelDetailModel.copydefault;
                }
                if ((i & 2) != 0) {
                    z = labelDetailModel.AEQbTJ;
                }
                return labelDetailModel.AEQbTJ(labelDetail, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LabelDetailModel AEQbTJ(@NotNull GetSupportRatingBean.Label.LabelDetail labelDetail, boolean z) {
                Intrinsics.checkNotNullParameter(labelDetail, "");
                return new LabelDetailModel(labelDetail, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GetSupportRatingBean.Label.LabelDetail EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean OLrzqt() {
                return this.AEQbTJ;
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
                if (!(obj instanceof LabelDetailModel)) {
                    return false;
                }
                LabelDetailModel labelDetailModel = (LabelDetailModel) obj;
                return Intrinsics.EZpvd(this.copydefault, labelDetailModel.copydefault) && this.AEQbTJ == labelDetailModel.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + Boolean.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "LabelDetailModel(detailModel=" + this.copydefault + ", isSelected=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                this.copydefault.writeToParcel(parcel, i);
                parcel.writeInt(this.AEQbTJ ? 1 : 0);
            }

            public LabelDetailModel(@NotNull GetSupportRatingBean.Label.LabelDetail labelDetail, boolean z) {
                Intrinsics.checkNotNullParameter(labelDetail, "");
                this.copydefault = labelDetail;
                this.AEQbTJ = z;
            }
        }
    }

    public static final Unit fIwbmz(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, Boolean bool) {
        mediatorLiveData.setValue(ratingSubmitViewModel.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, HashSet hashSet) {
        mediatorLiveData.setValue(ratingSubmitViewModel.EZpvd());
        return Unit.INSTANCE;
    }

    public static final class MandatoryFeedbackModel implements Parcelable {
        public static final Parcelable.Creator<MandatoryFeedbackModel> CREATOR = new Creator();
        public final boolean KWHzl;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<MandatoryFeedbackModel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MandatoryFeedbackModel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new MandatoryFeedbackModel(parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MandatoryFeedbackModel[] newArray(int i) {
                return new MandatoryFeedbackModel[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public MandatoryFeedbackModel() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ MandatoryFeedbackModel copy$default(MandatoryFeedbackModel mandatoryFeedbackModel, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mandatoryFeedbackModel.copydefault;
            }
            if ((i & 2) != 0) {
                z = mandatoryFeedbackModel.KWHzl;
            }
            return mandatoryFeedbackModel.copydefault(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MandatoryFeedbackModel copydefault(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new MandatoryFeedbackModel(str, z);
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
            if (!(obj instanceof MandatoryFeedbackModel)) {
                return false;
            }
            MandatoryFeedbackModel mandatoryFeedbackModel = (MandatoryFeedbackModel) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) mandatoryFeedbackModel.copydefault) && this.KWHzl == mandatoryFeedbackModel.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MandatoryFeedbackModel(feedbackHint=" + this.copydefault + ", isVisible=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
            parcel.writeInt(this.KWHzl ? 1 : 0);
        }

        public MandatoryFeedbackModel(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            this.KWHzl = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:142) call: com.okinc.okex.rating.viewmodel.RatingSubmitViewModel.MandatoryFeedbackModel.<init>(java.lang.String, boolean):void type: THIS */
        public /* synthetic */ MandatoryFeedbackModel(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
        }
    }

    public static final class FeedbackModel implements Parcelable {
        public static final Parcelable.Creator<FeedbackModel> CREATOR = new Creator();
        public final String KWHzl;

        public static final class Creator implements Parcelable.Creator<FeedbackModel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FeedbackModel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new FeedbackModel(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FeedbackModel[] newArray(int i) {
                return new FeedbackModel[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FeedbackModel copy$default(FeedbackModel feedbackModel, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feedbackModel.KWHzl;
            }
            return feedbackModel.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FeedbackModel KWHzl(String str) {
            return new FeedbackModel(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.KWHzl;
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
            return (obj instanceof FeedbackModel) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((FeedbackModel) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.KWHzl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FeedbackModel(feedback=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.KWHzl);
        }

        public FeedbackModel(String str) {
            this.KWHzl = str;
        }
    }

    public static final Unit AhwBna(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, Boolean bool) {
        mediatorLiveData.setValue(ratingSubmitViewModel.copydefault());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, String str) {
        mediatorLiveData.setValue(ratingSubmitViewModel.copydefault());
        return Unit.INSTANCE;
    }

    public static final class IsAgreeToJoinResearchModel implements Parcelable {
        public static final Parcelable.Creator<IsAgreeToJoinResearchModel> CREATOR = new Creator();
        public final boolean AEQbTJ;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<IsAgreeToJoinResearchModel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IsAgreeToJoinResearchModel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new IsAgreeToJoinResearchModel(parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IsAgreeToJoinResearchModel[] newArray(int i) {
                return new IsAgreeToJoinResearchModel[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ IsAgreeToJoinResearchModel copy$default(IsAgreeToJoinResearchModel isAgreeToJoinResearchModel, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = isAgreeToJoinResearchModel.copydefault;
            }
            if ((i & 2) != 0) {
                z = isAgreeToJoinResearchModel.AEQbTJ;
            }
            return isAgreeToJoinResearchModel.OLrzqt(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final IsAgreeToJoinResearchModel OLrzqt(String str, boolean z) {
            return new IsAgreeToJoinResearchModel(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.AEQbTJ;
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
            if (!(obj instanceof IsAgreeToJoinResearchModel)) {
                return false;
            }
            IsAgreeToJoinResearchModel isAgreeToJoinResearchModel = (IsAgreeToJoinResearchModel) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) isAgreeToJoinResearchModel.copydefault) && this.AEQbTJ == isAgreeToJoinResearchModel.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.copydefault;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "IsAgreeToJoinResearchModel(title=" + this.copydefault + ", isChecked=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
            parcel.writeInt(this.AEQbTJ ? 1 : 0);
        }

        public IsAgreeToJoinResearchModel(String str, boolean z) {
            this.copydefault = str;
            this.AEQbTJ = z;
        }
    }

    public static final Unit isConnected(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, Boolean bool) {
        mediatorLiveData.setValue(ratingSubmitViewModel.AEQbTJ());
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, Boolean bool) {
        mediatorLiveData.setValue(ratingSubmitViewModel.AEQbTJ());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, C32989mnw c32989mnw) {
        mediatorLiveData.setValue(ratingSubmitViewModel.AEQbTJ());
        return Unit.INSTANCE;
    }

    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.rating.viewmodel.RatingSubmitViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: com.okinc.okex.rating.viewmodel.RatingSubmitViewModel$Activity$Activity, reason: collision with other inner class name */
        public static final class C0550Activity extends Activity {
            public final boolean KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0550Activity copy$default(C0550Activity c0550Activity, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = c0550Activity.KWHzl;
                }
                return c0550Activity.AEQbTJ(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0550Activity AEQbTJ(boolean z) {
                return new C0550Activity(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0550Activity) && this.KWHzl == ((C0550Activity) obj).KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Boolean.hashCode(this.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SubmitButtonModel(isEnabled=" + this.KWHzl + ")";
            }

            public C0550Activity(boolean z) {
                super(null);
                this.KWHzl = z;
            }
        }

        private Activity() {
        }

        public static final class ActionBar extends Activity {
            public static final ActionBar OLrzqt = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }
    }

    public static final Unit OLrzqt(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, StarModel starModel) {
        mediatorLiveData.setValue(ratingSubmitViewModel.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, LabelModel labelModel) {
        mediatorLiveData.setValue(ratingSubmitViewModel.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, FeedbackModel feedbackModel) {
        mediatorLiveData.setValue(ratingSubmitViewModel.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, C32989mnw c32989mnw) {
        mediatorLiveData.setValue(ratingSubmitViewModel.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, MandatoryFeedbackModel mandatoryFeedbackModel) {
        mediatorLiveData.setValue(ratingSubmitViewModel.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MediatorLiveData mediatorLiveData, RatingSubmitViewModel ratingSubmitViewModel, String str) {
        mediatorLiveData.setValue(ratingSubmitViewModel.OLrzqt());
        return Unit.INSTANCE;
    }

    public final int isConnected() {
        Integer value = this.isConnected.getValue();
        if (value != null) {
            return value.intValue();
        }
        return 0;
    }

    public final boolean fetchVPNInfo() {
        Boolean value = this.valueOf.getValue();
        if (value != null) {
            return value.booleanValue();
        }
        return false;
    }

    public final boolean copydefault(Integer num) {
        return num != null && new IntRange(1, 5).AEQbTJ(num.intValue());
    }

    public final TaskDescription KWHzl() {
        boolean zFetchVPNInfo = fetchVPNInfo();
        GetSupportRatingBean.Layout layoutAEQbTJ = sxK.copydefault.AEQbTJ(zFetchVPNInfo, this.AEQbTJ.getValue());
        if (zFetchVPNInfo && layoutAEQbTJ != null && Intrinsics.EZpvd(layoutAEQbTJ.getDisplayStarRating(), Boolean.TRUE)) {
            return TaskDescription.KWHzl;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public final TitleModel valueOf() {
        Boolean displayStarRating;
        boolean zFetchVPNInfo = fetchVPNInfo();
        GetSupportRatingBean value = this.AEQbTJ.getValue();
        GetSupportRatingBean.Layout layoutAEQbTJ = sxK.copydefault.AEQbTJ(zFetchVPNInfo, value);
        return new TitleModel(value != null ? value.getModuleTitle() : null, !((layoutAEQbTJ == null || (displayStarRating = layoutAEQbTJ.getDisplayStarRating()) == null) ? 0 : displayStarRating.booleanValue()));
    }

    public final StarModel djBIcL() {
        boolean zFetchVPNInfo = fetchVPNInfo();
        GetSupportRatingBean value = this.AEQbTJ.getValue();
        GetSupportRatingBean.Layout layoutAEQbTJ = sxK.copydefault.AEQbTJ(zFetchVPNInfo, value);
        LinkedHashMap linkedHashMap = null;
        if (layoutAEQbTJ == null || !Intrinsics.EZpvd(layoutAEQbTJ.getDisplayStarRating(), Boolean.TRUE)) {
            return null;
        }
        if ((value != null ? value.getLabelsWithStarRating() : null) != null) {
            List<GetSupportRatingBean.Label> labelsWithStarRating = value.getLabelsWithStarRating();
            ArrayList<GetSupportRatingBean.Label> arrayList = new ArrayList();
            for (Object obj : labelsWithStarRating) {
                GetSupportRatingBean.Label label = (GetSupportRatingBean.Label) obj;
                if (label.getScore() != null && label.getStarLabel() != null) {
                    arrayList.add(obj);
                }
            }
            linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
            for (GetSupportRatingBean.Label label2 : arrayList) {
                Integer score = label2.getScore();
                Intrinsics.copydefault(score);
                int iIntValue = score.intValue();
                String starLabel = label2.getStarLabel();
                Intrinsics.copydefault((Object) starLabel);
                linkedHashMap.put(Integer.valueOf(iIntValue), starLabel);
            }
        }
        return new StarModel(isConnected(), linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LabelModel EZpvd() {
        GetSupportRatingBean.Label labelsWithoutStarRating;
        ArrayList<LabelModel.LabelDetailModel> arrayList;
        LabelModel labelModel;
        List<GetSupportRatingBean.Label.LabelDetail> labelDetailList;
        List<GetSupportRatingBean.Label> labelsWithStarRating;
        Object next;
        boolean zFetchVPNInfo = fetchVPNInfo();
        GetSupportRatingBean value = this.AEQbTJ.getValue();
        GetSupportRatingBean.Layout layoutAEQbTJ = sxK.copydefault.AEQbTJ(zFetchVPNInfo, value);
        HashSet<Long> value2 = this.ejfBZ.getValue();
        if (value2 == null) {
            value2 = new HashSet<>();
        }
        if (Intrinsics.EZpvd(layoutAEQbTJ != null ? layoutAEQbTJ.getDisplayLabel() : null, Boolean.TRUE)) {
            int iIsConnected = isConnected();
            if (copydefault(Integer.valueOf(iIsConnected))) {
                if (value == null || (labelsWithStarRating = value.getLabelsWithStarRating()) == null) {
                    labelsWithoutStarRating = value != null ? value.getLabelsWithoutStarRating() : null;
                } else {
                    Iterator<T> it = labelsWithStarRating.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        Integer score = ((GetSupportRatingBean.Label) next).getScore();
                        if (score != null && score.intValue() == iIsConnected) {
                            break;
                        }
                    }
                    labelsWithoutStarRating = (GetSupportRatingBean.Label) next;
                    if (labelsWithoutStarRating == null) {
                    }
                }
            } else if (value != null) {
                labelsWithoutStarRating = value.getLabelsWithoutStarRating();
            }
        }
        if (labelsWithoutStarRating == null || (labelDetailList = labelsWithoutStarRating.getLabelDetailList()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C56403yEb.AYXKKw(labelDetailList, 10));
            for (GetSupportRatingBean.Label.LabelDetail labelDetail : labelDetailList) {
                arrayList.add(new LabelModel.LabelDetailModel(labelDetail, CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends Long>) ((Iterable<? extends Object>) value2), labelDetail.getId())));
            }
        }
        String labelTitle = labelsWithoutStarRating != null ? labelsWithoutStarRating.getLabelTitle() : null;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (LabelModel.LabelDetailModel labelDetailModel : arrayList) {
                Long id = labelDetailModel.EZpvd().getId();
                RatingLabelDisplayModel ratingLabelDisplayModel = id != null ? new RatingLabelDisplayModel(id.longValue(), labelDetailModel.EZpvd().getPlaceholder(), labelDetailModel.OLrzqt()) : null;
                if (ratingLabelDisplayModel != null) {
                    arrayList2.add(ratingLabelDisplayModel);
                }
            }
            labelModel = new LabelModel(labelTitle, arrayList2);
        } else {
            labelModel = null;
        }
        List<GetSupportRatingBean.Label.LabelDetail> labelDetailList2 = labelsWithoutStarRating != null ? labelsWithoutStarRating.getLabelDetailList() : null;
        if (labelDetailList2 == null) {
            labelDetailList2 = yDY.AhwBna();
        }
        EZpvd(labelDetailList2);
        return labelModel;
    }

    public final void EZpvd(List<GetSupportRatingBean.Label.LabelDetail> list) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RatingSubmitViewModel$checkMandatoryFeedback$1(this, list, null), 3, null);
    }

    public final FeedbackModel copydefault() {
        Boolean displayFeedback;
        String value = this.EZpvd.getValue();
        GetSupportRatingBean.Layout layoutAEQbTJ = sxK.copydefault.AEQbTJ(fetchVPNInfo(), this.AEQbTJ.getValue());
        if (layoutAEQbTJ == null || (displayFeedback = layoutAEQbTJ.getDisplayFeedback()) == null || !displayFeedback.booleanValue()) {
            return null;
        }
        return new FeedbackModel(value);
    }

    public final IsAgreeToJoinResearchModel AEQbTJ() {
        boolean zFetchVPNInfo = fetchVPNInfo();
        GetSupportRatingBean value = this.AEQbTJ.getValue();
        GetSupportRatingBean.Layout layoutAEQbTJ = sxK.copydefault.AEQbTJ(zFetchVPNInfo, value);
        String checkbox = (!Intrinsics.EZpvd(layoutAEQbTJ != null ? layoutAEQbTJ.getDisplayCheckBox() : null, Boolean.TRUE) || value == null) ? null : value.getCheckbox();
        Boolean value2 = this.djBIcL.getValue();
        boolean zBooleanValue = value2 != null ? value2.booleanValue() : false;
        if (this.copydefault.getValue() != null || layoutAEQbTJ == null || checkbox == null) {
            return null;
        }
        return new IsAgreeToJoinResearchModel(checkbox, zBooleanValue);
    }

    public final boolean AwvSrB() {
        Boolean displaySolveStatus;
        GetSupportRatingBean.Layout layoutAEQbTJ = sxK.copydefault.AEQbTJ(fetchVPNInfo(), this.AEQbTJ.getValue());
        if (layoutAEQbTJ == null || (displaySolveStatus = layoutAEQbTJ.getDisplaySolveStatus()) == null) {
            return false;
        }
        return displaySolveStatus.booleanValue();
    }

    public final boolean sSMYrx() {
        Boolean displayEffortLessScore;
        GetSupportRatingBean.Layout layoutAEQbTJ = sxK.copydefault.AEQbTJ(fetchVPNInfo(), this.AEQbTJ.getValue());
        if (layoutAEQbTJ == null || (displayEffortLessScore = layoutAEQbTJ.getDisplayEffortLessScore()) == null) {
            return false;
        }
        return displayEffortLessScore.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Activity OLrzqt() {
        boolean z;
        boolean z2;
        String value;
        HashSet<Long> value2;
        String value3;
        Boolean displayLabel;
        Boolean displayStarRating;
        boolean zFetchVPNInfo = fetchVPNInfo();
        GetSupportRatingBean value4 = this.AEQbTJ.getValue();
        boolean z3 = true;
        boolean z4 = this.copydefault.getValue() != null;
        if (zFetchVPNInfo) {
            if ((value4 != null ? value4.getAppLayoutType() : null) == GetSupportRatingBean.AppLayoutType.HalfScreenRedirectToFullScreen) {
                z = true;
            }
        } else {
            z = false;
        }
        if (zFetchVPNInfo) {
            if ((value4 != null ? value4.getAppLayoutType() : null) == GetSupportRatingBean.AppLayoutType.HalfScreen && z4) {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (z || z2) {
            return null;
        }
        if (z4) {
            return Activity.ActionBar.OLrzqt;
        }
        GetSupportRatingBean.Layout layoutAEQbTJ = sxK.copydefault.AEQbTJ(zFetchVPNInfo, value4);
        boolean zBooleanValue = (layoutAEQbTJ == null || (displayStarRating = layoutAEQbTJ.getDisplayStarRating()) == null) ? false : displayStarRating.booleanValue();
        boolean zBooleanValue2 = (layoutAEQbTJ == null || (displayLabel = layoutAEQbTJ.getDisplayLabel()) == null) ? false : displayLabel.booleanValue();
        MandatoryFeedbackModel value5 = this.AkhnZx.getValue();
        boolean z5 = value5 == null || !value5.AEQbTJ() || ((value3 = this.gEmmrt.getValue()) != null && (StringsKt__StringsKt.fARcdN((CharSequence) value3) ^ true));
        if (!zBooleanValue ? !(!zBooleanValue2 ? !((value = this.EZpvd.getValue()) == null || value.length() == 0) : !((value2 = this.ejfBZ.getValue()) == null || value2.isEmpty())) : copydefault(this.isConnected.getValue())) {
            z3 = false;
        } else if (!z5) {
        }
        return new Activity.C0550Activity(z3);
    }

    public final void gHZMYf() {
        if (this.OLrzqt.getValue() == null) {
            this.OLrzqt.setValue(new C32989mnw<>(Unit.INSTANCE));
        }
    }

    public final void AxsJAY() {
        if (this.AhwBna.getValue() == null) {
            this.AhwBna.setValue(new C32989mnw<>(Unit.INSTANCE));
        }
    }

    public final void AEQbTJ(GetSupportRatingBean getSupportRatingBean, String str, JsonObject jsonObject, PreSubmitRatingBean preSubmitRatingBean, boolean z, String str2) {
        this.AEQbTJ.setValue(getSupportRatingBean);
        this.fARcdN.setValue(str);
        this.fetchVPNInfo.setValue(jsonObject);
        this.values.setValue(preSubmitRatingBean);
        this.valueOf.setValue(Boolean.valueOf(z));
        this.KWHzl.setValue(str2);
        AhwBna();
    }

    public final void AhwBna() {
        PreSubmitRatingBean value = this.values.getValue();
        if (value != null) {
            if (value.getScore() != null) {
                AEQbTJ(r0.intValue());
            }
            KWHzl(this.AEQbTJ.getValue(), this.fARcdN.getValue(), this.fetchVPNInfo.getValue());
        }
    }

    public final void KWHzl(boolean z) {
        if (fetchVPNInfo() != z) {
            this.valueOf.setValue(Boolean.valueOf(z));
        }
    }

    public final void OLrzqt(int i) {
        this.fIwbmz.setValue(Integer.valueOf(i));
    }

    public final void KWHzl(Boolean bool) {
        this.AuCTel.setValue(bool);
    }

    public final Integer values() {
        return this.fIwbmz.getValue();
    }

    public final Boolean getFieldNames() {
        return this.AuCTel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String ORxRYg() {
        return this.KWHzl.getValue();
    }

    public final void AEQbTJ(float f) {
        int iIsConnected = isConnected();
        int i = (int) f;
        if (copydefault(Integer.valueOf(i))) {
            iIsConnected = i;
        }
        this.isConnected.setValue(Integer.valueOf(iIsConnected));
        this.ejfBZ.setValue(null);
        AxsJAY();
    }

    public final void EZpvd(boolean z) {
        this.djBIcL.setValue(Boolean.valueOf(z));
    }

    public final void copydefault(String str) {
        this.EZpvd.setValue(str);
    }

    public final void OLrzqt(String str) {
        this.gEmmrt.setValue(str);
    }

    public final void EZpvd(Long l) {
        if (l != null) {
            long jLongValue = l.longValue();
            HashSet<Long> value = this.ejfBZ.getValue();
            if (value == null) {
                value = new HashSet<>();
            }
            if (value.contains(Long.valueOf(jLongValue))) {
                value.remove(Long.valueOf(jLongValue));
            } else {
                value.add(Long.valueOf(jLongValue));
            }
            this.ejfBZ.setValue(value);
        }
        gHZMYf();
    }

    public final void gEmmrt() {
        if (this.uzCIH.getValue() instanceof Activity.ActionBar) {
            this.DbNXlk.setValue(new C32989mnw<>(Unit.INSTANCE));
        }
    }

    public final void DTwDnp() {
        Activity value = this.uzCIH.getValue();
        GetSupportRatingBean value2 = this.AEQbTJ.getValue();
        JsonObject value3 = this.fetchVPNInfo.getValue();
        String value4 = this.fARcdN.getValue();
        if ((value instanceof Activity.C0550Activity) && ((Activity.C0550Activity) value).AEQbTJ()) {
            HashSet<Long> value5 = this.ejfBZ.getValue();
            if (value5 == null || !(!value5.isEmpty())) {
                value5 = null;
            }
            HashSet<Long> hashSet = value5;
            Long value6 = this.fJNWhG.getValue();
            if (value6 != null) {
                AEQbTJ(value6.longValue(), value2, hashSet, value3);
            } else {
                AEQbTJ(value2, hashSet, value4, value3);
            }
        }
    }

    public static final void OLrzqt(Function2 function2, Object obj, Object obj2) {
        function2.invoke(obj, obj2);
    }

    public static final Unit EZpvd(JsonObjectBuilder jsonObjectBuilder, String str, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        jsonObjectBuilder.put(str, jsonElement);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(GetSupportRatingBean getSupportRatingBean, HashSet<Long> hashSet, String str, JsonObject jsonObject) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RatingSubmitViewModel$postSubmitRating$1(this, hashSet, getSupportRatingBean, str, jsonObject, null), 3, null);
    }

    public static final void AEQbTJ(Function2 function2, Object obj, Object obj2) {
        function2.invoke(obj, obj2);
    }

    public static final Unit copydefault(JsonObjectBuilder jsonObjectBuilder, String str, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        jsonObjectBuilder.put(str, jsonElement);
        return Unit.INSTANCE;
    }

    public final GetSupportRatingBean.AppLayoutType AYXKKw() {
        GetSupportRatingBean value = this.AEQbTJ.getValue();
        if (value != null) {
            return value.getAppLayoutType();
        }
        return null;
    }

    public final void KWHzl(GetSupportRatingBean getSupportRatingBean, String str, JsonObject jsonObject) {
        final JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        Boolean fieldNames = getFieldNames();
        if (fieldNames != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "isSolved", Boolean.valueOf(fieldNames.booleanValue()));
        }
        Integer numValues = values();
        if (numValues != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "effortlessScore", Integer.valueOf(numValues.intValue()));
        }
        if (jsonObject != null) {
            final Function2 function2 = new Function2() { // from class: o.szx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return RatingSubmitViewModel.EZpvd(jsonObjectBuilder, (java.lang.String) obj, (JsonElement) obj2);
                }
            };
            jsonObject.forEach(new BiConsumer() { // from class: o.szy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.BiConsumer
                public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                    RatingSubmitViewModel.OLrzqt(function2, obj, obj2);
                }
            });
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RatingSubmitViewModel$preSubmitRating$1(getSupportRatingBean, str, this, jsonObjectBuilder.build(), null), 3, null);
    }

    public final void AEQbTJ(long j, GetSupportRatingBean getSupportRatingBean, HashSet<Long> hashSet, JsonObject jsonObject) {
        final JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        Boolean fieldNames = getFieldNames();
        if (fieldNames != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "isSolved", Boolean.valueOf(fieldNames.booleanValue()));
        }
        Integer numValues = values();
        if (numValues != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "effortlessScore", Integer.valueOf(numValues.intValue()));
        }
        if (jsonObject != null) {
            final Function2 function2 = new Function2() { // from class: o.szu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return RatingSubmitViewModel.copydefault(jsonObjectBuilder, (java.lang.String) obj, (JsonElement) obj2);
                }
            };
            jsonObject.forEach(new BiConsumer() { // from class: o.szz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.BiConsumer
                public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                    RatingSubmitViewModel.AEQbTJ(function2, obj, obj2);
                }
            });
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new RatingSubmitViewModel$postUpdateRating$1(this, hashSet, getSupportRatingBean, j, jsonObjectBuilder.build(), null), 3, null);
    }
}
