package o;

import android.graphics.drawable.GradientDrawable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel;
import com.okinc.localization.util.format.DisplaySign;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.jCC;
import o.jCJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jCC extends RecyclerView.Adapter<TaskDescription> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final Function1<jCJ, Unit> AEQbTJ;
    public boolean KWHzl;
    public java.util.List<LeaderBoardCardUIModel> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.jCJ, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public jCC(@NotNull Function1<? super jCJ, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
        this.copydefault = yDY.AhwBna();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jCC.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hDB hdbCopydefault = hDB.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hdbCopydefault, "");
        return new TaskDescription(this, hdbCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.copydefault(copydefault(i), i);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(taskDescription, i, list);
            return;
        }
        LeaderBoardCardUIModel leaderBoardCardUIModelCopydefault = copydefault(i);
        for (java.lang.Object obj : list) {
            if (Intrinsics.EZpvd(obj, (java.lang.Object) "display_type_changed")) {
                taskDescription.KWHzl(leaderBoardCardUIModelCopydefault, this.KWHzl);
            } else if (Intrinsics.EZpvd(obj, (java.lang.Object) "follow_state_changed")) {
                taskDescription.AEQbTJ(leaderBoardCardUIModelCopydefault);
            }
        }
    }

    public final LeaderBoardCardUIModel copydefault(int i) {
        return this.copydefault.get(i);
    }

    public final void EZpvd(boolean z) {
        if (this.KWHzl != z) {
            this.KWHzl = z;
            if (!this.copydefault.isEmpty()) {
                notifyItemRangeChanged(0, this.copydefault.size(), "display_type_changed");
            }
        }
    }

    public final void OLrzqt(@NotNull java.util.List<LeaderBoardCardUIModel> list, int i, int i2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        int size = this.copydefault.size();
        this.copydefault = list;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "follow_item_removed")) {
            notifyItemRemoved(i);
            if (i < 3) {
                notifyItemRangeChanged(0, 4);
                return;
            }
            return;
        }
        if (size > list.size()) {
            notifyItemRangeChanged(i, i2, str);
            notifyItemRangeRemoved(this.copydefault.size(), size - this.copydefault.size());
        } else {
            notifyItemRangeChanged(i, i2, str);
        }
    }

    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final hDB KWHzl;
        public final /* synthetic */ jCC OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull jCC jcc, hDB hdb) {
            super(hdb.getRoot());
            Intrinsics.checkNotNullParameter(hdb, "");
            this.OLrzqt = jcc;
            this.KWHzl = hdb;
        }

        public final void copydefault(@NotNull final LeaderBoardCardUIModel leaderBoardCardUIModel, final int i) {
            Intrinsics.checkNotNullParameter(leaderBoardCardUIModel, "");
            KWHzl(leaderBoardCardUIModel, i);
            AEQbTJ(leaderBoardCardUIModel);
            KWHzl(leaderBoardCardUIModel, this.OLrzqt.KWHzl);
            android.widget.ImageView imageView = this.KWHzl.isConnected;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(leaderBoardCardUIModel.getKolTwitterLink().length() > 0 ? 0 : 8);
            android.widget.ImageView imageView2 = this.KWHzl.isConnected;
            final jCC jcc = this.OLrzqt;
            C25352ivB.setOnDoubleCheckClickListener$default(imageView2, 0L, new Function1() { // from class: o.jCD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return jCC.TaskDescription.valueOf(jcc, leaderBoardCardUIModel, (android.view.View) obj);
                }
            }, 1, null);
            android.widget.TextView textView = this.KWHzl.wlaJM;
            java.lang.String roiPercentage = leaderBoardCardUIModel.getRoiPercentage();
            java.lang.String percentage$default = C33129mqd.OLrzqt((java.lang.CharSequence) roiPercentage) ? kLY.formatPercentage$default(roiPercentage, DisplaySign.EXCEPT_ZERO, false, null, null, 14, null) : "";
            if (percentage$default.length() == 0) {
                percentage$default = "--";
            }
            textView.setText(percentage$default);
            android.widget.TextView textView2 = this.KWHzl.AxsJAY;
            java.lang.String winRatePercentage = leaderBoardCardUIModel.getWinRatePercentage();
            java.lang.String percentage$default2 = C33129mqd.OLrzqt((java.lang.CharSequence) winRatePercentage) ? kLY.formatPercentage$default(winRatePercentage, null, false, null, null, 3, null) : "";
            if (percentage$default2.length() == 0) {
                percentage$default2 = "--";
            }
            textView2.setText(percentage$default2);
            if (leaderBoardCardUIModel.getWinLossToken().size() == 2) {
                this.KWHzl.zsXlph.setWinLossValues(leaderBoardCardUIModel.getWinLossToken());
            }
            java.lang.String numberICUWithPrecision$default = C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, java.lang.String.valueOf(leaderBoardCardUIModel.getTransactions()), null, 1, null);
            java.lang.String lastTime = leaderBoardCardUIModel.getLastTime();
            java.lang.String strEZpvd = C33129mqd.OLrzqt((java.lang.CharSequence) lastTime) ? C25322iuY.OLrzqt.EZpvd(lastTime) : "";
            java.lang.String str = numberICUWithPrecision$default + "/" + (strEZpvd.length() != 0 ? strEZpvd : "--");
            android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(this.KWHzl.getRoot().getContext().getColor(C23274hvD.StateListAnimator.djBIcL));
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            spannableString.setSpan(foregroundColorSpan, numberICUWithPrecision$default.length(), numberICUWithPrecision$default.length() + 1, 17);
            this.KWHzl.iwGUEr.setText(spannableString);
            if (leaderBoardCardUIModel.getChartItems().isEmpty() || leaderBoardCardUIModel.getChartItems().size() == 1) {
                this.KWHzl.ejfBZ.setVisibility(8);
            } else {
                this.KWHzl.ejfBZ.setVisibility(0);
                this.KWHzl.ejfBZ.AEQbTJ(leaderBoardCardUIModel.getChartItems());
            }
            CardView cardViewOLrzqt = this.KWHzl.getRoot();
            final jCC jcc2 = this.OLrzqt;
            C25352ivB.setOnDoubleCheckClickListener$default(cardViewOLrzqt, 0L, new Function1() { // from class: o.jCG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return jCC.TaskDescription.EZpvd(jcc2, i, leaderBoardCardUIModel, (android.view.View) obj);
                }
            }, 1, null);
        }

        public static final Unit valueOf(jCC jcc, LeaderBoardCardUIModel leaderBoardCardUIModel, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            jcc.AEQbTJ.invoke(new jCJ.ActionBar(leaderBoardCardUIModel.getKolTwitterLink()));
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(jCC jcc, int i, LeaderBoardCardUIModel leaderBoardCardUIModel, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            jcc.AEQbTJ.invoke(new jCJ.Activity(i, leaderBoardCardUIModel));
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(@NotNull final LeaderBoardCardUIModel leaderBoardCardUIModel) {
            android.graphics.drawable.Drawable drawableKWHzl;
            android.content.Context context;
            int i;
            Intrinsics.checkNotNullParameter(leaderBoardCardUIModel, "");
            java.lang.String addressAlias = leaderBoardCardUIModel.getAddressAlias();
            if (addressAlias.length() == 0) {
                addressAlias = leaderBoardCardUIModel.getAccountName();
                if (addressAlias.length() == 0) {
                    addressAlias = C25352ivB.formatAddress$default(leaderBoardCardUIModel.getWalletAddress(), 6, 6, null, 4, null);
                    if (addressAlias.length() == 0) {
                        addressAlias = "--";
                    }
                }
            }
            android.widget.TextView textView = this.KWHzl.uzCIH;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C31258lqd.copydefault(textView, addressAlias, leaderBoardCardUIModel.getAddressDisplayColorHex(), C52761wXj.Activity.fdOvFl);
            java.lang.String type = leaderBoardCardUIModel.getType();
            int iHashCode = type.hashCode();
            android.graphics.drawable.Drawable drawableCopydefault = null;
            if (iHashCode == -484734976) {
                if (type.equals(LeaderBoardCardUIModel.RECOMMENDATION_TYPE)) {
                    C52794wYp c52794wYp = this.KWHzl.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                    c52794wYp.setVisibility(8);
                    AppCompatImageView appCompatImageView = this.KWHzl.AkhnZx;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                    appCompatImageView.setVisibility(0);
                    android.widget.LinearLayout linearLayout = this.KWHzl.AhwBna;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                    linearLayout.setVisibility(8);
                    AppCompatImageView appCompatImageView2 = this.KWHzl.AkhnZx;
                    if (leaderBoardCardUIModel.isSelected()) {
                        drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.gqESXP);
                        if (drawableKWHzl != null) {
                            drawableKWHzl.setTint(C25382ivf.KWHzl(C52761wXj.Activity.OJuSTm));
                            drawableCopydefault = drawableKWHzl;
                        }
                    } else {
                        drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.QqiRNA);
                        if (drawableKWHzl != null) {
                            drawableKWHzl.setTint(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
                            drawableCopydefault = drawableKWHzl;
                        }
                    }
                    appCompatImageView2.setImageDrawable(drawableCopydefault);
                    AppCompatImageView appCompatImageView3 = this.KWHzl.AkhnZx;
                    final jCC jcc = this.OLrzqt;
                    C25352ivB.setOnDoubleCheckClickListener$default(appCompatImageView3, 0L, new Function1() { // from class: o.jCF
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return jCC.TaskDescription.AYXKKw(jcc, leaderBoardCardUIModel, (android.view.View) obj);
                        }
                    }, 1, null);
                    return;
                }
                return;
            }
            if (iHashCode != 1021989983) {
                if (iHashCode == 1921386386 && type.equals(LeaderBoardCardUIModel.NORMAL_TYPE)) {
                    C52794wYp c52794wYp2 = this.KWHzl.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
                    c52794wYp2.setVisibility(0);
                    AppCompatImageView appCompatImageView4 = this.KWHzl.AkhnZx;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "");
                    appCompatImageView4.setVisibility(8);
                    android.widget.LinearLayout linearLayout2 = this.KWHzl.AhwBna;
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                    linearLayout2.setVisibility(8);
                    if (leaderBoardCardUIModel.isBookmarked()) {
                        context = this.KWHzl.getRoot().getContext();
                        i = C23274hvD.Fragment.createIntent;
                    } else {
                        context = this.KWHzl.getRoot().getContext();
                        i = C23274hvD.Fragment.zYHWMc;
                    }
                    java.lang.String string = context.getString(i);
                    Intrinsics.copydefault((java.lang.Object) string);
                    this.KWHzl.OLrzqt.setOKDSType(leaderBoardCardUIModel.isBookmarked() ? 260 : 259);
                    this.KWHzl.OLrzqt.setText(string);
                    C52794wYp c52794wYp3 = this.KWHzl.OLrzqt;
                    final jCC jcc2 = this.OLrzqt;
                    C25352ivB.setOnDoubleCheckClickListener$default(c52794wYp3, 0L, new Function1() { // from class: o.jCE
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return jCC.TaskDescription.AhwBna(jcc2, leaderBoardCardUIModel, (android.view.View) obj);
                        }
                    }, 1, null);
                    return;
                }
                return;
            }
            if (type.equals(LeaderBoardCardUIModel.COPY_TRADE_TYPE)) {
                C52794wYp c52794wYp4 = this.KWHzl.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c52794wYp4, "");
                c52794wYp4.setVisibility(8);
                AppCompatImageView appCompatImageView5 = this.KWHzl.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView5, "");
                appCompatImageView5.setVisibility(8);
                android.widget.LinearLayout linearLayout3 = this.KWHzl.AhwBna;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                linearLayout3.setVisibility(0);
                android.widget.ImageView imageView = this.KWHzl.values;
                if (leaderBoardCardUIModel.isBookmarked()) {
                    android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.GQzpsZsQwTVT);
                    if (drawableKWHzl2 != null) {
                        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                        android.content.Context context2 = this.KWHzl.getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        drawableCopydefault = C33057mpK.copydefault(drawableKWHzl2, C33512mxp.tradeRiseDefault$default(c33512mxp, context2, 0.0f, 2, null));
                    }
                } else {
                    android.graphics.drawable.Drawable drawableKWHzl3 = C33070mpX.KWHzl(C52761wXj.TaskDescription.getValue);
                    if (drawableKWHzl3 != null) {
                        drawableCopydefault = C33057mpK.copydefault(drawableKWHzl3, C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
                    }
                }
                imageView.setImageDrawable(drawableCopydefault);
                android.widget.ImageView imageView2 = this.KWHzl.values;
                final jCC jcc3 = this.OLrzqt;
                C25352ivB.setOnDoubleCheckClickListener$default(imageView2, 0L, new Function1() { // from class: o.jCK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return jCC.TaskDescription.djBIcL(jcc3, leaderBoardCardUIModel, (android.view.View) obj);
                    }
                }, 1, null);
                C52794wYp c52794wYp5 = this.KWHzl.KWHzl;
                final jCC jcc4 = this.OLrzqt;
                C25352ivB.setOnDoubleCheckClickListener$default(c52794wYp5, 0L, new Function1() { // from class: o.jCL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return jCC.TaskDescription.gEmmrt(jcc4, leaderBoardCardUIModel, (android.view.View) obj);
                    }
                }, 1, null);
            }
        }

        public static final Unit AYXKKw(jCC jcc, LeaderBoardCardUIModel leaderBoardCardUIModel, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            jcc.AEQbTJ.invoke(new jCJ.TaskDescription(leaderBoardCardUIModel));
            return Unit.INSTANCE;
        }

        public static final Unit AhwBna(jCC jcc, LeaderBoardCardUIModel leaderBoardCardUIModel, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            jcc.AEQbTJ.invoke(new jCJ.TaskDescription(leaderBoardCardUIModel));
            return Unit.INSTANCE;
        }

        public static final Unit djBIcL(jCC jcc, LeaderBoardCardUIModel leaderBoardCardUIModel, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            jcc.AEQbTJ.invoke(new jCJ.TaskDescription(leaderBoardCardUIModel));
            return Unit.INSTANCE;
        }

        public static final Unit gEmmrt(jCC jcc, LeaderBoardCardUIModel leaderBoardCardUIModel, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            jcc.AEQbTJ.invoke(new jCJ.Application(leaderBoardCardUIModel));
            return Unit.INSTANCE;
        }

        public final void KWHzl(@NotNull LeaderBoardCardUIModel leaderBoardCardUIModel, boolean z) {
            int iCopydefault;
            Intrinsics.checkNotNullParameter(leaderBoardCardUIModel, "");
            if (z) {
                android.widget.ImageView imageView = this.KWHzl.djBIcL;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                android.widget.ImageView imageView2 = this.KWHzl.djBIcL;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                C25386ivj.loadImageWithBorder$default(imageView2, leaderBoardCardUIModel.getChainLogoUrl(), null, 2, null);
                java.lang.String tokenBalance = leaderBoardCardUIModel.getTokenBalance();
                java.lang.String numberICUWithPrecision$default = C33129mqd.OLrzqt((java.lang.CharSequence) tokenBalance) ? C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, tokenBalance, null, 1, null) : "";
                if (numberICUWithPrecision$default.length() == 0) {
                    numberICUWithPrecision$default = "--";
                }
                this.KWHzl.EZpvd.setText(numberICUWithPrecision$default);
                android.widget.ImageView imageView3 = this.KWHzl.fARcdN;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(0);
                android.widget.ImageView imageView4 = this.KWHzl.fARcdN;
                Intrinsics.checkNotNullExpressionValue(imageView4, "");
                C25386ivj.loadImageWithBorder$default(imageView4, leaderBoardCardUIModel.getChainLogoUrl(), null, 2, null);
                float fDjBIcL = C33129mqd.djBIcL(leaderBoardCardUIModel.getTokenPrice());
                if (fDjBIcL == 0.0f) {
                    this.KWHzl.getNewProxyInstance.setText("--");
                } else {
                    this.KWHzl.getNewProxyInstance.setText(pTF.KWHzl.AEQbTJ(C23271hvA.formatTokenCode$default(C23271hvA.copydefault, C23313hvq.divCheckS$default(leaderBoardCardUIModel.getPnlAmount(), java.lang.Float.valueOf(fDjBIcL), null, null, null, 14, null), false, null, false, null, DisplaySign.EXCEPT_ZERO, 15, null)));
                }
            } else {
                android.widget.ImageView imageView5 = this.KWHzl.djBIcL;
                Intrinsics.checkNotNullExpressionValue(imageView5, "");
                imageView5.setVisibility(8);
                java.lang.String strMulCheckS$default = C23313hvq.mulCheckS$default(leaderBoardCardUIModel.getTokenBalance(), leaderBoardCardUIModel.getTokenPrice(), null, null, null, 14, null);
                java.lang.String strAEQbTJ = C33129mqd.OLrzqt((java.lang.CharSequence) strMulCheckS$default) ? pTF.KWHzl.AEQbTJ(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, strMulCheckS$default, true, null, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null)) : "";
                if (strAEQbTJ.length() == 0) {
                    strAEQbTJ = "--";
                }
                this.KWHzl.EZpvd.setText(strAEQbTJ);
                android.widget.ImageView imageView6 = this.KWHzl.fARcdN;
                Intrinsics.checkNotNullExpressionValue(imageView6, "");
                imageView6.setVisibility(8);
                android.widget.TextView textView = this.KWHzl.getNewProxyInstance;
                java.lang.String pnlAmount = leaderBoardCardUIModel.getPnlAmount();
                java.lang.String strAEQbTJ2 = C33129mqd.OLrzqt((java.lang.CharSequence) pnlAmount) ? pTF.KWHzl.AEQbTJ(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, pnlAmount, true, null, false, false, false, false, DisplaySign.EXCEPT_ZERO, false, false, 446, null)) : "";
                textView.setText(strAEQbTJ2.length() != 0 ? strAEQbTJ2 : "--");
            }
            android.widget.TextView textView2 = this.KWHzl.getNewProxyInstance;
            if (C23313hvq.OLrzqt(leaderBoardCardUIModel.getPnlAmount(), 0)) {
                int i = C52761wXj.Activity.DKtBnz;
                android.content.Context context = this.KWHzl.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iCopydefault = C25382ivf.copydefault(i, context);
            } else if (C23313hvq.KWHzl(leaderBoardCardUIModel.getPnlAmount(), 0)) {
                int i2 = C52761wXj.Activity.gwwfep;
                android.content.Context context2 = this.KWHzl.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                iCopydefault = C25382ivf.copydefault(i2, context2);
            } else {
                int i3 = C52761wXj.Activity.fdOvFl;
                android.content.Context context3 = this.KWHzl.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                iCopydefault = C25382ivf.copydefault(i3, context3);
            }
            textView2.setTextColor(iCopydefault);
        }

        public final GradientDrawable copydefault(int i) {
            if (i == 0) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColors(new int[]{C25382ivf.KWHzl(C23274hvD.StateListAnimator.AkhnZx), C25382ivf.KWHzl(C23274hvD.StateListAnimator.AYXKKw)});
                gradientDrawable.setGradientType(0);
                gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                return gradientDrawable;
            }
            if (i == 1) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(1);
                gradientDrawable2.setColors(new int[]{C25382ivf.KWHzl(C23274hvD.StateListAnimator.values), C25382ivf.KWHzl(C23274hvD.StateListAnimator.isConnected)});
                gradientDrawable2.setGradientType(0);
                gradientDrawable2.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                return gradientDrawable2;
            }
            if (i == 2) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(1);
                gradientDrawable3.setColors(new int[]{C25382ivf.KWHzl(C23274hvD.StateListAnimator.fetchVPNInfo), C25382ivf.KWHzl(C23274hvD.StateListAnimator.DbNXlk)});
                gradientDrawable3.setGradientType(0);
                gradientDrawable3.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                return gradientDrawable3;
            }
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setShape(1);
            gradientDrawable4.setColor(C25382ivf.KWHzl(C23274hvD.StateListAnimator.djBIcL));
            return gradientDrawable4;
        }

        public final void KWHzl(@NotNull LeaderBoardCardUIModel leaderBoardCardUIModel, int i) {
            Intrinsics.checkNotNullParameter(leaderBoardCardUIModel, "");
            android.widget.ImageView imageView = this.KWHzl.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C25386ivj.KWHzl(imageView, leaderBoardCardUIModel.getEmoji(), leaderBoardCardUIModel.getWalletLogoUrl(), leaderBoardCardUIModel.getWalletAddress(), 5.625f);
            int i2 = i != 0 ? i != 1 ? i != 2 ? C23274hvD.StateListAnimator.AhwBna : C23274hvD.StateListAnimator.DbNXlk : C23274hvD.StateListAnimator.isConnected : C23274hvD.StateListAnimator.AYXKKw;
            android.content.Context context = this.KWHzl.getRoot().getContext();
            Intrinsics.copydefault(context);
            this.KWHzl.copydefault.setBackgroundTintList(C25382ivf.OLrzqt(context, i2));
            if (i < 3) {
                android.widget.ImageView imageView2 = this.KWHzl.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(0);
                if (i == 0) {
                    this.KWHzl.AYXKKw.setImageResource(C23274hvD.ActionBar.OcIXYQ);
                } else if (i == 1) {
                    this.KWHzl.AYXKKw.setImageResource(C23274hvD.ActionBar.QOLQEE);
                } else if (i == 2) {
                    this.KWHzl.AYXKKw.setImageResource(C23274hvD.ActionBar.QfsBiF);
                }
                android.widget.TextView textView = this.KWHzl.getFieldNames;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                this.KWHzl.getFieldNames.setText(java.lang.String.valueOf(i + 1));
                this.KWHzl.getFieldNames.setBackground(copydefault(i));
                return;
            }
            android.widget.ImageView imageView3 = this.KWHzl.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(8);
            android.widget.TextView textView2 = this.KWHzl.getFieldNames;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }
}
