package com.okinc.business.defi.wallet.switchComponent.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.bumptech.glide.Glide;
import com.okinc.account.api.model.login.BindConst;
import com.okinc.business.defi.wallet.switchComponent.activity.DappSwitchNetworkActivity;
import com.okinc.core.util.SPUtils;
import com.okinc.uilab.list.OKAnchorSelection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC33013moT;
import o.C13754dXa;
import o.C13784dYd;
import o.C16317ehe;
import o.C17743fQq;
import o.C33570myu;
import o.C43251rlk;
import o.C52761wXj;
import o.C55043xcW;
import o.C55173xeu;
import o.C55296xhK;
import o.C55298xhM;
import o.C55378xin;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC9852bdR;
import o.fRN;
import o.wYC;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class DappSwitchNetworkActivity extends AbstractActivityC33013moT implements C17743fQq.ActionBar {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public C16317ehe copydefault;

    public DappSwitchNetworkActivity() {
        final Function0 function0 = null;
        this.AEQbTJ = new ViewModelLazy(C56524yIo.AEQbTJ(fRN.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.switchComponent.activity.DappSwitchNetworkActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0() { // from class: o.fQg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DappSwitchNetworkActivity.AYXKKw();
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.switchComponent.activity.DappSwitchNetworkActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public final fRN EZpvd() {
        return (fRN) this.AEQbTJ.getValue();
    }

    public static final fRN AEQbTJ(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new fRN(SavedStateHandleSupport.createSavedStateHandle(creationExtras), ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault());
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C16317ehe c16317eheEZpvd = C16317ehe.EZpvd(getLayoutInflater());
        this.copydefault = c16317eheEZpvd;
        if (c16317eheEZpvd == null) {
            Intrinsics.gEmmrt("");
            c16317eheEZpvd = null;
        }
        setContentView(c16317eheEZpvd.getRoot());
        djBIcL();
        AEQbTJ();
        copydefault();
        gEmmrt();
    }

    public final void djBIcL() {
        C16317ehe c16317ehe = this.copydefault;
        C16317ehe c16317ehe2 = null;
        if (c16317ehe == null) {
            Intrinsics.gEmmrt("");
            c16317ehe = null;
        }
        C55378xin c55378xin = c16317ehe.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55378xin, "");
        ViewGroup.LayoutParams layoutParams = c55378xin.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin += C33570myu.AEQbTJ((Context) this);
            c55378xin.setLayoutParams(marginLayoutParams);
            C16317ehe c16317ehe3 = this.copydefault;
            if (c16317ehe3 == null) {
                Intrinsics.gEmmrt("");
                c16317ehe3 = null;
            }
            c16317ehe3.copydefault.EZpvd().setOnClickListener(new View.OnClickListener() { // from class: o.fQe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    DappSwitchNetworkActivity.EZpvd(this.KWHzl, view);
                }
            });
            Drawable drawable = ContextCompat.getDrawable(this, C52761wXj.TaskDescription.iMXFZQ);
            C16317ehe c16317ehe4 = this.copydefault;
            if (c16317ehe4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16317ehe2 = c16317ehe4;
            }
            wYC wycCopydefault = c16317ehe2.copydefault.copydefault(drawable);
            if (wycCopydefault != null) {
                wycCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.fQc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        DappSwitchNetworkActivity.AEQbTJ(this.AEQbTJ, view);
                    }
                });
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void EZpvd(DappSwitchNetworkActivity dappSwitchNetworkActivity, View view) {
        dappSwitchNetworkActivity.finish();
    }

    public static final void AEQbTJ(DappSwitchNetworkActivity dappSwitchNetworkActivity, View view) {
        dappSwitchNetworkActivity.valueOf();
    }

    public final void AEQbTJ() {
        C16317ehe c16317ehe = this.copydefault;
        C16317ehe c16317ehe2 = null;
        if (c16317ehe == null) {
            Intrinsics.gEmmrt("");
            c16317ehe = null;
        }
        c16317ehe.OLrzqt.setStyle(OKAnchorSelection.OKAnchorSelectionStyle.PAGE);
        C16317ehe c16317ehe3 = this.copydefault;
        if (c16317ehe3 == null) {
            Intrinsics.gEmmrt("");
            c16317ehe3 = null;
        }
        c16317ehe3.OLrzqt.djBIcL().EZpvd().setHint(getString(C13754dXa.FragmentManager.getVisualMimeTypeactivity_release));
        C16317ehe c16317ehe4 = this.copydefault;
        if (c16317ehe4 == null) {
            Intrinsics.gEmmrt("");
            c16317ehe4 = null;
        }
        C55173xeu c55173xeuCopydefault = c16317ehe4.OLrzqt.copydefault();
        if (c55173xeuCopydefault != null) {
            String string = getString(C13754dXa.FragmentManager.ActivityResultContractsStartActivityForResult);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeuCopydefault.setTitle(string);
        }
        C16317ehe c16317ehe5 = this.copydefault;
        if (c16317ehe5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16317ehe2 = c16317ehe5;
        }
        c16317ehe2.OLrzqt.EZpvd();
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DappSwitchNetworkActivity$observeNetworkResults$1(this, null), 3, null);
    }

    public final void EZpvd(OKAnchorSelection oKAnchorSelection, List<fRN.ActionBar> list, Map<String, ? extends List<fRN.ActionBar>> map, boolean z) {
        List<String> listAxsJAYaxsJAY = CollectionsKt___CollectionsKt.AxsJAYaxsJAY(map.keySet());
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            arrayList.add("★");
        }
        arrayList.addAll(listAxsJAYaxsJAY);
        oKAnchorSelection.setIndexList(arrayList);
        if (!list.isEmpty()) {
            oKAnchorSelection.OLrzqt(new C13784dYd(z, getString(C13754dXa.FragmentManager.ikEgkI), CollectionsKt___CollectionsKt.fJNWhG((Collection) list)));
        }
        for (String str : listAxsJAYaxsJAY) {
            List<fRN.ActionBar> listAhwBna = map.get(str);
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            oKAnchorSelection.OLrzqt(new C13784dYd(z, str, CollectionsKt___CollectionsKt.fJNWhG((Collection) listAhwBna)));
        }
    }

    public final void copydefault(final OKAnchorSelection oKAnchorSelection, final List<fRN.ActionBar> list) {
        oKAnchorSelection.setConvertViewId(C13754dXa.TaskDescription.svY);
        oKAnchorSelection.setConvertViewCallback(new Function2() { // from class: o.fQb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return DappSwitchNetworkActivity.copydefault(this.KWHzl, (C55043xcW) obj, obj2);
            }
        });
        oKAnchorSelection.setSearchResultCallback(new Function1() { // from class: o.fQd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DappSwitchNetworkActivity.EZpvd(list, oKAnchorSelection, (java.lang.CharSequence) obj);
            }
        });
    }

    public static final Unit copydefault(DappSwitchNetworkActivity dappSwitchNetworkActivity, C55043xcW c55043xcW, Object obj) {
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        Intrinsics.copydefault(obj, "");
        fRN.ActionBar actionBar = (fRN.ActionBar) obj;
        c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialhOMIpD, actionBar.OLrzqt());
        c55043xcW.OLrzqt(C13754dXa.ActionBar.setMediaUri, false);
        Drawable drawable = ContextCompat.getDrawable(c55043xcW.itemView.getContext(), C52761wXj.TaskDescription.fERRXa);
        ImageView imageView = (ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialaKhcqp);
        if (imageView != null) {
            Glide.KWHzl(imageView).EZpvd(actionBar.AEQbTJ()).AEQbTJ(drawable).EZpvd(drawable).OLrzqt(drawable).EZpvd(imageView);
        }
        ImageView imageView2 = (ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialsiEkQe);
        if (imageView2 != null) {
            imageView2.setVisibility(actionBar.copydefault() ? 0 : 8);
        }
        View viewEZpvd = c55043xcW.EZpvd(C13754dXa.ActionBar.DPHOMC);
        if (viewEZpvd != null) {
            viewEZpvd.setVisibility(8);
        }
        View viewEZpvd2 = c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialhOMIpD);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (viewEZpvd2 != null ? viewEZpvd2.getLayoutParams() : null);
        if (marginLayoutParams != null) {
            Context context = c55043xcW.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            marginLayoutParams.topMargin = C55298xhM.copydefault(25.0f, context);
        }
        if (viewEZpvd2 != null) {
            viewEZpvd2.setLayoutParams(marginLayoutParams);
        }
        View view = c55043xcW.itemView;
        view.setOnClickListener(new Application(view, 1000L, dappSwitchNetworkActivity, actionBar));
        return Unit.INSTANCE;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ fRN.ActionBar AEQbTJ;
        public final /* synthetic */ DappSwitchNetworkActivity EZpvd;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, DappSwitchNetworkActivity dappSwitchNetworkActivity, fRN.ActionBar actionBar) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = dappSwitchNetworkActivity;
            this.AEQbTJ = actionBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.OLrzqt(this.AEQbTJ.KWHzl());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(long j) {
        Intent intent = new Intent();
        intent.putExtra(BindConst.TELEGRAM_RESULT_KEY, new SwitchNetworkActivityResult(j));
        setResult(-1, intent);
        finish();
    }

    public static final class SwitchNetworkActivityInput implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SwitchNetworkActivityInput> CREATOR = new Creator();
        private final List<Long> popularGeneralChainIds;
        private final long selectedGeneralChainId;
        private final List<Long> supportedGeneralChainIds;

        public static final class Creator implements Parcelable.Creator<SwitchNetworkActivityInput> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SwitchNetworkActivityInput createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                long j = parcel.readLong();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
                return new SwitchNetworkActivityInput(j, arrayList, arrayList2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SwitchNetworkActivityInput[] newArray(int i) {
                return new SwitchNetworkActivityInput[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.switchComponent.activity.DappSwitchNetworkActivity$SwitchNetworkActivityInput */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SwitchNetworkActivityInput copy$default(SwitchNetworkActivityInput switchNetworkActivityInput, long j, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = switchNetworkActivityInput.selectedGeneralChainId;
            }
            if ((i & 2) != 0) {
                list = switchNetworkActivityInput.popularGeneralChainIds;
            }
            if ((i & 4) != 0) {
                list2 = switchNetworkActivityInput.supportedGeneralChainIds;
            }
            return switchNetworkActivityInput.copy(j, list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.selectedGeneralChainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Long> component2() {
            return this.popularGeneralChainIds;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Long> component3() {
            return this.supportedGeneralChainIds;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SwitchNetworkActivityInput copy(long j, @NotNull List<Long> list, @NotNull List<Long> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new SwitchNetworkActivityInput(j, list, list2);
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
            if (!(obj instanceof SwitchNetworkActivityInput)) {
                return false;
            }
            SwitchNetworkActivityInput switchNetworkActivityInput = (SwitchNetworkActivityInput) obj;
            return this.selectedGeneralChainId == switchNetworkActivityInput.selectedGeneralChainId && Intrinsics.EZpvd(this.popularGeneralChainIds, switchNetworkActivityInput.popularGeneralChainIds) && Intrinsics.EZpvd(this.supportedGeneralChainIds, switchNetworkActivityInput.supportedGeneralChainIds);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Long> getPopularGeneralChainIds() {
            return this.popularGeneralChainIds;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getSelectedGeneralChainId() {
            return this.selectedGeneralChainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Long> getSupportedGeneralChainIds() {
            return this.supportedGeneralChainIds;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Long.hashCode(this.selectedGeneralChainId) * 31) + this.popularGeneralChainIds.hashCode()) * 31) + this.supportedGeneralChainIds.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SwitchNetworkActivityInput(selectedGeneralChainId=" + this.selectedGeneralChainId + ", popularGeneralChainIds=" + this.popularGeneralChainIds + ", supportedGeneralChainIds=" + this.supportedGeneralChainIds + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeLong(this.selectedGeneralChainId);
            List<Long> list = this.popularGeneralChainIds;
            parcel.writeInt(list.size());
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeLong(it.next().longValue());
            }
            List<Long> list2 = this.supportedGeneralChainIds;
            parcel.writeInt(list2.size());
            Iterator<Long> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeLong(it2.next().longValue());
            }
        }

        public SwitchNetworkActivityInput(long j, @NotNull List<Long> list, @NotNull List<Long> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.selectedGeneralChainId = j;
            this.popularGeneralChainIds = list;
            this.supportedGeneralChainIds = list2;
        }
    }

    public static final class SwitchNetworkActivityResult implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<SwitchNetworkActivityResult> CREATOR = new Creator();
        private final long generalChainId;

        public static final class Creator implements Parcelable.Creator<SwitchNetworkActivityResult> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SwitchNetworkActivityResult createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SwitchNetworkActivityResult(parcel.readLong());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SwitchNetworkActivityResult[] newArray(int i) {
                return new SwitchNetworkActivityResult[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SwitchNetworkActivityResult copy$default(SwitchNetworkActivityResult switchNetworkActivityResult, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = switchNetworkActivityResult.generalChainId;
            }
            return switchNetworkActivityResult.copy(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.generalChainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SwitchNetworkActivityResult copy(long j) {
            return new SwitchNetworkActivityResult(j);
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
            return (obj instanceof SwitchNetworkActivityResult) && this.generalChainId == ((SwitchNetworkActivityResult) obj).generalChainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getGeneralChainId() {
            return this.generalChainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Long.hashCode(this.generalChainId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SwitchNetworkActivityResult(generalChainId=" + this.generalChainId + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeLong(this.generalChainId);
        }

        public SwitchNetworkActivityResult(long j) {
            this.generalChainId = j;
        }
    }

    public final void gEmmrt() {
        if (Companion.AEQbTJ()) {
            return;
        }
        valueOf();
    }

    public final void valueOf() {
        C17743fQq.Companion.KWHzl().show(getSupportFragmentManager(), C17743fQq.class.getSimpleName());
    }

    @Override // o.C17743fQq.ActionBar
    public void KWHzl() {
        Companion.KWHzl();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.switchComponent.activity.DappSwitchNetworkActivity.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final boolean AEQbTJ() {
            return SPUtils.getBoolean("key_has_shown_switch_network_info", false);
        }

        public final void KWHzl() {
            SPUtils.put("key_has_shown_switch_network_info", Boolean.TRUE);
        }
    }

    public static final class ActionBar extends ActivityResultContract<SwitchNetworkActivityInput, SwitchNetworkActivityResult> {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@NotNull Context context, @NotNull SwitchNetworkActivityInput switchNetworkActivityInput) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(switchNetworkActivityInput, "");
            Intent intent = new Intent(context, (Class<?>) DappSwitchNetworkActivity.class);
            intent.putExtra("SELECTED_CHAIN_ID", switchNetworkActivityInput.getSelectedGeneralChainId());
            intent.putExtra("POPULAR_CHAIN_IDS", new ArrayList(switchNetworkActivityInput.getPopularGeneralChainIds()));
            intent.putExtra("SUPPORTED_CHAIN_IDS", new ArrayList(switchNetworkActivityInput.getSupportedGeneralChainIds()));
            return intent;
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public SwitchNetworkActivityResult parseResult(int i, Intent intent) {
            Parcelable parcelableExtra;
            if (i != -1 || intent == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = (Parcelable) intent.getParcelableExtra(BindConst.TELEGRAM_RESULT_KEY, SwitchNetworkActivityResult.class);
            } else {
                parcelableExtra = intent.getParcelableExtra(BindConst.TELEGRAM_RESULT_KEY);
            }
            return (SwitchNetworkActivityResult) parcelableExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory AYXKKw() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(fRN.class), new Function1() { // from class: o.fQf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DappSwitchNetworkActivity.AEQbTJ((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    public static final Unit EZpvd(List list, OKAnchorSelection oKAnchorSelection, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            fRN.ActionBar actionBar = (fRN.ActionBar) obj;
            if (charSequence == null || StringsKt__StringsKt.AhwBna((CharSequence) actionBar.OLrzqt(), charSequence, true)) {
                arrayList.add(obj);
            }
        }
        oKAnchorSelection.setSearchResultList(CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
