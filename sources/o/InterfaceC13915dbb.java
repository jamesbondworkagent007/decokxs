package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.defi.api.bean.AlertChainIdListResponse;
import com.okinc.business.defi.api.bean.BTCNFTDetailsReq;
import com.okinc.business.defi.api.bean.BTCNFTDetailsResp;
import com.okinc.business.defi.api.bean.ChartData;
import com.okinc.business.defi.api.bean.ChartDataReq;
import com.okinc.business.defi.api.bean.ChartType;
import com.okinc.business.defi.api.bean.CoinPrice;
import com.okinc.business.defi.api.bean.DuplicateOrder;
import com.okinc.business.defi.api.bean.MpcDeriveSync;
import com.okinc.business.defi.api.bean.MpcMaxIndexRequest;
import com.okinc.business.defi.api.bean.MpcMaxIndexResponse;
import com.okinc.business.defi.api.bean.NFTCollectionName;
import com.okinc.business.defi.api.bean.NewCurvePrice;
import com.okinc.business.defi.api.bean.UTXOConfirmBalanceReq;
import com.okinc.business.defi.api.bean.UTXOConfirmBalanceResp;
import com.okinc.business.defi.api.bean.UTXONFTListReq;
import com.okinc.business.defi.api.bean.UTXONFTListResp;
import com.okinc.business.defi.api.bean.VerifyDAppDomainRequest;
import com.okinc.business.defi.api.bean.VerifyDAppDomainResponse;
import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlRequest;
import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import com.okinc.business.defi.assets.utxo.utxomanagement.AssetsUnderUtxo;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoAssetsRequestBody;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationRequest;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationResponse;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoRequestBody;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoResponseItem;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoStatusUpdateRequestBody;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoStatusUpdateResponseItem;
import com.okinc.business.defi.biz.net.bean.AAAccountInfo;
import com.okinc.business.defi.biz.net.bean.AAActiveRes;
import com.okinc.business.defi.biz.net.bean.AAAddressResponse;
import com.okinc.business.defi.biz.net.bean.AAApprovalInfo;
import com.okinc.business.defi.biz.net.bean.AABook;
import com.okinc.business.defi.biz.net.bean.AAGasLimit;
import com.okinc.business.defi.biz.net.bean.AAGasLimitReq;
import com.okinc.business.defi.biz.net.bean.AAGenerateReq;
import com.okinc.business.defi.biz.net.bean.AAGenerateRes;
import com.okinc.business.defi.biz.net.bean.AAOwnerRes;
import com.okinc.business.defi.biz.net.bean.AccountMpcBody;
import com.okinc.business.defi.biz.net.bean.AccountMpcResponse;
import com.okinc.business.defi.biz.net.bean.AddCoinAddrReq;
import com.okinc.business.defi.biz.net.bean.AddCoinBatchReq;
import com.okinc.business.defi.biz.net.bean.AddCoinReq;
import com.okinc.business.defi.biz.net.bean.AddressAllAssetRequest;
import com.okinc.business.defi.biz.net.bean.AddressAllAssetResponse;
import com.okinc.business.defi.biz.net.bean.AddressAssetResp;
import com.okinc.business.defi.biz.net.bean.AddressCheckReq;
import com.okinc.business.defi.biz.net.bean.AddressCoinDetailRequest;
import com.okinc.business.defi.biz.net.bean.AddressCoinHistoryRequest;
import com.okinc.business.defi.biz.net.bean.AddressCoinHistoryResponse;
import com.okinc.business.defi.biz.net.bean.AddressRegisterStatusReq;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import com.okinc.business.defi.biz.net.bean.AddressTxHistoryDetail;
import com.okinc.business.defi.biz.net.bean.AddressTxInformationRequest;
import com.okinc.business.defi.biz.net.bean.ApproveAASubRequest;
import com.okinc.business.defi.biz.net.bean.ApproveItem;
import com.okinc.business.defi.biz.net.bean.ApproveListReq;
import com.okinc.business.defi.biz.net.bean.ApproveRiskResponse;
import com.okinc.business.defi.biz.net.bean.Article;
import com.okinc.business.defi.biz.net.bean.AssetAll;
import com.okinc.business.defi.biz.net.bean.AssetReq;
import com.okinc.business.defi.biz.net.bean.AssetRsp;
import com.okinc.business.defi.biz.net.bean.BTCSpeedUpFeeRateReq;
import com.okinc.business.defi.biz.net.bean.BTCSpeedUpFeeRateResp;
import com.okinc.business.defi.biz.net.bean.BTCTooManyTransactionReq;
import com.okinc.business.defi.biz.net.bean.BackupCloudTypeRequest;
import com.okinc.business.defi.biz.net.bean.BackupCloudTypeRes;
import com.okinc.business.defi.biz.net.bean.BlockAddressCheckReq;
import com.okinc.business.defi.biz.net.bean.BlockAddressCheckResp;
import com.okinc.business.defi.biz.net.bean.BrcJsonRes;
import com.okinc.business.defi.biz.net.bean.CancelRebroadcastBTCTransactionReq;
import com.okinc.business.defi.biz.net.bean.CardanoUTXOReq;
import com.okinc.business.defi.biz.net.bean.CardanoUTXOResp;
import com.okinc.business.defi.biz.net.bean.CeDefiCreateUopReq;
import com.okinc.business.defi.biz.net.bean.CeDefiCreateUopResp;
import com.okinc.business.defi.biz.net.bean.CeDefiGasLimitReq;
import com.okinc.business.defi.biz.net.bean.CeDefiGasResp;
import com.okinc.business.defi.biz.net.bean.CeDefiPreCreateOrderReq;
import com.okinc.business.defi.biz.net.bean.CeDefiPreCreateOrderResp;
import com.okinc.business.defi.biz.net.bean.CeDefiSendUopReq;
import com.okinc.business.defi.biz.net.bean.ChainInfo;
import com.okinc.business.defi.biz.net.bean.CheckAaAddressRequest;
import com.okinc.business.defi.biz.net.bean.CheckAaAddressResponse;
import com.okinc.business.defi.biz.net.bean.CheckAddressReq;
import com.okinc.business.defi.biz.net.bean.CheckAddressResp;
import com.okinc.business.defi.biz.net.bean.CheckBatchChainReq;
import com.okinc.business.defi.biz.net.bean.CheckBatchChainResp;
import com.okinc.business.defi.biz.net.bean.CheckCreateAvailableResp;
import com.okinc.business.defi.biz.net.bean.CheckDapp;
import com.okinc.business.defi.biz.net.bean.CheckDappResonse;
import com.okinc.business.defi.biz.net.bean.CheckMpcStatusRequestBody;
import com.okinc.business.defi.biz.net.bean.CheckMpcStatusResponse;
import com.okinc.business.defi.biz.net.bean.CheckShareRequestBody;
import com.okinc.business.defi.biz.net.bean.CheckShareResponse;
import com.okinc.business.defi.biz.net.bean.CheckTransferReq;
import com.okinc.business.defi.biz.net.bean.CheckTransferResp;
import com.okinc.business.defi.biz.net.bean.CoinIdsReq;
import com.okinc.business.defi.biz.net.bean.CoinInfoBean;
import com.okinc.business.defi.biz.net.bean.CoinInfoResponse;
import com.okinc.business.defi.biz.net.bean.CoinMetaBean;
import com.okinc.business.defi.biz.net.bean.CoinProtocol;
import com.okinc.business.defi.biz.net.bean.CoinTypeNoReq;
import com.okinc.business.defi.biz.net.bean.ContractAddressReq;
import com.okinc.business.defi.biz.net.bean.ContractAddressResp;
import com.okinc.business.defi.biz.net.bean.CreateRespBatch;
import com.okinc.business.defi.biz.net.bean.CreateWalletReqNew;
import com.okinc.business.defi.biz.net.bean.CreateWalletReqs;
import com.okinc.business.defi.biz.net.bean.DAppBTCSignPrompt;
import com.okinc.business.defi.biz.net.bean.DappBTCUTXOResp;
import com.okinc.business.defi.biz.net.bean.DappBtcUtxoFeeReq;
import com.okinc.business.defi.biz.net.bean.DeriveInfoList;
import com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp;
import com.okinc.business.defi.biz.net.bean.EIP7702WalletStatusReq;
import com.okinc.business.defi.biz.net.bean.EIP7702WalletStatusResp;
import com.okinc.business.defi.biz.net.bean.EVM5792CallDataReq;
import com.okinc.business.defi.biz.net.bean.EVM5792CallDataRes;
import com.okinc.business.defi.biz.net.bean.EVMReadContract;
import com.okinc.business.defi.biz.net.bean.EosAccountKeyResp;
import com.okinc.business.defi.biz.net.bean.EosAccountKeyRespBatch;
import com.okinc.business.defi.biz.net.bean.EosAccountKeysReq;
import com.okinc.business.defi.biz.net.bean.EosAccountResp;
import com.okinc.business.defi.biz.net.bean.EosAccountRespBatch;
import com.okinc.business.defi.biz.net.bean.EosRes;
import com.okinc.business.defi.biz.net.bean.EscapeCoinMetaBean;
import com.okinc.business.defi.biz.net.bean.EvmAddressReq;
import com.okinc.business.defi.biz.net.bean.ExtFeeResp;
import com.okinc.business.defi.biz.net.bean.FreeGasCheckAuthorityRes;
import com.okinc.business.defi.biz.net.bean.FromAddressCheckReq;
import com.okinc.business.defi.biz.net.bean.FromAddressCheckRes;
import com.okinc.business.defi.biz.net.bean.FusionData;
import com.okinc.business.defi.biz.net.bean.GasLimitReq;
import com.okinc.business.defi.biz.net.bean.GasPrice;
import com.okinc.business.defi.biz.net.bean.GetMessageForSigningResp;
import com.okinc.business.defi.biz.net.bean.GetNearAccountIdReq;
import com.okinc.business.defi.biz.net.bean.GetNearAccountIdResp;
import com.okinc.business.defi.biz.net.bean.GetNearAccountIdRespBatch;
import com.okinc.business.defi.biz.net.bean.HotActivityAddressStatusReq;
import com.okinc.business.defi.biz.net.bean.HotActivityAddressStatusResp;
import com.okinc.business.defi.biz.net.bean.InfoListNew;
import com.okinc.business.defi.biz.net.bean.InnerUrlReq;
import com.okinc.business.defi.biz.net.bean.InnerUrlResp;
import com.okinc.business.defi.biz.net.bean.InputDataReq;
import com.okinc.business.defi.biz.net.bean.InvestmentDetailData;
import com.okinc.business.defi.biz.net.bean.InviteeInfoResponse;
import com.okinc.business.defi.biz.net.bean.InviterCodeResponse;
import com.okinc.business.defi.biz.net.bean.JitoInfoReq;
import com.okinc.business.defi.biz.net.bean.JitoInfoResult;
import com.okinc.business.defi.biz.net.bean.KaspaUtxoResp;
import com.okinc.business.defi.biz.net.bean.ListChainResponse;
import com.okinc.business.defi.biz.net.bean.MainChainBalanceResp;
import com.okinc.business.defi.biz.net.bean.MarketDetail;
import com.okinc.business.defi.biz.net.bean.MoreFunctionModuleInfo;
import com.okinc.business.defi.biz.net.bean.MpcIdList;
import com.okinc.business.defi.biz.net.bean.MultiAddressReq;
import com.okinc.business.defi.biz.net.bean.OfflineAssetDetailReq;
import com.okinc.business.defi.biz.net.bean.OfflineAssetDetailResp;
import com.okinc.business.defi.biz.net.bean.ParseDomainReq;
import com.okinc.business.defi.biz.net.bean.ParseENSReq;
import com.okinc.business.defi.biz.net.bean.ParseENSResp;
import com.okinc.business.defi.biz.net.bean.PayMasterSignatureReq;
import com.okinc.business.defi.biz.net.bean.PaymasterToken;
import com.okinc.business.defi.biz.net.bean.PlatformCoinCDNUrlBean;
import com.okinc.business.defi.biz.net.bean.PreExecTransactionReq;
import com.okinc.business.defi.biz.net.bean.PreferRefCodeInfoResponse;
import com.okinc.business.defi.biz.net.bean.QueryAddressRegisterStatusRes;
import com.okinc.business.defi.biz.net.bean.RefInfoResponse;
import com.okinc.business.defi.biz.net.bean.RefIpCheckResponse;
import com.okinc.business.defi.biz.net.bean.ReferralBindReportV2Req;
import com.okinc.business.defi.biz.net.bean.ReferralInviteeInfoReq;
import com.okinc.business.defi.biz.net.bean.ReferralSubInviterInvitationResponse;
import com.okinc.business.defi.biz.net.bean.RegisterAddressReq;
import com.okinc.business.defi.biz.net.bean.RegisterAddressStatusRes;
import com.okinc.business.defi.biz.net.bean.RegisterStatusReq;
import com.okinc.business.defi.biz.net.bean.RegisterStatusResp;
import com.okinc.business.defi.biz.net.bean.ReportRiskyTokenReq;
import com.okinc.business.defi.biz.net.bean.ReportRiskyTokenResp;
import com.okinc.business.defi.biz.net.bean.ScanStatusResponseBody;
import com.okinc.business.defi.biz.net.bean.SearchCoinReq;
import com.okinc.business.defi.biz.net.bean.SearchCoinResp;
import com.okinc.business.defi.biz.net.bean.SegWitInfoBean;
import com.okinc.business.defi.biz.net.bean.SegWitInfoBeanBatchRes;
import com.okinc.business.defi.biz.net.bean.SegWitInfoBeanRes;
import com.okinc.business.defi.biz.net.bean.SignCallDataCheckReq;
import com.okinc.business.defi.biz.net.bean.SignCallDataCheckRes;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.biz.net.bean.SupportCustomCoinChain;
import com.okinc.business.defi.biz.net.bean.SupportedMevNodeBean;
import com.okinc.business.defi.biz.net.bean.SyncCefiBindRequestData;
import com.okinc.business.defi.biz.net.bean.SyncCoinsReq;
import com.okinc.business.defi.biz.net.bean.SyncMpcEscapeStatusRequestBody;
import com.okinc.business.defi.biz.net.bean.SyncMpcEscapeStatusRes;
import com.okinc.business.defi.biz.net.bean.SyncRespBatch;
import com.okinc.business.defi.biz.net.bean.SyncWalletReqs;
import com.okinc.business.defi.biz.net.bean.TeeAnd7702WalletStatusReq;
import com.okinc.business.defi.biz.net.bean.TeeAnd7702WalletStatusResp;
import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import com.okinc.business.defi.biz.net.bean.TeeUpgradeStatus;
import com.okinc.business.defi.biz.net.bean.TermsVersionResp;
import com.okinc.business.defi.biz.net.bean.TokenInfoReq;
import com.okinc.business.defi.biz.net.bean.TokenInfoResp;
import com.okinc.business.defi.biz.net.bean.TxHistory;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import com.okinc.business.defi.biz.net.bean.TxRecordList;
import com.okinc.business.defi.biz.net.bean.TxStatusBatchReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.biz.net.bean.TxTypes;
import com.okinc.business.defi.biz.net.bean.UOPSignedHashReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UnbindWalletAndDeviceReq;
import com.okinc.business.defi.biz.net.bean.UnbindWalletAndDeviceRes;
import com.okinc.business.defi.biz.net.bean.UploadScanShareRequestBody;
import com.okinc.business.defi.biz.net.bean.UploadScanStatusRequestBody;
import com.okinc.business.defi.biz.net.bean.VerifyRequest;
import com.okinc.business.defi.biz.net.bean.VerifyRes;
import com.okinc.business.defi.biz.net.bean.VerifyResp;
import com.okinc.business.defi.biz.net.bean.WalletActivityFreeGasRes;
import com.okinc.business.defi.biz.net.bean.WalletCeFiBindQrResponse;
import com.okinc.business.defi.biz.net.bean.WalletCoinLatestPnlResponse;
import com.okinc.business.defi.biz.net.bean.WalletCoinTxHistoryReq;
import com.okinc.business.defi.biz.net.bean.WalletDeleteRes;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.business.defi.biz.net.bean.WalletHaveAssetResp;
import com.okinc.business.defi.biz.net.bean.WalletIdsReq;
import com.okinc.business.defi.biz.net.bean.WalletIdsUniqueIdReq;
import com.okinc.business.defi.biz.net.bean.WalletMarketReq;
import com.okinc.business.defi.biz.net.bean.WalletNameUpdateReqs;
import com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisResponse;
import com.okinc.business.defi.biz.net.bean.WalletPnlShareInfoResponse;
import com.okinc.business.defi.biz.net.bean.WalletPnlTokenListResponse;
import com.okinc.business.defi.biz.net.bean.WalletSupportPnlChainListResponse;
import com.okinc.business.defi.biz.net.bean.WalletTotalAssetModel;
import com.okinc.business.defi.biz.net.bean.WalletTotalAssetReq;
import com.okinc.business.defi.biz.net.bean.WalletTxHistoryDetailReq;
import com.okinc.business.defi.biz.net.bean.WalletsTokensAssetReq;
import com.okinc.business.defi.biz.net.bean.Web3LoginReq;
import com.okinc.business.defi.biz.net.bean.Web3LoginResp;
import com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoReq;
import com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoResp;
import com.okinc.business.defi.biz.net.bean.XRC20TokenReq;
import com.okinc.business.defi.biz.net.bean.ZkTransferFeeReq;
import com.okinc.business.defi.biz.net.bean.ZkTransferFeeResp;
import com.okinc.business.defi.wallet.bean.CustomNetwork;
import com.okinc.business.defi.wallet.bean.CustomNetworkConfig;
import com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountListResp;
import com.okinc.business.defi.wallet.home.escapebind.model.EscapeBindStatusResp;
import com.okinc.business.defi.wallet.mine.search.banner.data.model.WalletBannerEventData;
import com.okinc.business.defi.wallet.mine.search.data.model.MarketChainBean;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressRequest;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.TagMetaData;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletHotSearchResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchResponse;
import com.okinc.business.defi.wallet.tee.common.model.ActivateTEERequest;
import com.okinc.business.defi.wallet.tee.common.model.ActivateTEEResult;
import com.okinc.business.defi.wallet.tee.common.model.AttestationFileResult;
import com.okinc.business.defi.wallet.tee.common.model.ExtendTeeReqData;
import com.okinc.business.defi.wallet.tee.common.model.ExtendTeeResult;
import com.okinc.business.defi.wallet.tee.common.model.FrontendPubkeyVersionRequest;
import com.okinc.business.defi.wallet.tee.common.model.RemoveTeeResult;
import com.okinc.business.defi.wallet.tee.common.model.TeeBatchAuthorizeReqData;
import com.okinc.business.defi.wallet.tee.common.model.TeeRemoveRequest;
import com.okinc.business.defi.wallet.tee.common.model.UpgradeTeeResult;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import o.InterfaceC13915dbb;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/* JADX INFO: renamed from: o.dbb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC13915dbb {
    public static final StateListAnimator Companion = StateListAnimator.AEQbTJ;

    @POST("/priapi/v1/wallet/dapp/url/check")
    java.lang.Object AEQbTJ(@Body @NotNull VerifyDAppDomainRequest verifyDAppDomainRequest, @NotNull Continuation<? super ResponseData<VerifyDAppDomainResponse>> continuation);

    @POST("/priapi/v1/wallet/tx/utxo")
    java.lang.Object AEQbTJ(@Body @NotNull UtxoRequestBody utxoRequestBody, @NotNull Continuation<? super ResponseData<java.util.List<UtxoResponseItem>>> continuation);

    @POST("/priapi/v1/wallet/tx/profile/order/detail/explorer")
    java.lang.Object AEQbTJ(@Body @NotNull AddressTxInformationRequest addressTxInformationRequest, @NotNull Continuation<? super ResponseData<AddressTxHistoryDetail>> continuation);

    @POST("/priapi/v1/wallet/common/asset/offline/detail")
    java.lang.Object AEQbTJ(@Body @NotNull OfflineAssetDetailReq offlineAssetDetailReq, @NotNull Continuation<? super ResponseData<OfflineAssetDetailResp>> continuation);

    @POST("/priapi/v1/wallet/address/domainDefaultAddress")
    java.lang.Object AEQbTJ(@Body @NotNull ParseDomainReq parseDomainReq, @NotNull Continuation<? super ResponseData<ParseENSResp>> continuation);

    @POST("/priapi/v2/wallet/user/login")
    java.lang.Object AEQbTJ(@Body @NotNull Web3LoginReq web3LoginReq, @NotNull Continuation<? super ResponseData<Web3LoginResp>> continuation);

    @POST("priapi/v2/wallet/smart-account/attestation")
    java.lang.Object AEQbTJ(@Body @NotNull FrontendPubkeyVersionRequest frontendPubkeyVersionRequest, @NotNull Continuation<? super ResponseData<AttestationFileResult>> continuation);

    @GET("/priapi/v1/dx/market/v2/pnl/token-list")
    java.lang.Object AEQbTJ(@NotNull @Query("accountId") java.lang.String str, @Query("chainId") java.lang.Long l, @Query("sortType") int i, @Query("isAsc") boolean z, @Query(TypedValues.CycleType.S_WAVE_OFFSET) int i2, @Query("limit") int i3, @NotNull Continuation<? super ResponseData<WalletPnlTokenListResponse>> continuation);

    @GET("/priapi/v1/dx/market/v2/pnl/token-list")
    java.lang.Object AEQbTJ(@NotNull @Query("walletAddress") java.lang.String str, @Query("chainId") java.lang.Long l, @Query("sortType") int i, @Query("isAsc") boolean z, @Query(TypedValues.CycleType.S_WAVE_OFFSET) int i2, @Query("limit") int i3, @Query("filterRisk") boolean z2, @NotNull Continuation<? super ResponseData<WalletPnlTokenListResponse>> continuation);

    @GET("/priapi/v2/wallet/user/sign")
    java.lang.Object AEQbTJ(@NotNull @Query("devPublicKey") java.lang.String str, @NotNull @Query("accountId") java.lang.String str2, @Query(com.ibm.icu.text.DateFormat.ABBR_GENERIC_TZ) int i, @Query("signType") int i2, @NotNull Continuation<? super ResponseData<GetMessageForSigningResp>> continuation);

    @GET("/priapi/v1/dx/market/v2/pnl/share/info")
    java.lang.Object AEQbTJ(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("tokenContractAddress") java.lang.String str2, @NotNull @Query("accountId") java.lang.String str3, @NotNull @Query("walletAddress") java.lang.String str4, @NotNull Continuation<? super ResponseData<WalletPnlShareInfoResponse>> continuation);

    @GET("/priapi/v2/wallet/tx/5792/dapp-query-tx")
    java.lang.Object AEQbTJ(@NotNull @Query("dapp") java.lang.String str, @NotNull @Query("id") java.lang.String str2, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str3, @NotNull Continuation<? super ResponseData<JsonElement>> continuation);

    @GET("priapi/v2/wallet/smart-account/upgrade-status")
    java.lang.Object AEQbTJ(@NotNull @Query("teeId") java.lang.String str, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str2, @NotNull Continuation<? super ResponseData<TeeUpgradeStatus>> continuation);

    @GET("/priapi/v1/wallet/aa/book?chainId=1")
    java.lang.Object AEQbTJ(@NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str, @NotNull Continuation<? super ResponseData<AABook>> continuation);

    @POST("/priapi/v1/dapp/advert/entryBannerList")
    java.lang.Object AEQbTJ(@Body @NotNull java.util.HashMap<java.lang.String, java.util.List<java.lang.Integer>> map, @NotNull Continuation<? super ResponseData<java.util.List<WalletBannerEventData>>> continuation);

    @POST("/v1/deposit/app/txSupport/batch/address/getNearAccountId")
    java.lang.Object AEQbTJ(@Body @NotNull java.util.List<GetNearAccountIdReq> list, @NotNull Continuation<? super ResponseData<java.util.List<GetNearAccountIdRespBatch>>> continuation);

    @GET("/v1/deposit/coins/cosmosChainIds")
    java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<JsonObject>> continuation);

    @POST("/priapi/v1/wallet/tx/repeat-broadcast")
    @InterfaceC13893dbF(copydefault = 2)
    java.lang.Object AEQbTJ(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull CancelRebroadcastBTCTransactionReq cancelRebroadcastBTCTransactionReq, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v1/wallet/common/signVerify")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    java.lang.Object AEQbTJ(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull CreateWalletReqNew createWalletReqNew, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<VerifyResp>> continuation);

    @POST("/priapi/v1/dapp/ref/app/inviteeInfo")
    @InterfaceC13893dbF(EZpvd = true)
    java.lang.Object AEQbTJ(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull ReferralInviteeInfoReq referralInviteeInfoReq, @NotNull Continuation<? super ResponseData<InviteeInfoResponse>> continuation);

    @POST("priapi/v1/wallet/activity/banner/register-address")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    java.lang.Object AEQbTJ(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull RegisterAddressReq registerAddressReq, @NotNull Continuation<? super ResponseData<RegisterAddressStatusRes>> continuation);

    @POST("/priapi/v2/wallet/asset/wallet/manage")
    @InterfaceC13893dbF(EZpvd = false)
    java.lang.Object AEQbTJ(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull WalletTotalAssetReq walletTotalAssetReq, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<WalletTotalAssetModel>>> continuation);

    @POST("priapi/v2/wallet/smart-account/batchExtend")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    java.lang.Object AEQbTJ(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull ExtendTeeReqData extendTeeReqData, @NotNull Continuation<? super ResponseData<ExtendTeeResult>> continuation);

    @POST("/v1/deposit/app/eos/batch/account")
    @InterfaceC13893dbF
    java.lang.Object AEQbTJ(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super ResponseData<java.util.List<EosAccountRespBatch>>> continuation);

    @GET("/priapi/v1/wallet/common/checkLocaleAvailable")
    AbstractC58185ywX<ResponseData<java.lang.Object>> AEQbTJ();

    @GET("/v1/deposit/coins/coinInfo")
    AbstractC58185ywX<ResponseData<CoinInfoBean>> AEQbTJ(@Query("coinId") long j);

    @GET("/v1/deposit/coins/price/curve/new")
    AbstractC58185ywX<ResponseData<NewCurvePrice>> AEQbTJ(@Query("coinId") long j, @NotNull @Query("scale") java.lang.String str);

    @POST("/priapi/v1/wallet/aa/read/contract")
    AbstractC58185ywX<ResponseData<java.lang.String>> AEQbTJ(@Body @NotNull EVMReadContract eVMReadContract);

    @POST("/v1/deposit/wallet/asset/address/tokens")
    AbstractC58185ywX<ResponseData<java.util.List<AddressAssetResp>>> AEQbTJ(@Body @NotNull EvmAddressReq evmAddressReq);

    @POST("/v1/deposit/wallet/asset/main/token")
    AbstractC58185ywX<ResponseData<java.util.List<AddressAssetResp>>> AEQbTJ(@Body @NotNull MultiAddressReq multiAddressReq);

    @POST("/v1/deposit/app/txSupport/address/getZkTransferFee")
    AbstractC58185ywX<ResponseData<ZkTransferFeeResp>> AEQbTJ(@Body @NotNull ZkTransferFeeReq zkTransferFeeReq);

    @GET("/priapi/v1/wallet/aa/book?chainId=1")
    AbstractC58185ywX<ResponseData<AABook>> AEQbTJ(@NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str);

    @GET("/priapi/v1/wallet/network/test-networks/config")
    AbstractC58185ywX<ResponseData<CustomNetworkConfig>> AEQbTJ(@Header("Cache-Strategy") @NotNull java.lang.String str, @Header("Cache-Expire") int i);

    @GET("priapi/v1/wallet/tx/brc-json")
    AbstractC58185ywX<ResponseData<BrcJsonRes>> AEQbTJ(@NotNull @Query("tick") java.lang.String str, @NotNull @Query(OtcExtraKeys.AMOUNT) java.lang.String str2, @NotNull @Query("op") java.lang.String str3);

    @GET("/priapi/v1/invest/app/products/investment/detail/from-lp")
    AbstractC58185ywX<ResponseData<InvestmentDetailData>> AEQbTJ(@NotNull @Query("lpTokenAddress") java.lang.String str, @NotNull @Query("chainId") java.lang.String str2, @NotNull @Query("userAddress") java.lang.String str3, @NotNull @Query("walletInvestType") java.lang.String str4);

    @POST("/v1/deposit/wallet/asset/segwit/info")
    AbstractC58185ywX<ResponseData<java.util.List<SegWitInfoBeanRes>>> AEQbTJ(@Body @NotNull java.util.List<SegWitInfoBean> list);

    @POST("/priapi/v1/wallet/tx/speedup/fee/rate")
    AbstractC58185ywX<ResponseData<BTCSpeedUpFeeRateResp>> AEQbTJ(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @Body @NotNull BTCSpeedUpFeeRateReq bTCSpeedUpFeeRateReq);

    @POST("/priapi/v1/wallet/tx/utxo")
    AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> AEQbTJ(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @Body @NotNull UTXOInfoReq uTXOInfoReq);

    @GET("/priapi/v2/wallet/coin/available")
    @InterfaceC13893dbF
    AbstractC58185ywX<ResponseData<ChainInfo>> AEQbTJ(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Query("coinId") long j, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str, @Query("txSource") int i, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str2);

    @POST("/priapi/v1/wallet/tx/coin/order/list")
    @InterfaceC13893dbF
    AbstractC58185ywX<ResponseData<TxHistory>> AEQbTJ(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull WalletCoinTxHistoryReq walletCoinTxHistoryReq);

    @GET("/priapi/v2/wallet/asset/escape/all")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    AbstractC58185ywX<ResponseData<java.util.List<EscapeAccountListResp>>> AEQbTJ(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @NotNull @Query("accountId") java.lang.String str, @NotNull @Query("userUniqueId") java.lang.String str2, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str3);

    @POST("/v1/deposit/app/eos/account/self")
    @InterfaceC13893dbF
    AbstractC58185ywX<ResponseData<java.lang.String>> AEQbTJ(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body RequestBody requestBody);

    @GET("/priapi/v1/wallet/7702/chainList")
    java.lang.Object AYXKKw(@NotNull @Query("walletId") java.lang.String str, @NotNull Continuation<? super ResponseData<EIP7702ChainStatusResp>> continuation);

    @POST("/priapi/v2/wallet/asset/address/chartType")
    java.lang.Object AYXKKw(@NotNull Continuation<? super ResponseData<java.util.List<ChartType>>> continuation);

    @GET("/priapi/v1/wallet/mev/list")
    AbstractC58185ywX<ResponseData<java.util.List<SupportedMevNodeBean>>> AYXKKw();

    @GET("/priapi/v1/dapp/ref/defCode")
    java.lang.Object AhwBna(@NotNull @Query("inviter") java.lang.String str, @NotNull Continuation<? super ResponseData<InviterCodeResponse>> continuation);

    @GET("priapi/v2/wallet/smart-account/metadata")
    java.lang.Object AhwBna(@NotNull Continuation<? super ResponseData<TeeMetadata>> continuation);

    @GET("/v1/deposit/app/network/custormCoin")
    AbstractC58185ywX<ResponseData<java.util.List<SupportCustomCoinChain>>> AhwBna();

    @GET("/priapi/v1/wallet/activity/fusion/data")
    java.lang.Object DbNXlk(@NotNull Continuation<? super ResponseData<FusionData>> continuation);

    @GET("/priapi/v2/wallet/tx/group/list")
    java.lang.Object EZpvd(@Header("Cache-Expire") int i, @NotNull Continuation<? super ResponseData<TxTypes>> continuation);

    @POST("/priapi/v1/wallet/mpc/derive/info")
    java.lang.Object EZpvd(@Body @NotNull MpcMaxIndexRequest mpcMaxIndexRequest, @NotNull Continuation<? super ResponseData<MpcMaxIndexResponse>> continuation);

    @POST("/priapi/v2/wallet/url/checkv2")
    java.lang.Object EZpvd(@Body @NotNull VerifyDAppDomainUrlRequest verifyDAppDomainUrlRequest, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<VerifyDAppDomainUrlResponse>> continuation);

    @POST("/priapi/v1/wallet/tx/utxo/protocol/asset")
    java.lang.Object EZpvd(@Body @NotNull UtxoAssetsRequestBody utxoAssetsRequestBody, @NotNull Continuation<? super ResponseData<AssetsUnderUtxo>> continuation);

    @POST("/priapi/v2/wallet/asset/tokenAggregation/explorer")
    java.lang.Object EZpvd(@Body @NotNull AddressCoinDetailRequest addressCoinDetailRequest, @NotNull Continuation<? super ResponseData<AddressTokenAsset>> continuation);

    @POST("/priapi/v1/wallet/mpc/batch/derive/info")
    java.lang.Object EZpvd(@Body @NotNull MpcIdList mpcIdList, @NotNull Continuation<? super ResponseData<DeriveInfoList>> continuation);

    @GET("/priapi/v1/wallet/list/chain")
    java.lang.Object EZpvd(@Header("Cache-Strategy") @NotNull java.lang.String str, @Header("Cache-Expire") int i, @NotNull Continuation<? super ResponseData<java.util.List<ListChainResponse>>> continuation);

    @GET("/priapi/v1/dx/market/v2/my-position/latest-pnl")
    java.lang.Object EZpvd(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("walletAddress") java.lang.String str2, @NotNull @Query("tokenContractAddress") java.lang.String str3, @NotNull Continuation<? super ResponseData<WalletCoinLatestPnlResponse>> continuation);

    @GET("/priapi/v1/dapp/ref/wantBind")
    java.lang.Object EZpvd(@NotNull @Query("code") java.lang.String str, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str2, @NotNull Continuation<? super ResponseData<RefInfoResponse>> continuation);

    @GET("/priapi/v1/eco-api/check-country-limit")
    java.lang.Object EZpvd(@NotNull @Query("uid") java.lang.String str, @NotNull Continuation<? super ResponseData<java.lang.Boolean>> continuation);

    @GET("/priapi/v1/dapp/ref/code")
    java.lang.Object EZpvd(@NotNull @Query("code") java.lang.String str, @Query("ipCheck") boolean z, @NotNull Continuation<? super ResponseData<PreferRefCodeInfoResponse>> continuation);

    @GET("/priapi/v2/wallet/search/market/tag/meta")
    java.lang.Object EZpvd(@NotNull Continuation<? super ResponseData<java.util.List<TagMetaData>>> continuation);

    @POST("/priapi/v1/wallet/tx/close-transaction")
    @InterfaceC13893dbF(copydefault = 2)
    java.lang.Object EZpvd(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull CancelRebroadcastBTCTransactionReq cancelRebroadcastBTCTransactionReq, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("priapi/v2/wallet/smart-account/activate")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    java.lang.Object EZpvd(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull ActivateTEERequest activateTEERequest, @NotNull Continuation<? super ResponseData<ActivateTEEResult>> continuation);

    @POST("priapi/v2/wallet/smart-account/batchAuthorize")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    java.lang.Object EZpvd(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull TeeBatchAuthorizeReqData teeBatchAuthorizeReqData, @NotNull Continuation<? super ResponseData<UpgradeTeeResult>> continuation);

    @POST("/v1/deposit/app/txSupport/fastTransfer")
    AbstractC58185ywX<ResponseData<java.lang.Boolean>> EZpvd();

    @GET("/priapi/v1/wallet/aa/accountInfo")
    AbstractC58185ywX<ResponseData<AAAccountInfo>> EZpvd(@Query("chainId") long j, @NotNull @Query("aaAddress") java.lang.String str);

    @POST("/priapi/v1/wallet/common/confirm/balance")
    AbstractC58185ywX<ResponseData<UTXOConfirmBalanceResp>> EZpvd(@Body @NotNull UTXOConfirmBalanceReq uTXOConfirmBalanceReq);

    @POST("/priapi/v1/wallet/aa/gasLimit")
    AbstractC58185ywX<ResponseData<java.util.List<AAGasLimit>>> EZpvd(@Body @NotNull AAGasLimitReq aAGasLimitReq);

    @POST("/priapi/v1/wallet/approval/aa/list")
    AbstractC58185ywX<ResponseData<java.util.ArrayList<AAApprovalInfo>>> EZpvd(@Body @NotNull ApproveAASubRequest approveAASubRequest);

    @POST("/priapi/v1/wallet/common/pending/check")
    AbstractC58185ywX<ResponseData<java.lang.Boolean>> EZpvd(@Body @NotNull BTCTooManyTransactionReq bTCTooManyTransactionReq);

    @POST("/priapi/v2/wallet/escape/gasLimit")
    AbstractC58185ywX<ResponseData<CeDefiGasResp>> EZpvd(@Body @NotNull CeDefiGasLimitReq ceDefiGasLimitReq, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str);

    @POST("/priapi/v1/wallet/aa/dapp/check")
    AbstractC58185ywX<ResponseData<CheckDappResonse>> EZpvd(@Body @NotNull CheckDapp checkDapp);

    @POST("/v1/deposit/coins/price")
    AbstractC58185ywX<ResponseData<java.util.List<CoinPrice>>> EZpvd(@Body @NotNull CoinIdsReq coinIdsReq);

    @POST("/priapi/v1/wallet/tx/utxo/info")
    AbstractC58185ywX<ResponseData<DappBTCUTXOResp>> EZpvd(@Body @NotNull DappBtcUtxoFeeReq dappBtcUtxoFeeReq);

    @POST("/priapi/v2/wallet/tx/address-check")
    AbstractC58185ywX<ResponseData<FromAddressCheckRes>> EZpvd(@Body @NotNull FromAddressCheckReq fromAddressCheckReq, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str);

    @POST("/v1/deposit/app/txSupport/address/getNearAccountId")
    AbstractC58185ywX<ResponseData<GetNearAccountIdResp>> EZpvd(@Body @NotNull GetNearAccountIdReq getNearAccountIdReq);

    @POST("/priapi/v1/wallet/tx/jitoInfo")
    AbstractC58185ywX<ResponseData<JitoInfoResult>> EZpvd(@Body @NotNull JitoInfoReq jitoInfoReq);

    @POST("/priapi/v2/wallet/tx/preExecTransactionv2")
    AbstractC58185ywX<ResponseData<PreExecTransactionRes>> EZpvd(@Body @NotNull PreExecTransactionReq preExecTransactionReq, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str);

    @POST("/v1/deposit/coins/getTokenInfo")
    AbstractC58185ywX<ResponseData<TokenInfoResp>> EZpvd(@Body @NotNull TokenInfoReq tokenInfoReq);

    @POST("/priapi/v1/wallet/batch/tx/status")
    AbstractC58185ywX<ResponseData<java.util.Map<java.lang.String, java.lang.String>>> EZpvd(@Body @NotNull TxStatusBatchReq txStatusBatchReq);

    @GET("/priapi/v1/wallet/aa/getAaAddress")
    AbstractC58185ywX<ResponseData<AAAddressResponse>> EZpvd(@NotNull @Query("eoaAddress") java.lang.String str);

    @GET("/priapi/v2/wallet/asset/main-chain-balance")
    AbstractC58185ywX<ResponseData<MainChainBalanceResp>> EZpvd(@NotNull @Query("accountId") java.lang.String str, @Query("chainIndex") long j);

    @GET("/priapi/v2/wallet/escape/bind-status")
    AbstractC58185ywX<ResponseData<EscapeBindStatusResp>> EZpvd(@NotNull @Query("accountId") java.lang.String str, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str2);

    @GET("/priapi/v1/dx/market/v2/my-position/latest-pnl")
    AbstractC58185ywX<ResponseData<WalletCoinLatestPnlResponse>> EZpvd(@NotNull @Query("chainId") java.lang.String str, @NotNull @Query("walletAddress") java.lang.String str2, @NotNull @Query("tokenContractAddress") java.lang.String str3);

    @POST("/priapi/v1/wallet/coin/list")
    AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> EZpvd(@Body @NotNull java.util.List<java.lang.Long> list);

    @POST("/priapi/v2/wallet/mpc/account/info")
    @InterfaceC13893dbF
    AbstractC58185ywX<ResponseData<AccountMpcResponse>> EZpvd(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull AccountMpcBody accountMpcBody, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str);

    @POST("/priapi/v2/wallet/tx/signInfo")
    @InterfaceC13893dbF
    AbstractC58185ywX<ResponseData<SignInfo>> EZpvd(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull SignInfoReq signInfoReq, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str);

    @POST("/priapi/v1/wallet/mpc/scan/toast")
    @InterfaceC13893dbF(EZpvd = true, copydefault = 2)
    AbstractC58185ywX<ResponseData<ScanStatusResponseBody>> EZpvd(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull UploadScanStatusRequestBody uploadScanStatusRequestBody);

    @POST("/v1/deposit/app/wallet/deleteWallet")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    AbstractC58185ywX<ResponseData<WalletDeleteRes>> EZpvd(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull WalletIdsReq walletIdsReq);

    @GET("/v1/deposit/app/eos/account/key")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    AbstractC58185ywX<ResponseData<java.util.List<EosAccountKeyResp>>> EZpvd(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @NotNull @Query("pubKey") java.lang.String str);

    @POST
    @InterfaceC13893dbF
    AbstractC58185ywX<JsonObject> EZpvd(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Url @NotNull java.lang.String str, @Body @NotNull JsonElement jsonElement, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str2);

    @POST("/priapi/v1/wallet/tx/simple/saveTx")
    @InterfaceC13893dbF(EZpvd = true, copydefault = 2)
    AbstractC58185ywX<ResponseData<java.lang.String>> EZpvd(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body RequestBody requestBody);

    @GET("/priapi/v1/wallet/common/checkCreateAddressAvailable")
    java.lang.Object KWHzl(@Query("chainIndex") long j, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str, @Query("walletType") int i, @NotNull Continuation<? super ResponseData<java.lang.Integer>> continuation);

    @GET("/priapi/v2/wallet/search/recommend")
    java.lang.Object KWHzl(@Query("chainIndex") long j, @NotNull @Query("contractAddress") java.lang.String str, @NotNull Continuation<? super ResponseData<SearchRecommendResponse>> continuation);

    @POST("/priapi/v1/dapp/ref/blockAddressCheck")
    java.lang.Object KWHzl(@Body @NotNull BlockAddressCheckReq blockAddressCheckReq, @NotNull Continuation<? super ResponseData<BlockAddressCheckResp>> continuation);

    @POST("/v1/deposit/app/txSupport/address/checkAddress")
    java.lang.Object KWHzl(@Body @NotNull CheckAddressReq checkAddressReq, @NotNull Continuation<? super ResponseData<CheckAddressResp>> continuation);

    @POST("/v1/deposit/coins/price")
    java.lang.Object KWHzl(@Body @NotNull CoinIdsReq coinIdsReq, @NotNull Continuation<? super ResponseData<java.util.List<CoinPrice>>> continuation);

    @POST("/priapi/v1/wallet/coin/by-coin-no")
    java.lang.Object KWHzl(@Body @NotNull CoinTypeNoReq coinTypeNoReq, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<CoinInfoResponse>>> continuation);

    @POST("/priapi/v1/wallet/device/unbind")
    java.lang.Object KWHzl(@Body @NotNull UnbindWalletAndDeviceReq unbindWalletAndDeviceReq, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<UnbindWalletAndDeviceRes>> continuation);

    @POST("/priapi/v2/wallet/url/checkv2")
    java.lang.Object KWHzl(@Body @NotNull VerifyRequest verifyRequest, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<VerifyDAppDomainUrlResponse>> continuation);

    @POST("/priapi/v2/wallet/search/unified")
    java.lang.Object KWHzl(@Body @NotNull WalletSearchRequest walletSearchRequest, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<WalletSearchResponse>> continuation);

    @GET("/priapi/v1/wallet/activity/banner/info-list-new")
    java.lang.Object KWHzl(@NotNull @Query("test") java.lang.String str, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str2, @NotNull Continuation<? super ResponseData<InfoListNew>> continuation);

    @GET("/priapi/v1/wallet/coin/checkIsDynamicByTokenCoinId")
    java.lang.Object KWHzl(@NotNull @Query("coinId") java.lang.String str, @NotNull Continuation<? super ResponseData<java.lang.Boolean>> continuation);

    @GET("/priapi/v1/wallet/common/checkCreateAvailable")
    java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<CheckCreateAvailableResp>> continuation);

    @POST("/priapi/v2/wallet/asset/address/chart")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    java.lang.Object KWHzl(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull ChartDataReq chartDataReq, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<ChartData>>> continuation);

    @POST("/priapi/v1/wallet/tx/utxo/manage")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    java.lang.Object KWHzl(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull UtxoStatusUpdateRequestBody utxoStatusUpdateRequestBody, @NotNull Continuation<? super ResponseData<UtxoStatusUpdateResponseItem>> continuation);

    @POST("priapi/v1/wallet/activity/banner/query-register-status")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    java.lang.Object KWHzl(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull AddressRegisterStatusReq addressRegisterStatusReq, @NotNull Continuation<? super ResponseData<QueryAddressRegisterStatusRes>> continuation);

    @POST("/priapi/v2/wallet/common/batch/createWallet")
    @InterfaceC13893dbF(EZpvd = false)
    java.lang.Object KWHzl(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull CreateWalletReqs createWalletReqs, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<CreateRespBatch>> continuation);

    @POST("/priapi/v1/dapp/common/syncCefiBindStatus")
    @InterfaceC13893dbF(EZpvd = true)
    java.lang.Object KWHzl(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull SyncCefiBindRequestData syncCefiBindRequestData, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @POST("/priapi/v2/wallet/address/common/batch/sync")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    java.lang.Object KWHzl(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull SyncWalletReqs syncWalletReqs, @NotNull Continuation<? super ResponseData<SyncRespBatch>> continuation);

    @POST("/priapi/v2/wallet/asset/all")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    java.lang.Object KWHzl(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull WalletIdsUniqueIdReq walletIdsUniqueIdReq, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<AssetAll>>> continuation);

    @POST("/priapi/v1/wallet/update/name")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    java.lang.Object KWHzl(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull WalletNameUpdateReqs walletNameUpdateReqs, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @GET("/v1/deposit/app/eos/account")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    java.lang.Object KWHzl(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @NotNull @Query(MTAnalysisConstants.Account.KEY_ACCOUNT) java.lang.String str, @NotNull Continuation<? super ResponseData<EosAccountResp>> continuation);

    @POST("/v1/deposit/app/eos/batch/account/key")
    @InterfaceC13893dbF
    java.lang.Object KWHzl(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull java.util.List<EosAccountKeysReq> list, @NotNull Continuation<? super ResponseData<java.util.List<EosAccountKeyRespBatch>>> continuation);

    @GET("/v1/deposit/coins/cosmosChainIds")
    AbstractC58185ywX<ResponseData<JsonObject>> KWHzl();

    @GET("/priapi/v1/wallet/aa/getInitCode")
    AbstractC58185ywX<ResponseData<java.lang.String>> KWHzl(@Query("chainId") long j, @NotNull @Query("eoaAddress") java.lang.String str);

    @POST("/priapi/v1/wallet/mpc/derive/sync")
    AbstractC58185ywX<ResponseData<Unit>> KWHzl(@Body @NotNull MpcDeriveSync mpcDeriveSync);

    @POST("/priapi/v1/wallet/tx/utxo-nft")
    AbstractC58185ywX<ResponseData<UTXONFTListResp>> KWHzl(@Body @NotNull UTXONFTListReq uTXONFTListReq);

    @POST("/priapi/v1/wallet/mpc/cloud/type")
    AbstractC58185ywX<ResponseData<BackupCloudTypeRes>> KWHzl(@Body @NotNull BackupCloudTypeRequest backupCloudTypeRequest);

    @POST("/v1/deposit/wallet/gas/queryGasLimit")
    AbstractC58185ywX<ResponseData<WalletGasLimitRes>> KWHzl(@Body @NotNull GasLimitReq gasLimitReq);

    @POST("/priapi/v1/wallet/common/url/check")
    AbstractC58185ywX<ResponseData<InnerUrlResp>> KWHzl(@Body @NotNull InnerUrlReq innerUrlReq);

    @POST("/priapi/v1/wallet/address/domain-address")
    AbstractC58185ywX<ResponseData<ParseENSResp>> KWHzl(@Body @NotNull ParseENSReq parseENSReq);

    @POST("/v1/deposit/coins/syncUserCoin")
    AbstractC58185ywX<ResponseData<Unit>> KWHzl(@Body @NotNull SyncCoinsReq syncCoinsReq);

    @POST("/v1/deposit/app/market")
    AbstractC58185ywX<ResponseData<java.util.List<MarketDetail>>> KWHzl(@Body @NotNull WalletMarketReq walletMarketReq);

    @POST("/priapi/v1/wallet/coin/queryXrc20Token")
    AbstractC58185ywX<ResponseData<CoinMetaBean>> KWHzl(@Body @NotNull XRC20TokenReq xRC20TokenReq);

    @GET("/priapi/v1/wallet/aa/owner")
    AbstractC58185ywX<ResponseData<AAOwnerRes>> KWHzl(@NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str, @Query("chainId") long j);

    @GET("/priapi/v2/wallet/tx/order/list")
    AbstractC58185ywX<ResponseData<TxRecordList>> KWHzl(@NotNull @Query("accountId") java.lang.String str, @Query("chainId") java.lang.Long l, @Query("startTime") long j, @Query("endTime") long j2, @Query("lastRowId") java.lang.String str2, @Query("limit") int i, @Query("hideRisk") boolean z, @Query("groupType") java.lang.Integer num, @Query("coinId") java.lang.Long l2);

    @GET("priapi/v1/wallet/tx/brc-json")
    AbstractC58185ywX<ResponseData<BrcJsonRes>> KWHzl(@NotNull @Query("tick") java.lang.String str, @NotNull @Query(OtcExtraKeys.AMOUNT) java.lang.String str2, @NotNull @Query("op") java.lang.String str3, @NotNull @Query(TtmlNode.TAG_P) java.lang.String str4, @NotNull @Query("tid") java.lang.String str5);

    @POST("/priapi/v1/wallet/aa/active")
    AbstractC58185ywX<ResponseData<java.util.List<AAActiveRes>>> KWHzl(@Body @NotNull java.util.List<AAGenerateReq> list);

    @POST("priapi/v1/wallet/coin/addCoin")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    AbstractC58185ywX<ResponseData<CoinMetaBean>> KWHzl(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull AddCoinReq addCoinReq);

    @POST("/priapi/v1/wallet/approval/aa/batch/save")
    @InterfaceC13893dbF
    AbstractC58185ywX<ResponseData<Unit>> KWHzl(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull ApproveAASubRequest approveAASubRequest);

    @POST("/priapi/v1/wallet/mpc/escape")
    @InterfaceC13893dbF(EZpvd = true, copydefault = 2)
    AbstractC58185ywX<ResponseData<SyncMpcEscapeStatusRes>> KWHzl(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull SyncMpcEscapeStatusRequestBody syncMpcEscapeStatusRequestBody);

    @POST("/priapi/v2/wallet/address/common/batch/sync")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    AbstractC58185ywX<ResponseData<SyncRespBatch>> KWHzl(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull SyncWalletReqs syncWalletReqs);

    @POST("/v1/deposit/app/eos/tx")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    AbstractC58185ywX<ResponseData<java.lang.String>> KWHzl(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body RequestBody requestBody);

    @POST("/priapi/v2/wallet/asset/profile/all/explorer")
    java.lang.Object OLrzqt(@Body @NotNull AddressAllAssetRequest addressAllAssetRequest, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<AddressAllAssetResponse>> continuation);

    @POST("/v1/deposit/app/wallet/address/check")
    java.lang.Object OLrzqt(@Body @NotNull AddressCheckReq addressCheckReq, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("/priapi/v1/wallet/tx/coin/order/list/explorer")
    java.lang.Object OLrzqt(@Body @NotNull AddressCoinHistoryRequest addressCoinHistoryRequest, @NotNull Continuation<? super ResponseData<AddressCoinHistoryResponse>> continuation);

    @POST("/priapi/v1/wallet/batch/common/chain/check")
    java.lang.Object OLrzqt(@Body @NotNull CheckBatchChainReq checkBatchChainReq, @NotNull Continuation<? super ResponseData<CheckBatchChainResp>> continuation);

    @POST("/priapi/v1/wallet/7702/walletStatus")
    java.lang.Object OLrzqt(@Body @NotNull EIP7702WalletStatusReq eIP7702WalletStatusReq, @NotNull Continuation<? super ResponseData<java.util.List<EIP7702WalletStatusResp>>> continuation);

    @POST("/priapi/v1/dapp/ref/submitV2")
    java.lang.Object OLrzqt(@Body @NotNull ReferralBindReportV2Req referralBindReportV2Req, @NotNull Continuation<? super ResponseData<java.lang.Object>> continuation);

    @GET("/priapi/v1/wallet/common/isVerify")
    java.lang.Object OLrzqt(@NotNull @Query("accountId") java.lang.String str, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str2, @NotNull Continuation<? super ResponseData<VerifyRes>> continuation);

    @GET("priapi/v2/wallet/smart-account/teeStatus")
    java.lang.Object OLrzqt(@NotNull @Query("teeId") java.lang.String str, @NotNull @Query("accountId") java.lang.String str2, @Query("eip7702Status") boolean z, @Query("needChainList") boolean z2, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str3, @NotNull Continuation<? super ResponseData<SingleTeeStatus>> continuation);

    @GET("/priapi/v1/wallet/common/accountSignCheck")
    java.lang.Object OLrzqt(@NotNull @Query("accountId") java.lang.String str, @NotNull Continuation<? super ResponseData<VerifyResp>> continuation);

    @POST("/v1/deposit/wallet/asset/batch/segwit/info")
    java.lang.Object OLrzqt(@Body @NotNull java.util.List<SegWitInfoBean> list, @NotNull Continuation<? super ResponseData<java.util.List<SegWitInfoBeanBatchRes>>> continuation);

    @GET("/priapi/v2/wallet/search/multi-source-hot")
    java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<WalletHotSearchResponse>> continuation);

    @GET("/priapi/v1/wallet/activity/list")
    AbstractC58185ywX<ResponseData<java.util.List<WalletActivityFreeGasRes>>> OLrzqt();

    @GET("/priapi/v1/wallet/aa/payMaster/list")
    AbstractC58185ywX<ResponseData<java.util.ArrayList<PaymasterToken>>> OLrzqt(@Query("chainId") long j, @NotNull @Query("aaAddress") java.lang.String str);

    @POST("/priapi/v2/wallet/coin/addCoinAddr")
    AbstractC58185ywX<ResponseData<java.lang.Object>> OLrzqt(@Body @NotNull AddCoinAddrReq addCoinAddrReq, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str);

    @POST("/priapi/v5/smart-account/v1/external/unified-flow/create-uop/order-type/20500")
    AbstractC58185ywX<ResponseData<CeDefiCreateUopResp>> OLrzqt(@Body @NotNull CeDefiCreateUopReq ceDefiCreateUopReq);

    @POST("/priapi/v5/smart-account/v1/external/unified-flow/send-uop/order-type/20500")
    AbstractC58185ywX<ResponseData<JsonElement>> OLrzqt(@Body @NotNull CeDefiSendUopReq ceDefiSendUopReq);

    @POST("/v1/deposit/app/txSupport/address/checkAddress")
    AbstractC58185ywX<ResponseData<CheckAddressResp>> OLrzqt(@Body @NotNull CheckAddressReq checkAddressReq);

    @POST("/priapi/v1/wallet/mpc/dapp/check")
    AbstractC58185ywX<ResponseData<CheckDappResonse>> OLrzqt(@Body @NotNull CheckDapp checkDapp);

    @POST("/priapi/v1/wallet/mpc/check/share")
    AbstractC58185ywX<ResponseData<CheckShareResponse>> OLrzqt(@Body @NotNull CheckShareRequestBody checkShareRequestBody);

    @POST("/v1/deposit/app/txSupport/address/checkTransfer")
    AbstractC58185ywX<ResponseData<CheckTransferResp>> OLrzqt(@Body @NotNull CheckTransferReq checkTransferReq);

    @POST("/priapi/v2/wallet/tx/callData")
    AbstractC58185ywX<ResponseData<EVM5792CallDataRes>> OLrzqt(@Body @NotNull EVM5792CallDataReq eVM5792CallDataReq, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str);

    @POST("/v1/deposit/app/txSupport/address/addressRegisterStatus")
    AbstractC58185ywX<ResponseData<RegisterStatusResp>> OLrzqt(@Body @NotNull RegisterStatusReq registerStatusReq);

    @POST("/priapi/v1/wallet/common/call/data/check")
    AbstractC58185ywX<ResponseData<SignCallDataCheckRes>> OLrzqt(@Body @NotNull SignCallDataCheckReq signCallDataCheckReq);

    @POST("/priapi/v1/wallet/tx/order/detail")
    AbstractC58185ywX<ResponseData<TxIdOrHashHistoryDetail>> OLrzqt(@Body @NotNull WalletTxHistoryDetailReq walletTxHistoryDetailReq);

    @POST("/priapi/v1/wallet/asset/detail")
    AbstractC58185ywX<ResponseData<XRC20BalanceDetailInfoResp>> OLrzqt(@Body @NotNull XRC20BalanceDetailInfoReq xRC20BalanceDetailInfoReq);

    @GET("/priapi/v1/wallet/coins/custom")
    AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> OLrzqt(@retrofit2.http.Tag @NotNull CacheStrategy cacheStrategy, @NotNull @Query("userUniqueId") java.lang.String str);

    @GET("/priapi/v1/wallet/activity/freeGas/check")
    AbstractC58185ywX<ResponseData<FreeGasCheckAuthorityRes>> OLrzqt(@Query("activityId") java.lang.Integer num, @NotNull @Query("chainId") java.lang.String str, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str2, @Query("dappAddress") java.lang.String str3, @Query("accountId") java.lang.String str4);

    @GET
    AbstractC58185ywX<ResponseBody> OLrzqt(@Url @NotNull java.lang.String str);

    @GET("/priapi/v1/wallet/approval/project/risky/flag")
    AbstractC58185ywX<ResponseData<ApproveRiskResponse>> OLrzqt(@NotNull @Query("accountId") java.lang.String str, @Query("riskyType") int i, @Header("Cache-Strategy") @NotNull java.lang.String str2, @Header("Cache-Expire") java.lang.Integer num);

    @GET("/v1/deposit/coins/price/curve/market-support")
    AbstractC58185ywX<ResponseData<java.lang.Boolean>> OLrzqt(@Query("contractAddress") java.lang.String str, @NotNull @Query("chainId") java.lang.String str2);

    @POST("/priapi/v1/wallet/asset/queryByAddress")
    AbstractC58185ywX<ResponseData<java.util.List<AssetRsp>>> OLrzqt(@Body @NotNull java.util.List<AssetReq> list);

    @POST("/priapi/v2/wallet/aa/account")
    AbstractC58185ywX<ResponseData<java.util.List<AAGenerateRes>>> OLrzqt(@Body @NotNull java.util.List<AAGenerateReq> list, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str);

    @POST("/priapi/v2/wallet/tx/extFee")
    @InterfaceC13893dbF
    AbstractC58185ywX<ResponseData<ExtFeeResp>> OLrzqt(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull InputDataReq inputDataReq, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str);

    @POST("/priapi/v1/wallet/mpc/scan/upload")
    @InterfaceC13893dbF(EZpvd = true, copydefault = 2)
    AbstractC58185ywX<ResponseData<ScanStatusResponseBody>> OLrzqt(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull UploadScanShareRequestBody uploadScanShareRequestBody);

    @GET("/v1/deposit/app/eos/account")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    AbstractC58185ywX<ResponseData<EosAccountResp>> OLrzqt(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @NotNull @Query(MTAnalysisConstants.Account.KEY_ACCOUNT) java.lang.String str);

    @POST("/v1/deposit/coins/batch/getContractTokenInfo")
    @InterfaceC13893dbF
    AbstractC58185ywX<ResponseData<java.util.List<ContractAddressResp>>> OLrzqt(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull java.util.List<ContractAddressReq> list);

    @POST("/v1/deposit/app/eos/account/friend")
    @InterfaceC13893dbF
    AbstractC58185ywX<ResponseData<java.lang.String>> OLrzqt(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body RequestBody requestBody);

    @GET("/priapi/v1/wallet/web/coinInfo")
    java.lang.Object copydefault(@Query("chainId") long j, @NotNull @Query("tokenAddress") java.lang.String str, @NotNull Continuation<? super ResponseData<CoinInfoBean>> continuation);

    @GET("/priapi/v1/wallet/coin/protocolList")
    java.lang.Object copydefault(@Query("chainId") long j, @NotNull Continuation<? super ResponseData<java.util.List<CoinProtocol>>> continuation);

    @POST("/priapi/v1/wallet/tx/utxo/double/check")
    java.lang.Object copydefault(@Body @NotNull UtxoConfirmationRequest utxoConfirmationRequest, @NotNull Continuation<? super ResponseData<UtxoConfirmationResponse>> continuation);

    @POST("priapi/v2/wallet/smart-account/status")
    java.lang.Object copydefault(@Body @NotNull TeeAnd7702WalletStatusReq teeAnd7702WalletStatusReq, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<TeeAnd7702WalletStatusResp>> continuation);

    @POST("/priapi/v2/wallet/address/profile/batch/search/explorer")
    java.lang.Object copydefault(@Body @NotNull SearchAddressRequest searchAddressRequest, @NotNull Continuation<? super ResponseData<java.util.List<SearchAddressResponse>>> continuation);

    @GET("/priapi/v1/wallet/common/chain/alert")
    java.lang.Object copydefault(@Header("Cache-Strategy") @NotNull java.lang.String str, @Header("Cache-Expire") int i, @NotNull @Query("fromVersion") java.lang.String str2, @NotNull Continuation<? super ResponseData<AlertChainIdListResponse>> continuation);

    @GET("/priapi/v1/dx/market/v2/pnl/wallet-profile/summary")
    java.lang.Object copydefault(@NotNull @Query("periodType") java.lang.String str, @Query("walletAddress") java.lang.String str2, @Query("chainId") java.lang.Long l, @Query("accountId") java.lang.String str3, @NotNull Continuation<? super ResponseData<WalletPnlAnalysisResponse>> continuation);

    @GET("/priapi/v1/dapp/common/getCefiBindQr")
    java.lang.Object copydefault(@NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) java.lang.String str, @NotNull @Query("chainId") java.lang.String str2, @NotNull @Query("source") java.lang.String str3, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str4, @NotNull Continuation<? super ResponseData<WalletCeFiBindQrResponse>> continuation);

    @GET("/priapi/v2/wallet/legal-terms-version")
    java.lang.Object copydefault(@NotNull @Query("userUniqueId") java.lang.String str, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str2, @NotNull Continuation<? super ResponseData<TermsVersionResp>> continuation);

    @GET("/priapi/v2/wallet/asset/wallet/check-zero")
    java.lang.Object copydefault(@NotNull @Query("user-unique-id") java.lang.String str, @NotNull Continuation<? super ResponseData<WalletHaveAssetResp>> continuation);

    @POST("/priapi/v1/wallet/aa/checkAaAddress")
    java.lang.Object copydefault(@Body @NotNull java.util.List<CheckAaAddressRequest> list, @NotNull Continuation<? super ResponseData<java.util.List<CheckAaAddressResponse>>> continuation);

    @GET("/priapi/v1/dapp/ref/ipCheck")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<RefIpCheckResponse>> continuation);

    @POST("priapi/v2/wallet/smart-account/remove")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    java.lang.Object copydefault(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull TeeRemoveRequest teeRemoveRequest, @NotNull Continuation<? super ResponseData<RemoveTeeResult>> continuation);

    @GET("/priapi/v1/wallet/tx/dapp/sign/prompt")
    AbstractC58185ywX<ResponseData<DAppBTCSignPrompt>> copydefault();

    @GET("/v1/deposit/wallet/gas/queryGasPriceByChainId")
    AbstractC58185ywX<ResponseData<GasPrice>> copydefault(@Query("chainId") long j);

    @POST("/priapi/v1/nft/btc/inscriptions/utxo/details")
    AbstractC58185ywX<ResponseData<BTCNFTDetailsResp>> copydefault(@Body @NotNull BTCNFTDetailsReq bTCNFTDetailsReq);

    @POST("/v1/deposit/wallet/asset/approve/project/list")
    AbstractC58185ywX<ResponseData<java.util.List<ApproveItem>>> copydefault(@Body @NotNull ApproveListReq approveListReq);

    @POST("/priapi/v2/wallet/escape/preCreateOrder")
    AbstractC58185ywX<ResponseData<CeDefiPreCreateOrderResp>> copydefault(@Body @NotNull CeDefiPreCreateOrderReq ceDefiPreCreateOrderReq, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str);

    @POST("/priapi/v1/wallet/mpc/chain/info")
    AbstractC58185ywX<ResponseData<java.util.List<EscapeCoinMetaBean>>> copydefault(@Body @NotNull CheckMpcStatusRequestBody checkMpcStatusRequestBody);

    @POST("/priapi/v1/wallet/aa/payMaster/signature")
    AbstractC58185ywX<ResponseData<java.lang.String>> copydefault(@Body @NotNull PayMasterSignatureReq payMasterSignatureReq);

    @POST("/priapi/v1/wallet/common/coinByPageV2")
    AbstractC58185ywX<ResponseData<SearchCoinResp>> copydefault(@Body @NotNull SearchCoinReq searchCoinReq);

    @POST("/priapi/v2/wallet/tx/txtoastcheck")
    AbstractC58185ywX<ResponseData<java.util.List<TxToastCheckRes>>> copydefault(@Body @NotNull TxToastCheckReq txToastCheckReq, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str);

    @POST("/priapi/v1/wallet/aa/getUopSignedHash")
    AbstractC58185ywX<ResponseData<java.lang.String>> copydefault(@Body @NotNull UOPSignedHashReq uOPSignedHashReq);

    @GET("/priapi/v1/nft/project/wallet/info")
    AbstractC58185ywX<ResponseData<NFTCollectionName>> copydefault(@Query("chain") java.lang.Long l, @NotNull @Query("contractAddress") java.lang.String str);

    @GET("/v1/deposit/wallet/gas/gas_price")
    AbstractC58185ywX<ResponseData<GasPrice>> copydefault(@NotNull @Query("network") java.lang.String str);

    @GET("/v1/deposit/app/tx/isDuplicateBizHash")
    AbstractC58185ywX<ResponseData<DuplicateOrder>> copydefault(@NotNull @Query("bizSource") java.lang.String str, @NotNull @Query("bizHash") java.lang.String str2);

    @POST("/priapi/v1/wallet/common/special/utxo")
    AbstractC58185ywX<ResponseData<java.util.List<CardanoUTXOResp>>> copydefault(@HeaderMap @NotNull java.util.Map<java.lang.String, java.lang.String> map, @Body @NotNull CardanoUTXOReq cardanoUTXOReq);

    @GET("/v1/deposit/app/coin/{coinId}/address/{address}/utxo")
    @InterfaceC13893dbF(copydefault = 2)
    AbstractC58185ywX<ResponseData<java.util.List<KaspaUtxoResp>>> copydefault(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @retrofit2.http.Path("coinId") long j, @retrofit2.http.Path(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) @NotNull java.lang.String str, @NotNull @Query("coinAmount") java.lang.String str2, @NotNull @Query("serviceCharge") java.lang.String str3);

    @POST("priapi/v1/wallet/coin/batch/add-coin")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> copydefault(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull AddCoinBatchReq addCoinBatchReq);

    @POST("/v1/deposit/coins/getContractTokenInfo")
    @InterfaceC13893dbF
    AbstractC58185ywX<ResponseData<ContractAddressResp>> copydefault(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull ContractAddressReq contractAddressReq);

    @POST("/priapi/v2/wallet/common/batch/createWallet")
    @InterfaceC13893dbF(EZpvd = false)
    AbstractC58185ywX<ResponseData<CreateRespBatch>> copydefault(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull CreateWalletReqs createWalletReqs, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str);

    @POST("priapi/v1/wallet/activity/hot-activity/status")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    AbstractC58185ywX<ResponseData<HotActivityAddressStatusResp>> copydefault(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull HotActivityAddressStatusReq hotActivityAddressStatusReq);

    @POST("/priapi/v2/wallet/token/report")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    AbstractC58185ywX<ResponseData<ReportRiskyTokenResp>> copydefault(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull ReportRiskyTokenReq reportRiskyTokenReq);

    @POST("/priapi/v2/wallet/asset/all")
    @InterfaceC13893dbF(EZpvd = false, copydefault = 2)
    AbstractC58185ywX<ResponseData<java.util.List<AssetAll>>> copydefault(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull WalletIdsUniqueIdReq walletIdsUniqueIdReq, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str);

    @POST("/priapi/v2/wallet/asset/tokens")
    @InterfaceC13893dbF(EZpvd = false)
    AbstractC58185ywX<ResponseData<java.util.List<AssetAll>>> copydefault(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull WalletsTokensAssetReq walletsTokensAssetReq, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str);

    @GET
    @InterfaceC13893dbF
    AbstractC58185ywX<JsonObject> copydefault(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Url @NotNull java.lang.String str, @QueryMap @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str2);

    @POST("/priapi/v1/wallet/mpc/status")
    @InterfaceC13893dbF
    AbstractC58185ywX<ResponseData<java.util.List<CheckMpcStatusResponse>>> copydefault(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body @NotNull java.util.List<CheckMpcStatusRequestBody> list);

    @POST("/priapi/v1/wallet/tx/saveTx")
    @InterfaceC13893dbF(EZpvd = true, copydefault = 2)
    AbstractC58185ywX<ResponseData<java.lang.String>> copydefault(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body RequestBody requestBody);

    @POST("priapi/v2/wallet/tx/batch/saveTx")
    @InterfaceC13893dbF
    AbstractC58185ywX<ResponseData<java.util.HashMap<java.lang.String, java.lang.String>>> copydefault(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body RequestBody requestBody, @Header("OK-VERIFY-TOKEN") @NotNull java.lang.String str);

    @GET("/priapi/v1/dapp/ref/invitation/detail")
    java.lang.Object djBIcL(@NotNull @Query("code") java.lang.String str, @NotNull Continuation<? super ResponseData<ReferralSubInviterInvitationResponse>> continuation);

    @GET("/priapi/v1/dx/market/v2/chain/list")
    java.lang.Object djBIcL(@NotNull Continuation<? super ResponseData<java.util.List<MarketChainBean>>> continuation);

    @GET("/v1/deposit/app/eos/res")
    AbstractC58185ywX<ResponseData<EosRes>> djBIcL();

    @POST("priapi/v1/wallet/tx/batch/saveTx")
    @InterfaceC13893dbF(EZpvd = true, copydefault = 2)
    AbstractC58185ywX<ResponseData<java.util.HashMap<java.lang.String, java.lang.String>>> djBIcL(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body RequestBody requestBody);

    @GET("/priapi/v2/wallet/home/module/info")
    java.lang.Object gEmmrt(@NotNull Continuation<? super ResponseData<java.util.List<MoreFunctionModuleInfo>>> continuation);

    @GET("/priapi/v1/wallet/network/test-networks")
    AbstractC58185ywX<ResponseData<java.util.List<CustomNetwork>>> gEmmrt();

    @GET("/priapi/v1/wallet/activity/article/list")
    java.lang.Object isConnected(@NotNull Continuation<? super ResponseData<java.util.List<Article>>> continuation);

    @GET("/priapi/v1/dx/market/v2/pnl/wallet-profile/support-chains")
    java.lang.Object valueOf(@NotNull Continuation<? super ResponseData<WalletSupportPnlChainListResponse>> continuation);

    @GET("/priapi/v1/wallet/coins/platform")
    AbstractC58185ywX<ResponseData<PlatformCoinCDNUrlBean>> valueOf();

    @POST("priapi/v1/wallet/tx/batch/saveTxV2")
    @InterfaceC13893dbF(copydefault = 2)
    AbstractC58185ywX<ResponseData<java.util.HashMap<java.lang.String, java.lang.String>>> valueOf(@retrofit2.http.Tag @NotNull C13894dbG c13894dbG, @Body RequestBody requestBody);

    /* JADX INFO: renamed from: o.dbb$StateListAnimator */
    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator AEQbTJ = new StateListAnimator();
        public static final InterfaceC56387yDm<C13927dbn> EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.dbd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InterfaceC13915dbb.StateListAnimator.EZpvd();
            }
        });

        private StateListAnimator() {
        }

        public static final C13927dbn EZpvd() {
            return new C13927dbn();
        }

        public final C13927dbn OLrzqt() {
            return EZpvd.getValue();
        }

        public final InterfaceC13915dbb copydefault() {
            return (InterfaceC13915dbb) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC13915dbb.class), OLrzqt());
        }
    }

    /* JADX INFO: renamed from: o.dbb$Application */
    public static final class Application {
        public static /* synthetic */ AbstractC58185ywX addCoinAddr$default(InterfaceC13915dbb interfaceC13915dbb, AddCoinAddrReq addCoinAddrReq, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCoinAddr");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return interfaceC13915dbb.OLrzqt(addCoinAddrReq, str);
        }

        public static /* synthetic */ java.lang.Object createWalletBatchSuspend$default(InterfaceC13915dbb interfaceC13915dbb, C13894dbG c13894dbG, CreateWalletReqs createWalletReqs, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createWalletBatchSuspend");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            return interfaceC13915dbb.KWHzl(c13894dbG, createWalletReqs, str, (Continuation<? super ResponseData<CreateRespBatch>>) continuation);
        }

        public static /* synthetic */ AbstractC58185ywX batchCreateWallet$default(InterfaceC13915dbb interfaceC13915dbb, C13894dbG c13894dbG, CreateWalletReqs createWalletReqs, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: batchCreateWallet");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            return interfaceC13915dbb.copydefault(c13894dbG, createWalletReqs, str);
        }

        public static /* synthetic */ java.lang.Object getListChain$default(InterfaceC13915dbb interfaceC13915dbb, java.lang.String str, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListChain");
            }
            if ((i2 & 1) != 0) {
                str = "FIRST_CACHE";
            }
            if ((i2 & 2) != 0) {
                i = 7200;
            }
            return interfaceC13915dbb.EZpvd(str, i, (Continuation<? super ResponseData<java.util.List<ListChainResponse>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object verifyWalletAddresses$default(InterfaceC13915dbb interfaceC13915dbb, C13894dbG c13894dbG, CreateWalletReqNew createWalletReqNew, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyWalletAddresses");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            return interfaceC13915dbb.AEQbTJ(c13894dbG, createWalletReqNew, str, (Continuation<? super ResponseData<VerifyResp>>) continuation);
        }

        public static /* synthetic */ AbstractC58185ywX getSignInfo$default(InterfaceC13915dbb interfaceC13915dbb, C13894dbG c13894dbG, SignInfoReq signInfoReq, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSignInfo");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            return interfaceC13915dbb.EZpvd(c13894dbG, signInfoReq, str);
        }

        public static /* synthetic */ AbstractC58185ywX getExtFee$default(InterfaceC13915dbb interfaceC13915dbb, C13894dbG c13894dbG, InputDataReq inputDataReq, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getExtFee");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            return interfaceC13915dbb.OLrzqt(c13894dbG, inputDataReq, str);
        }

        public static /* synthetic */ AbstractC58185ywX chainAvailable$default(InterfaceC13915dbb interfaceC13915dbb, C13894dbG c13894dbG, long j, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: chainAvailable");
            }
            if ((i2 & 16) != 0) {
                str2 = "";
            }
            return interfaceC13915dbb.AEQbTJ(c13894dbG, j, str, i, str2);
        }

        public static /* synthetic */ AbstractC58185ywX getAssetAll$default(InterfaceC13915dbb interfaceC13915dbb, C13894dbG c13894dbG, WalletIdsUniqueIdReq walletIdsUniqueIdReq, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssetAll");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            return interfaceC13915dbb.copydefault(c13894dbG, walletIdsUniqueIdReq, str);
        }

        public static /* synthetic */ java.lang.Object getAssetAllSuspend$default(InterfaceC13915dbb interfaceC13915dbb, C13894dbG c13894dbG, WalletIdsUniqueIdReq walletIdsUniqueIdReq, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssetAllSuspend");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            return interfaceC13915dbb.KWHzl(c13894dbG, walletIdsUniqueIdReq, str, (Continuation<? super ResponseData<java.util.List<AssetAll>>>) continuation);
        }

        public static /* synthetic */ AbstractC58185ywX getTokenAssets$default(InterfaceC13915dbb interfaceC13915dbb, C13894dbG c13894dbG, WalletsTokensAssetReq walletsTokensAssetReq, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTokenAssets");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            return interfaceC13915dbb.copydefault(c13894dbG, walletsTokensAssetReq, str);
        }

        public static /* synthetic */ java.lang.Object getWalletTotalAssets$default(InterfaceC13915dbb interfaceC13915dbb, C13894dbG c13894dbG, WalletTotalAssetReq walletTotalAssetReq, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWalletTotalAssets");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            return interfaceC13915dbb.AEQbTJ(c13894dbG, walletTotalAssetReq, str, (Continuation<? super ResponseData<java.util.List<WalletTotalAssetModel>>>) continuation);
        }

        public static /* synthetic */ AbstractC58185ywX getApproveRiskFlag$default(InterfaceC13915dbb interfaceC13915dbb, java.lang.String str, int i, java.lang.String str2, java.lang.Integer num, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getApproveRiskFlag");
            }
            if ((i2 & 4) != 0) {
                str2 = "FIRST_CACHE";
            }
            return interfaceC13915dbb.OLrzqt(str, i, str2, num);
        }

        public static /* synthetic */ AbstractC58185ywX postTxToastCheck$default(InterfaceC13915dbb interfaceC13915dbb, TxToastCheckReq txToastCheckReq, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTxToastCheck");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return interfaceC13915dbb.copydefault(txToastCheckReq, str);
        }

        public static /* synthetic */ AbstractC58185ywX preExecTransaction$default(InterfaceC13915dbb interfaceC13915dbb, PreExecTransactionReq preExecTransactionReq, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preExecTransaction");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return interfaceC13915dbb.EZpvd(preExecTransactionReq, str);
        }

        public static /* synthetic */ AbstractC58185ywX submitTransactionBatchV2$default(InterfaceC13915dbb interfaceC13915dbb, C13894dbG c13894dbG, RequestBody requestBody, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitTransactionBatchV2");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            return interfaceC13915dbb.copydefault(c13894dbG, requestBody, str);
        }

        public static /* synthetic */ java.lang.Object getBannerInfoListNew$default(InterfaceC13915dbb interfaceC13915dbb, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBannerInfoListNew");
            }
            if ((i & 1) != 0) {
                str = "test";
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            return interfaceC13915dbb.KWHzl(str, str2, (Continuation<? super ResponseData<InfoListNew>>) continuation);
        }

        public static /* synthetic */ AbstractC58185ywX getCoinMarketSupport$default(InterfaceC13915dbb interfaceC13915dbb, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCoinMarketSupport");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return interfaceC13915dbb.OLrzqt(str, str2);
        }

        public static /* synthetic */ java.lang.Object verifyUrl$default(InterfaceC13915dbb interfaceC13915dbb, VerifyRequest verifyRequest, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyUrl");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return interfaceC13915dbb.KWHzl(verifyRequest, str, (Continuation<? super ResponseData<VerifyDAppDomainUrlResponse>>) continuation);
        }

        public static /* synthetic */ AbstractC58185ywX getAccountMpcInformation$default(InterfaceC13915dbb interfaceC13915dbb, C13894dbG c13894dbG, AccountMpcBody accountMpcBody, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAccountMpcInformation");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            return interfaceC13915dbb.EZpvd(c13894dbG, accountMpcBody, str);
        }

        public static /* synthetic */ AbstractC58185ywX getAAAccountAddress$default(InterfaceC13915dbb interfaceC13915dbb, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAAAccountAddress");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return interfaceC13915dbb.OLrzqt((java.util.List<AAGenerateReq>) list, str);
        }

        public static /* synthetic */ AbstractC58185ywX getTestNetworksConfig$default(InterfaceC13915dbb interfaceC13915dbb, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTestNetworksConfig");
            }
            if ((i2 & 1) != 0) {
                str = "FIRST_CACHE";
            }
            if ((i2 & 2) != 0) {
                i = IMarketApiService.SIXTY_MINUTES;
            }
            return interfaceC13915dbb.AEQbTJ(str, i);
        }

        public static /* synthetic */ java.lang.Object getKlineChartData$default(InterfaceC13915dbb interfaceC13915dbb, C13894dbG c13894dbG, ChartDataReq chartDataReq, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getKlineChartData");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            return interfaceC13915dbb.KWHzl(c13894dbG, chartDataReq, str, (Continuation<? super ResponseData<java.util.List<ChartData>>>) continuation);
        }

        public static /* synthetic */ java.lang.Object verifyDAppDomainUrl$default(InterfaceC13915dbb interfaceC13915dbb, VerifyDAppDomainUrlRequest verifyDAppDomainUrlRequest, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyDAppDomainUrl");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return interfaceC13915dbb.EZpvd(verifyDAppDomainUrlRequest, str, (Continuation<? super ResponseData<VerifyDAppDomainUrlResponse>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getAlertChainIdList$default(InterfaceC13915dbb interfaceC13915dbb, java.lang.String str, int i, java.lang.String str2, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAlertChainIdList");
            }
            if ((i2 & 1) != 0) {
                str = "FIRST_CACHE";
            }
            if ((i2 & 2) != 0) {
                i = 7200;
            }
            if ((i2 & 4) != 0) {
                str2 = "";
            }
            return interfaceC13915dbb.copydefault(str, i, str2, (Continuation<? super ResponseData<AlertChainIdListResponse>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getSearchResult$default(InterfaceC13915dbb interfaceC13915dbb, WalletSearchRequest walletSearchRequest, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSearchResult");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return interfaceC13915dbb.KWHzl(walletSearchRequest, str, (Continuation<? super ResponseData<WalletSearchResponse>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getAddressAssetInformation$default(InterfaceC13915dbb interfaceC13915dbb, AddressAllAssetRequest addressAllAssetRequest, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAddressAssetInformation");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return interfaceC13915dbb.OLrzqt(addressAllAssetRequest, str, (Continuation<? super ResponseData<AddressAllAssetResponse>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getTradeHistoryTypes$default(InterfaceC13915dbb interfaceC13915dbb, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradeHistoryTypes");
            }
            if ((i2 & 1) != 0) {
                i = IMarketApiService.SIXTY_MINUTES;
            }
            return interfaceC13915dbb.EZpvd(i, (Continuation<? super ResponseData<TxTypes>>) continuation);
        }

        public static /* synthetic */ AbstractC58185ywX checkFromAddress$default(InterfaceC13915dbb interfaceC13915dbb, FromAddressCheckReq fromAddressCheckReq, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkFromAddress");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return interfaceC13915dbb.EZpvd(fromAddressCheckReq, str);
        }

        public static /* synthetic */ AbstractC58185ywX getRequest$default(InterfaceC13915dbb interfaceC13915dbb, C13894dbG c13894dbG, java.lang.String str, java.util.Map map, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRequest");
            }
            if ((i & 8) != 0) {
                str2 = "";
            }
            return interfaceC13915dbb.copydefault(c13894dbG, str, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map, str2);
        }

        public static /* synthetic */ AbstractC58185ywX postRequest$default(InterfaceC13915dbb interfaceC13915dbb, C13894dbG c13894dbG, java.lang.String str, JsonElement jsonElement, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postRequest");
            }
            if ((i & 8) != 0) {
                str2 = "";
            }
            return interfaceC13915dbb.EZpvd(c13894dbG, str, jsonElement, str2);
        }

        public static /* synthetic */ java.lang.Object getCefiBindQrData$default(InterfaceC13915dbb interfaceC13915dbb, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCefiBindQrData");
            }
            if ((i & 8) != 0) {
                str4 = "";
            }
            return interfaceC13915dbb.copydefault(str, str2, str3, str4, (Continuation<? super ResponseData<WalletCeFiBindQrResponse>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getTeeAnd7702WalletsStatusBatch$default(InterfaceC13915dbb interfaceC13915dbb, TeeAnd7702WalletStatusReq teeAnd7702WalletStatusReq, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTeeAnd7702WalletsStatusBatch");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return interfaceC13915dbb.copydefault(teeAnd7702WalletStatusReq, str, (Continuation<? super ResponseData<TeeAnd7702WalletStatusResp>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getTeeStatus$default(InterfaceC13915dbb interfaceC13915dbb, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC13915dbb.OLrzqt(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? "" : str3, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTeeStatus");
        }

        public static /* synthetic */ java.lang.Object queryTeeUpgradeStatus$default(InterfaceC13915dbb interfaceC13915dbb, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryTeeUpgradeStatus");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            return interfaceC13915dbb.AEQbTJ(str, str2, (Continuation<? super ResponseData<TeeUpgradeStatus>>) continuation);
        }

        public static /* synthetic */ AbstractC58185ywX evm5792CallData$default(InterfaceC13915dbb interfaceC13915dbb, EVM5792CallDataReq eVM5792CallDataReq, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: evm5792CallData");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return interfaceC13915dbb.OLrzqt(eVM5792CallDataReq, str);
        }

        public static /* synthetic */ java.lang.Object evm5792QueryTx$default(InterfaceC13915dbb interfaceC13915dbb, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: evm5792QueryTx");
            }
            if ((i & 4) != 0) {
                str3 = "";
            }
            return interfaceC13915dbb.AEQbTJ(str, str2, str3, (Continuation<? super ResponseData<JsonElement>>) continuation);
        }

        public static /* synthetic */ java.lang.Object unBindWalletAndDevice$default(InterfaceC13915dbb interfaceC13915dbb, UnbindWalletAndDeviceReq unbindWalletAndDeviceReq, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unBindWalletAndDevice");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return interfaceC13915dbb.KWHzl(unbindWalletAndDeviceReq, str, (Continuation<? super ResponseData<UnbindWalletAndDeviceRes>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getCoinInfoByCoinNo$default(InterfaceC13915dbb interfaceC13915dbb, CoinTypeNoReq coinTypeNoReq, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCoinInfoByCoinNo");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return interfaceC13915dbb.KWHzl(coinTypeNoReq, str, (Continuation<? super ResponseData<java.util.List<CoinInfoResponse>>>) continuation);
        }

        public static /* synthetic */ AbstractC58185ywX queryEscapeBindStatus$default(InterfaceC13915dbb interfaceC13915dbb, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryEscapeBindStatus");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            return interfaceC13915dbb.EZpvd(str, str2);
        }

        public static /* synthetic */ AbstractC58185ywX queryEscapeAccountList$default(InterfaceC13915dbb interfaceC13915dbb, C13894dbG c13894dbG, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryEscapeAccountList");
            }
            if ((i & 8) != 0) {
                str3 = "";
            }
            return interfaceC13915dbb.AEQbTJ(c13894dbG, str, str2, str3);
        }

        public static /* synthetic */ java.lang.Object getTermsVersion$default(InterfaceC13915dbb interfaceC13915dbb, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTermsVersion");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            return interfaceC13915dbb.copydefault(str, str2, (Continuation<? super ResponseData<TermsVersionResp>>) continuation);
        }

        public static /* synthetic */ AbstractC58185ywX gasLimit$default(InterfaceC13915dbb interfaceC13915dbb, CeDefiGasLimitReq ceDefiGasLimitReq, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gasLimit");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return interfaceC13915dbb.EZpvd(ceDefiGasLimitReq, str);
        }

        public static /* synthetic */ AbstractC58185ywX preCreateOrder$default(InterfaceC13915dbb interfaceC13915dbb, CeDefiPreCreateOrderReq ceDefiPreCreateOrderReq, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preCreateOrder");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return interfaceC13915dbb.copydefault(ceDefiPreCreateOrderReq, str);
        }

        public static /* synthetic */ java.lang.Object verifyAccount$default(InterfaceC13915dbb interfaceC13915dbb, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyAccount");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            return interfaceC13915dbb.OLrzqt(str, str2, (Continuation<? super ResponseData<VerifyRes>>) continuation);
        }
    }
}
