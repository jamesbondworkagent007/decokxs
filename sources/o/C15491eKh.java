package o;

import com.okinc.business.defi.biz.net.bean.TxRecord;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eKh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15491eKh extends C15489eKf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15491eKh(@NotNull TxRecord txRecord) {
        super(txRecord);
        Intrinsics.checkNotNullParameter(txRecord, "");
    }

    @Override // o.C15489eKf
    public java.lang.String fetchVPNInfo() {
        int txType = AuCTel().getTxType();
        if (txType != 1) {
            if (txType != 2) {
                if (txType == 12) {
                    return C33070mpX.AYXKKw(C13754dXa.FragmentManager.invoke);
                }
                if (txType != 51) {
                    if (txType == 65) {
                        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRatingStyle);
                    }
                    if (txType != 72) {
                        if (txType == 87) {
                            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.access001);
                        }
                        if (txType != 53) {
                            if (txType != 54) {
                                if (txType == 84) {
                                    return C33070mpX.AYXKKw(C13754dXa.FragmentManager.aUsmxb);
                                }
                                if (txType != 85) {
                                    switch (txType) {
                                        case 8:
                                            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.getCREATORannotations);
                                        case 9:
                                            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaTypeactivity_release);
                                        case 10:
                                            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.putString);
                                        default:
                                            switch (txType) {
                                                case 43:
                                                    return C33070mpX.AYXKKw(C13754dXa.FragmentManager.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0);
                                                case 44:
                                                    return C33070mpX.AYXKKw(C13754dXa.FragmentManager.Cancellable);
                                                case 45:
                                                    return C33070mpX.AYXKKw(C13754dXa.FragmentManager.lambdanew0);
                                                default:
                                                    switch (txType) {
                                                        case 56:
                                                            break;
                                                        case 57:
                                                            break;
                                                        case 58:
                                                            break;
                                                        default:
                                                            return "";
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    return C33070mpX.AYXKKw(C13754dXa.FragmentManager.UlJrfe);
                                }
                            }
                        }
                    }
                }
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.Api19Impl);
            }
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.lambdanew2);
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.createFullyDrawnExecutor);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.C15489eKf
    public java.lang.String values() {
        int txType = AuCTel().getTxType();
        if (txType != 1) {
            if (txType != 2 && txType != 12) {
                if (txType != 51) {
                    if (txType != 65) {
                        if (txType != 72) {
                            if (txType != 87) {
                                if (txType != 53) {
                                    if (txType != 54 && txType != 84) {
                                        if (txType != 85) {
                                            switch (txType) {
                                                case 8:
                                                    break;
                                                case 9:
                                                    break;
                                                case 10:
                                                    return C33070mpX.AYXKKw(C13754dXa.FragmentManager.putRating) + " " + pTB.formatLocalized$default(AuCTel().getPayAmount(), null, 1, null) + AuCTel().getPayCurrency();
                                                default:
                                                    switch (txType) {
                                                        case 43:
                                                        case 44:
                                                        case 45:
                                                            if (C33129mqd.OLrzqt((java.lang.CharSequence) AuCTel().getContractName())) {
                                                                java.lang.String contractName = AuCTel().getContractName();
                                                                if (contractName != null) {
                                                                    return contractName;
                                                                }
                                                            } else {
                                                                return C14079deg.EZpvd.AEQbTJ(AuCTel().getContractAddress(), true);
                                                            }
                                                        default:
                                                            switch (txType) {
                                                                case 56:
                                                                case 57:
                                                                case 58:
                                                                    break;
                                                                default:
                                                                    return isConnected();
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (C33129mqd.OLrzqt((java.lang.CharSequence) AuCTel().getContractName())) {
                    java.lang.String contractName2 = AuCTel().getContractName();
                    if (contractName2 != null) {
                        return contractName2;
                    }
                } else {
                    return C14079deg.EZpvd.AEQbTJ(AuCTel().getContractAddress(), true);
                }
                return "";
            }
            return isConnected();
        }
        return EZpvd();
    }

    @Override // o.C15489eKf
    public boolean ejfBZ() {
        return AuCTel().getTxType() == 54 || AuCTel().getTxType() == 53 || AuCTel().getTxType() == 51;
    }

    @Override // o.C15489eKf
    public boolean fARcdN() {
        return AuCTel().getTxType() == 57 || AuCTel().getTxType() == 56 || AuCTel().getTxType() == 58;
    }

    @Override // o.C15489eKf
    public boolean fIwbmz() {
        return AuCTel().getTxType() == 65;
    }
}
