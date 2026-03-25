package com.okinc.business.defi.wallet.home.addressDetail.ui;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetChooseNetworkDialogFragment;
import com.okinc.uilab.list.OKAnchorSelection;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.AbstractC16516elR;
import o.C13754dXa;
import o.C13784dYd;
import o.C33070mpX;
import o.C33129mqd;
import o.C52761wXj;
import o.C52781wYc;
import o.C54862xYb;
import o.C54880xYt;
import o.C55043xcW;
import o.C55173xeu;
import o.C55230xfy;
import o.C55296xhK;
import o.C56407yEf;
import o.C57659ymb;
import o.C59454zhO;
import o.C9700baY;
import o.InterfaceC55105xdf;
import o.rVN;
import o.wXQ;
import o.wXX;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ProfileAssetChooseNetworkDialogFragment extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ;
    public AbstractC16516elR OLrzqt;
    public int gEmmrt = 2;
    public Function1<? super NetworkData, Unit> AhwBna = new Function1() { // from class: o.eYd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return ProfileAssetChooseNetworkDialogFragment.OLrzqt((ProfileAssetChooseNetworkDialogFragment.NetworkData) obj);
        }
    };
    public long KWHzl = Long.MIN_VALUE;
    public List<NetworkData> valueOf = yDY.AhwBna();
    public final String copydefault = "--";

    private final boolean copydefault(char c) {
        return ('a' <= c && c < '{') || ('A' <= c && c < '[');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Function1<? super NetworkData, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AhwBna = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.gEmmrt = i;
    }

    public static final Unit OLrzqt(NetworkData networkData) {
        Intrinsics.checkNotNullParameter(networkData, "");
        return Unit.INSTANCE;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetChooseNetworkDialogFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ ProfileAssetChooseNetworkDialogFragment newInstance$default(ActionBar actionBar, long j, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                j = Long.MIN_VALUE;
            }
            return actionBar.OLrzqt(j, list);
        }

        public final ProfileAssetChooseNetworkDialogFragment OLrzqt(long j, @NotNull List<NetworkData> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ProfileAssetChooseNetworkDialogFragment profileAssetChooseNetworkDialogFragment = new ProfileAssetChooseNetworkDialogFragment();
            Bundle bundle = new Bundle();
            if (list instanceof ArrayList) {
                bundle.putParcelableArrayList("origin_data_list", (ArrayList) list);
            } else {
                bundle.putParcelableArrayList("origin_data_list", new ArrayList<>(list));
            }
            bundle.putLong("current_chain_id", j);
            profileAssetChooseNetworkDialogFragment.setArguments(bundle);
            return profileAssetChooseNetworkDialogFragment;
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new Runnable() { // from class: o.eYa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ProfileAssetChooseNetworkDialogFragment.EZpvd(this.KWHzl);
            }
        });
    }

    public static final void EZpvd(ProfileAssetChooseNetworkDialogFragment profileAssetChooseNetworkDialogFragment) {
        rVN.reportFullyDrawn$default((Fragment) profileAssetChooseNetworkDialogFragment, true, (String) null, 2, (Object) null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        List<NetworkData> listAhwBna;
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        Bundle arguments = getArguments();
        this.KWHzl = arguments != null ? arguments.getLong("current_chain_id") : Long.MIN_VALUE;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (listAhwBna = arguments2.getParcelableArrayList("origin_data_list")) == null) {
            listAhwBna = yDY.AhwBna();
        }
        this.valueOf = listAhwBna;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        OKAnchorSelection oKAnchorSelection;
        C55230xfy c55230xfyDjBIcL;
        OKAnchorSelection oKAnchorSelection2;
        C55173xeu c55173xeuCopydefault;
        OKAnchorSelection oKAnchorSelection3;
        C55230xfy c55230xfyDjBIcL2;
        EditText editTextEZpvd;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC16516elR abstractC16516elREZpvd = AbstractC16516elR.EZpvd(LayoutInflater.from(getContext()), constraintLayout, false);
        this.OLrzqt = abstractC16516elREZpvd;
        constraintLayout.addView(abstractC16516elREZpvd != null ? abstractC16516elREZpvd.getRoot() : null);
        AbstractC16516elR abstractC16516elR = this.OLrzqt;
        if (abstractC16516elR != null && (oKAnchorSelection3 = abstractC16516elR.AEQbTJ) != null && (c55230xfyDjBIcL2 = oKAnchorSelection3.djBIcL()) != null && (editTextEZpvd = c55230xfyDjBIcL2.EZpvd()) != null) {
            editTextEZpvd.setHint(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getVisualMimeTypeactivity_release));
        }
        AbstractC16516elR abstractC16516elR2 = this.OLrzqt;
        if (abstractC16516elR2 != null && (oKAnchorSelection2 = abstractC16516elR2.AEQbTJ) != null && (c55173xeuCopydefault = oKAnchorSelection2.copydefault()) != null) {
            c55173xeuCopydefault.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsStartActivityForResult));
        }
        AbstractC16516elR abstractC16516elR3 = this.OLrzqt;
        if (abstractC16516elR3 != null && (oKAnchorSelection = abstractC16516elR3.AEQbTJ) != null && (c55230xfyDjBIcL = oKAnchorSelection.djBIcL()) != null) {
            c55230xfyDjBIcL.setVisibility(8);
        }
        EZpvd(this.valueOf);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsStartActivityForResultCompanion));
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.EZpvd().setVisibility(8);
        wxq.EZpvd().setImageResource(0);
        wxq.KWHzl().setVisibility(8);
        ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    public final String AEQbTJ(String str) {
        return Intrinsics.EZpvd((Object) str, (Object) this.copydefault) ? str : C54880xYt.formatValuationFromAsset$default(str, null, true, 0, false, 13, null);
    }

    public final void EZpvd(List<NetworkData> list) {
        final OKAnchorSelection oKAnchorSelection;
        OKAnchorSelection oKAnchorSelection2;
        List<InterfaceC55105xdf> listValueOf;
        OKAnchorSelection oKAnchorSelection3;
        List<InterfaceC55105xdf> listValueOf2;
        OKAnchorSelection oKAnchorSelection4;
        List<InterfaceC55105xdf> listValueOf3;
        ArrayList arrayList = new ArrayList();
        BigDecimal bigDecimal = new BigDecimal("0");
        BigDecimal bigDecimalKWHzl = bigDecimal;
        for (NetworkData networkData : list) {
            if (!Intrinsics.EZpvd((Object) networkData.getOriginAsset(), (Object) this.copydefault)) {
                bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimalKWHzl, networkData.getOriginAsset());
            }
        }
        arrayList.add(new NetworkData("", C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaSingleMimeType), "", C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null), Long.MIN_VALUE, 0, false, this.KWHzl == Long.MIN_VALUE, (String) null, 352, (DefaultConstructorMarker) null));
        AbstractC16516elR abstractC16516elR = this.OLrzqt;
        if (abstractC16516elR != null && (oKAnchorSelection4 = abstractC16516elR.AEQbTJ) != null && (listValueOf3 = oKAnchorSelection4.valueOf()) != null) {
            listValueOf3.add(new C13784dYd(false, "", CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList)));
        }
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<String> listAhwBna = yDY.AhwBna("");
        for (NetworkData networkData2 : list) {
            if (networkData2.isHotNetwork()) {
                arrayList3.add(networkData2);
            }
            if (networkData2.getChainName().length() > 0) {
                char cCharAt = networkData2.getChainName().charAt(0);
                if (copydefault(cCharAt)) {
                    char upperCase = Character.toUpperCase(cCharAt);
                    List arrayList4 = (List) map.get(Character.valueOf(upperCase));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        map.put(Character.valueOf(upperCase), arrayList4);
                    }
                    arrayList4.add(networkData2);
                } else {
                    arrayList2.add(networkData2);
                }
            }
        }
        if (arrayList3.size() > 0) {
            listAhwBna.add("★");
            C56407yEf.copydefault(arrayList3, new Comparator() { // from class: o.eYb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return ProfileAssetChooseNetworkDialogFragment.copydefault((ProfileAssetChooseNetworkDialogFragment.NetworkData) obj, (ProfileAssetChooseNetworkDialogFragment.NetworkData) obj2);
                }
            });
            AbstractC16516elR abstractC16516elR2 = this.OLrzqt;
            if (abstractC16516elR2 != null && (oKAnchorSelection3 = abstractC16516elR2.AEQbTJ) != null && (listValueOf2 = oKAnchorSelection3.valueOf()) != null) {
                listValueOf2.add(new C13784dYd(true, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ikEgkI), CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList3)));
            }
        }
        for (char c = 'A'; c < '['; c = (char) (c + 1)) {
            List list2 = (List) map.get(Character.valueOf(c));
            if (list2 != null) {
                listAhwBna.add(String.valueOf(c));
                AbstractC16516elR abstractC16516elR3 = this.OLrzqt;
                if (abstractC16516elR3 != null && (oKAnchorSelection2 = abstractC16516elR3.AEQbTJ) != null && (listValueOf = oKAnchorSelection2.valueOf()) != null) {
                    listValueOf.add(new C13784dYd(true, String.valueOf(c), CollectionsKt___CollectionsKt.fJNWhG((Collection) list2)));
                }
            }
        }
        AbstractC16516elR abstractC16516elR4 = this.OLrzqt;
        if (abstractC16516elR4 == null || (oKAnchorSelection = abstractC16516elR4.AEQbTJ) == null) {
            return;
        }
        oKAnchorSelection.setIndexList(listAhwBna);
        List<InterfaceC55105xdf> listValueOf4 = oKAnchorSelection.valueOf();
        if (listValueOf4 != null) {
            Iterator<T> it = listValueOf4.iterator();
            while (it.hasNext()) {
                oKAnchorSelection.OLrzqt((InterfaceC55105xdf) it.next());
            }
        }
        if (!this.AEQbTJ) {
            this.AEQbTJ = true;
            oKAnchorSelection.post(new Runnable() { // from class: o.eXZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileAssetChooseNetworkDialogFragment.KWHzl(this.KWHzl, oKAnchorSelection);
                }
            });
        }
        oKAnchorSelection.setConvertViewCallback(new Function2() { // from class: o.eYc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ProfileAssetChooseNetworkDialogFragment.AEQbTJ(this.EZpvd, oKAnchorSelection, (C55043xcW) obj, obj2);
            }
        });
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ProfileAssetChooseNetworkDialogFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, ProfileAssetChooseNetworkDialogFragment profileAssetChooseNetworkDialogFragment) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = profileAssetChooseNetworkDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    public static final int copydefault(NetworkData networkData, NetworkData networkData2) {
        if (networkData.getHotNetworkRank() > networkData2.getHotNetworkRank()) {
            return 1;
        }
        return networkData.getHotNetworkRank() == networkData2.getHotNetworkRank() ? 0 : -1;
    }

    public static final void KWHzl(ProfileAssetChooseNetworkDialogFragment profileAssetChooseNetworkDialogFragment, OKAnchorSelection oKAnchorSelection) {
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        AbstractC16516elR abstractC16516elR = profileAssetChooseNetworkDialogFragment.OLrzqt;
        if (abstractC16516elR == null || (frameLayout = abstractC16516elR.OLrzqt) == null || (layoutParams = frameLayout.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = oKAnchorSelection.getHeight();
    }

    public static final Unit AEQbTJ(final ProfileAssetChooseNetworkDialogFragment profileAssetChooseNetworkDialogFragment, OKAnchorSelection oKAnchorSelection, C55043xcW c55043xcW, Object obj) {
        String strOLrzqt;
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        Intrinsics.copydefault(obj, "");
        final NetworkData networkData = (NetworkData) obj;
        c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialhOMIpD, networkData.getChainName());
        c55043xcW.EZpvd(C13754dXa.ActionBar.DPHOMC, profileAssetChooseNetworkDialogFragment.AEQbTJ(networkData.getOriginAsset()));
        c55043xcW.OLrzqt(C13754dXa.ActionBar.setMediaUri, false);
        c55043xcW.OLrzqt(C13754dXa.ActionBar.DPHOMC, true);
        if (networkData.getChainId() == profileAssetChooseNetworkDialogFragment.KWHzl) {
            ImageView imageView = (ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialsiEkQe);
            if (imageView != null) {
                imageView.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(oKAnchorSelection.getContext(), C52761wXj.Activity.OJuSTm)));
            }
            c55043xcW.OLrzqt(C13754dXa.ActionBar.invokespecialsiEkQe, true);
        } else {
            c55043xcW.OLrzqt(C13754dXa.ActionBar.invokespecialsiEkQe, false);
        }
        if (networkData.getChainId() == Long.MIN_VALUE) {
            ImageView imageView2 = (ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialaKhcqp);
            if (imageView2 != null) {
                Glide.KWHzl(imageView2).OLrzqt(Integer.valueOf(C52761wXj.TaskDescription.createSocket)).EZpvd(imageView2);
            }
        } else {
            if (C33129mqd.OLrzqt((CharSequence) networkData.getCoinUrl())) {
                strOLrzqt = networkData.getCoinUrl();
            } else {
                strOLrzqt = C9700baY.OLrzqt(String.valueOf(C59454zhO.wlaJM(networkData.getSymbol())));
            }
            String str = strOLrzqt;
            ImageView imageView3 = (ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialaKhcqp);
            if (imageView3 != null) {
                C57659ymb.loadFixSizeBorderImage$default(imageView3, str, C52761wXj.TaskDescription.fERRXa, 0.0f, 0.0f, 12, null);
            }
        }
        c55043xcW.OLrzqt(C13754dXa.ActionBar.ROgMPW, C33129mqd.OLrzqt((CharSequence) networkData.getTagContent()));
        c55043xcW.EZpvd(C13754dXa.ActionBar.ROgMPW, networkData.getTagContent());
        c55043xcW.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.eXV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ProfileAssetChooseNetworkDialogFragment.EZpvd(this.AEQbTJ, networkData, view);
            }
        });
        ImageView imageView4 = (ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialsiEkQe);
        if (imageView4 != null) {
            ViewGroup.LayoutParams layoutParams = imageView4.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginEnd(0);
                imageView4.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ProfileAssetChooseNetworkDialogFragment profileAssetChooseNetworkDialogFragment, NetworkData networkData, View view) {
        profileAssetChooseNetworkDialogFragment.AhwBna.invoke(networkData);
        profileAssetChooseNetworkDialogFragment.dismissAllowingStateLoss();
    }

    @Serializable
    public static final class NetworkData implements Parcelable {
        private final long chainId;
        private final String chainName;
        private final String coinUrl;
        private final int hotNetworkRank;
        private boolean isHotNetwork;
        private boolean isSelect;
        private String originAsset;
        private final String symbol;
        private String tagContent;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<NetworkData> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<NetworkData> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new NetworkData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkData[] newArray(int i) {
                return new NetworkData[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.coinUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.chainName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.symbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.originAsset;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component5() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component6() {
            return this.hotNetworkRank;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component7() {
            return this.isHotNetwork;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component8() {
            return this.isSelect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.tagContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, int i, boolean z, boolean z2, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new NetworkData(str, str2, str3, str4, j, i, z, z2, str5);
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
            if (!(obj instanceof NetworkData)) {
                return false;
            }
            NetworkData networkData = (NetworkData) obj;
            return Intrinsics.EZpvd((Object) this.coinUrl, (Object) networkData.coinUrl) && Intrinsics.EZpvd((Object) this.chainName, (Object) networkData.chainName) && Intrinsics.EZpvd((Object) this.symbol, (Object) networkData.symbol) && Intrinsics.EZpvd((Object) this.originAsset, (Object) networkData.originAsset) && this.chainId == networkData.chainId && this.hotNetworkRank == networkData.hotNetworkRank && this.isHotNetwork == networkData.isHotNetwork && this.isSelect == networkData.isSelect && Intrinsics.EZpvd((Object) this.tagContent, (Object) networkData.tagContent);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainName() {
            return this.chainName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCoinUrl() {
            return this.coinUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getHotNetworkRank() {
            return this.hotNetworkRank;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOriginAsset() {
            return this.originAsset;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSymbol() {
            return this.symbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTagContent() {
            return this.tagContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((this.coinUrl.hashCode() * 31) + this.chainName.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.originAsset.hashCode()) * 31) + Long.hashCode(this.chainId)) * 31) + Integer.hashCode(this.hotNetworkRank)) * 31) + Boolean.hashCode(this.isHotNetwork)) * 31) + Boolean.hashCode(this.isSelect)) * 31) + this.tagContent.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isHotNetwork() {
            return this.isHotNetwork;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isSelect() {
            return this.isSelect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setHotNetwork(boolean z) {
            this.isHotNetwork = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOriginAsset(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.originAsset = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSelect(boolean z) {
            this.isSelect = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTagContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.tagContent = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "NetworkData(coinUrl=" + this.coinUrl + ", chainName=" + this.chainName + ", symbol=" + this.symbol + ", originAsset=" + this.originAsset + ", chainId=" + this.chainId + ", hotNetworkRank=" + this.hotNetworkRank + ", isHotNetwork=" + this.isHotNetwork + ", isSelect=" + this.isSelect + ", tagContent=" + this.tagContent + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.coinUrl);
            parcel.writeString(this.chainName);
            parcel.writeString(this.symbol);
            parcel.writeString(this.originAsset);
            parcel.writeLong(this.chainId);
            parcel.writeInt(this.hotNetworkRank);
            parcel.writeInt(this.isHotNetwork ? 1 : 0);
            parcel.writeInt(this.isSelect ? 1 : 0);
            parcel.writeString(this.tagContent);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetChooseNetworkDialogFragment.NetworkData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<NetworkData> serializer() {
                return ProfileAssetChooseNetworkDialogFragment$NetworkData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ NetworkData(int i, String str, String str2, String str3, String str4, long j, int i2, boolean z, boolean z2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, ProfileAssetChooseNetworkDialogFragment$NetworkData$$serializer.INSTANCE.getDescriptor());
            }
            this.coinUrl = str;
            this.chainName = str2;
            this.symbol = str3;
            this.originAsset = str4;
            if ((i & 16) == 0) {
                this.chainId = Long.MIN_VALUE;
            } else {
                this.chainId = j;
            }
            if ((i & 32) == 0) {
                this.hotNetworkRank = 0;
            } else {
                this.hotNetworkRank = i2;
            }
            if ((i & 64) == 0) {
                this.isHotNetwork = false;
            } else {
                this.isHotNetwork = z;
            }
            if ((i & 128) == 0) {
                this.isSelect = false;
            } else {
                this.isSelect = z2;
            }
            if ((i & 256) == 0) {
                this.tagContent = "";
            } else {
                this.tagContent = str5;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(NetworkData networkData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, networkData.coinUrl);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, networkData.chainName);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, networkData.symbol);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, networkData.originAsset);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || networkData.chainId != Long.MIN_VALUE) {
                compositeEncoder.encodeLongElement(serialDescriptor, 4, networkData.chainId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || networkData.hotNetworkRank != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 5, networkData.hotNetworkRank);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || networkData.isHotNetwork) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 6, networkData.isHotNetwork);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || networkData.isSelect) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 7, networkData.isSelect);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) networkData.tagContent, (Object) "")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 8, networkData.tagContent);
        }

        public NetworkData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, int i, boolean z, boolean z2, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.coinUrl = str;
            this.chainName = str2;
            this.symbol = str3;
            this.originAsset = str4;
            this.chainId = j;
            this.hotNetworkRank = i;
            this.isHotNetwork = z;
            this.isSelect = z2;
            this.tagContent = str5;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (Long.MIN_VALUE long) : (r19v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r21v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, boolean, boolean, java.lang.String):void (m)] (LINE:271) call: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetChooseNetworkDialogFragment.NetworkData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, boolean, boolean, java.lang.String):void type: THIS */
        public /* synthetic */ NetworkData(String str, String str2, String str3, String str4, long j, int i, boolean z, boolean z2, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i2 & 16) != 0 ? Long.MIN_VALUE : j, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? "" : str5);
        }
    }
}
