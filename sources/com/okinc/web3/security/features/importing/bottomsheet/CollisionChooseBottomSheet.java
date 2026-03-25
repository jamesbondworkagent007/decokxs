package com.okinc.web3.security.features.importing.bottomsheet;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import com.okinc.web3.security.features.importing.widget.CollisionCell;
import com.okinc.web3.security.model.TonAddress;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C52761wXj;
import o.C55326xho;
import o.C57407yho;
import o.wXQ;
import o.wXX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class CollisionChooseBottomSheet extends wXX {
    public static final String ADDRESS_INFO = "AddressInfo";
    private CollisionCell multiChainSelector;
    private OnItemClickListener onItemClickListener;
    private TonAddress tonAddress;
    private CollisionCell tonChainSelector;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes17.dex */
    public interface OnItemClickListener {
        void hdItemClick(TonAddress tonAddress);

        void tonItemClick(TonAddress tonAddress);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.features.importing.bottomsheet.CollisionChooseBottomSheet.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CollisionChooseBottomSheet newInstance(@NotNull TonAddress tonAddress) {
            Intrinsics.checkNotNullParameter(tonAddress, "");
            CollisionChooseBottomSheet collisionChooseBottomSheet = new CollisionChooseBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putParcelable(CollisionChooseBottomSheet.ADDRESS_INFO, tonAddress);
            collisionChooseBottomSheet.setArguments(bundle);
            return collisionChooseBottomSheet;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        LayoutInflater.from(getContext()).inflate(C57407yho.StateListAnimator.copydefault, (ViewGroup) constraintLayout, true);
        if (getContext() == null) {
            return;
        }
        this.multiChainSelector = (CollisionCell) constraintLayout.findViewById(C57407yho.Application.RJOkX);
        this.tonChainSelector = (CollisionCell) constraintLayout.findViewById(C57407yho.Application.giSNqX);
        CollisionCell collisionCell = this.multiChainSelector;
        Drawable drawable = null;
        if (collisionCell != null) {
            Drawable drawable2 = ContextCompat.getDrawable(requireContext(), C52761wXj.TaskDescription.OmPrLP);
            if (drawable2 != null) {
                drawable2.setTint(ContextCompat.getColor(requireContext(), C52761wXj.Activity.DTeKQX));
            } else {
                drawable2 = null;
            }
            collisionCell.setStartDrawable(drawable2);
        }
        CollisionCell collisionCell2 = this.multiChainSelector;
        if (collisionCell2 != null) {
            Drawable drawable3 = ContextCompat.getDrawable(requireContext(), C52761wXj.TaskDescription.DGUQLI);
            if (drawable3 != null) {
                drawable3.setTint(ContextCompat.getColor(requireContext(), C52761wXj.Activity.QwvEab));
            } else {
                drawable3 = null;
            }
            collisionCell2.setArrow(drawable3);
        }
        CollisionCell collisionCell3 = this.multiChainSelector;
        if (collisionCell3 != null) {
            collisionCell3.setClickListener(new Function1() { // from class: com.okinc.web3.security.features.importing.bottomsheet.CollisionChooseBottomSheet$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CollisionChooseBottomSheet.onCreateContent$lambda$2(this.f$0, (View) obj);
                }
            });
        }
        CollisionCell collisionCell4 = this.multiChainSelector;
        if (collisionCell4 != null) {
            collisionCell4.setDisableClickListener(new Function1() { // from class: com.okinc.web3.security.features.importing.bottomsheet.CollisionChooseBottomSheet$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CollisionChooseBottomSheet.onCreateContent$lambda$3((View) obj);
                }
            });
        }
        CollisionCell collisionCell5 = this.tonChainSelector;
        if (collisionCell5 != null) {
            Drawable drawable4 = ContextCompat.getDrawable(requireContext(), C57407yho.ActionBar.AYXKKw);
            if (drawable4 != null) {
                drawable4.setTint(ContextCompat.getColor(requireContext(), C52761wXj.Activity.DTeKQX));
            } else {
                drawable4 = null;
            }
            collisionCell5.setStartDrawable(drawable4);
        }
        CollisionCell collisionCell6 = this.tonChainSelector;
        if (collisionCell6 != null) {
            Drawable drawable5 = ContextCompat.getDrawable(requireContext(), C52761wXj.TaskDescription.DGUQLI);
            if (drawable5 != null) {
                drawable5.setTint(ContextCompat.getColor(requireContext(), C52761wXj.Activity.QwvEab));
                drawable = drawable5;
            }
            collisionCell6.setArrow(drawable);
        }
        CollisionCell collisionCell7 = this.tonChainSelector;
        if (collisionCell7 != null) {
            collisionCell7.setClickListener(new Function1() { // from class: com.okinc.web3.security.features.importing.bottomsheet.CollisionChooseBottomSheet$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CollisionChooseBottomSheet.onCreateContent$lambda$6(this.f$0, (View) obj);
                }
            });
        }
        CollisionCell collisionCell8 = this.tonChainSelector;
        if (collisionCell8 != null) {
            collisionCell8.setDisableClickListener(new Function1() { // from class: com.okinc.web3.security.features.importing.bottomsheet.CollisionChooseBottomSheet$$ExternalSyntheticLambda3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CollisionChooseBottomSheet.onCreateContent$lambda$7((View) obj);
                }
            });
        }
        initData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateContent$lambda$2(CollisionChooseBottomSheet collisionChooseBottomSheet, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        OnItemClickListener onItemClickListener = collisionChooseBottomSheet.onItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.hdItemClick(collisionChooseBottomSheet.tonAddress);
        }
        collisionChooseBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateContent$lambda$3(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C55326xho.toastWithFailedIcon$default(C57407yho.Activity.KWHzl, 0, 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateContent$lambda$6(CollisionChooseBottomSheet collisionChooseBottomSheet, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        OnItemClickListener onItemClickListener = collisionChooseBottomSheet.onItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.tonItemClick(collisionChooseBottomSheet.tonAddress);
        }
        collisionChooseBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateContent$lambda$7(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C55326xho.toastWithFailedIcon$default(C57407yho.Activity.KWHzl, 0, 1, (Object) null);
        return Unit.INSTANCE;
    }

    private final void initData() {
        TonAddress tonAddress;
        CollisionCell collisionCell;
        CollisionCell collisionCell2;
        Parcelable parcelable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable(ADDRESS_INFO, TonAddress.class);
            } else {
                parcelable = (TonAddress) arguments.getParcelable(ADDRESS_INFO);
            }
            tonAddress = (TonAddress) parcelable;
        } else {
            tonAddress = null;
        }
        this.tonAddress = tonAddress;
        if (tonAddress == null || tonAddress == null) {
            return;
        }
        CollisionCell collisionCell3 = this.multiChainSelector;
        if (collisionCell3 != null) {
            collisionCell3.setDescription(C33070mpX.AYXKKw(C57407yho.Activity.AubY) + "\n" + tonAddress.getHdTonAddress().getAddress());
        }
        if (tonAddress.getHdTonAddress().getAlreadyExist() && (collisionCell2 = this.multiChainSelector) != null) {
            collisionCell2.disableCell();
        }
        CollisionCell collisionCell4 = this.tonChainSelector;
        if (collisionCell4 != null) {
            collisionCell4.setDescription(C33070mpX.AYXKKw(C57407yho.Activity.AubY) + "\n" + tonAddress.getTonAddress().getAddress());
        }
        if (!tonAddress.getTonAddress().getAlreadyExist() || (collisionCell = this.tonChainSelector) == null) {
            return;
        }
        collisionCell.disableCell();
    }

    public final void show(@NotNull FragmentManager fragmentManager, OnItemClickListener onItemClickListener) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.onItemClickListener = onItemClickListener;
        show(fragmentManager);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.onItemClickListener = null;
        this.multiChainSelector = null;
        this.tonChainSelector = null;
    }
}
