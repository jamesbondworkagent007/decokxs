package o;

import android.os.Build;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.biz.net.common.SignTypeEnum;
import com.okinc.business.defi.api.bean.AlertChainIdListResponse;
import com.okinc.business.defi.api.bean.BTCNFTDetailsReq;
import com.okinc.business.defi.api.bean.BTCNFTDetailsResp;
import com.okinc.business.defi.api.bean.ChartData;
import com.okinc.business.defi.api.bean.ChartType;
import com.okinc.business.defi.api.bean.CoinPrice;
import com.okinc.business.defi.api.bean.DuplicateOrder;
import com.okinc.business.defi.api.bean.MpcDeriveSync;
import com.okinc.business.defi.api.bean.MpcMaxIndexResponse;
import com.okinc.business.defi.api.bean.NFTCollectionName;
import com.okinc.business.defi.api.bean.NewCurvePrice;
import com.okinc.business.defi.api.bean.SimpleSubmitTxReq;
import com.okinc.business.defi.api.bean.UTXOConfirmBalanceReq;
import com.okinc.business.defi.api.bean.UTXOConfirmBalanceResp;
import com.okinc.business.defi.api.bean.UTXONFTListReq;
import com.okinc.business.defi.api.bean.UTXONFTListResp;
import com.okinc.business.defi.api.bean.VerifyDAppDomainResponse;
import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.BindEmailData;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeDetailDataResp;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeListDataResp;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMStateOverride;
import com.okinc.business.defi.assets.utxo.utxomanagement.AssetsUnderUtxo;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoAssetsRequestBody;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoByType;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationRequest;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoConfirmationResponse;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoItemIdentity;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoRequestBody;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoRequestItem;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoResponseItem;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoStatusUpdateRequestBody;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoStatusUpdateResponseItem;
import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
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
import com.okinc.business.defi.biz.net.bean.AddressAllAssetResponse;
import com.okinc.business.defi.biz.net.bean.AddressAssetResp;
import com.okinc.business.defi.biz.net.bean.AddressCheckReq;
import com.okinc.business.defi.biz.net.bean.AddressCoinHistoryResponse;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import com.okinc.business.defi.biz.net.bean.AddressTxHistoryDetail;
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
import com.okinc.business.defi.biz.net.bean.BlockAddressCheckResp;
import com.okinc.business.defi.biz.net.bean.BrcJsonRes;
import com.okinc.business.defi.biz.net.bean.CancelRebroadcastBTCTransactionReq;
import com.okinc.business.defi.biz.net.bean.CardanoUTXOReq;
import com.okinc.business.defi.biz.net.bean.CardanoUTXOResp;
import com.okinc.business.defi.biz.net.bean.CeDefiAddressCheckResult;
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
import com.okinc.business.defi.biz.net.bean.ContractAddressReq;
import com.okinc.business.defi.biz.net.bean.ContractAddressResp;
import com.okinc.business.defi.biz.net.bean.CreateMpcResponse;
import com.okinc.business.defi.biz.net.bean.CreateRespBatch;
import com.okinc.business.defi.biz.net.bean.CreateWalletReqNew;
import com.okinc.business.defi.biz.net.bean.CreateWalletReqs;
import com.okinc.business.defi.biz.net.bean.DAppBTCSignPrompt;
import com.okinc.business.defi.biz.net.bean.DappBTCUTXOResp;
import com.okinc.business.defi.biz.net.bean.DappBtcUtxoFeeReq;
import com.okinc.business.defi.biz.net.bean.DappGasParam;
import com.okinc.business.defi.biz.net.bean.DeriveInfoList;
import com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp;
import com.okinc.business.defi.biz.net.bean.EIP7702WalletStatusResp;
import com.okinc.business.defi.biz.net.bean.EVM5792CallDataReq;
import com.okinc.business.defi.biz.net.bean.EVM5792CallDataRes;
import com.okinc.business.defi.biz.net.bean.EVMReadContract;
import com.okinc.business.defi.biz.net.bean.EosAccountKeyResp;
import com.okinc.business.defi.biz.net.bean.EosAccountKeyRespBatch;
import com.okinc.business.defi.biz.net.bean.EosAccountKeysReq;
import com.okinc.business.defi.biz.net.bean.EosAccountResp;
import com.okinc.business.defi.biz.net.bean.EosAccountRespBatch;
import com.okinc.business.defi.biz.net.bean.EosOpenAccountReq;
import com.okinc.business.defi.biz.net.bean.EosRes;
import com.okinc.business.defi.biz.net.bean.EosTxReq;
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
import com.okinc.business.defi.biz.net.bean.GetScanShareResponseBody;
import com.okinc.business.defi.biz.net.bean.HandshakeBody;
import com.okinc.business.defi.biz.net.bean.HandshakeResponse;
import com.okinc.business.defi.biz.net.bean.HotActivityAddressStatusReq;
import com.okinc.business.defi.biz.net.bean.HotActivityAddressStatusResp;
import com.okinc.business.defi.biz.net.bean.InfoListNew;
import com.okinc.business.defi.biz.net.bean.InnerUrlReq;
import com.okinc.business.defi.biz.net.bean.InnerUrlResp;
import com.okinc.business.defi.biz.net.bean.InputDataReq;
import com.okinc.business.defi.biz.net.bean.InviteeInfoResponse;
import com.okinc.business.defi.biz.net.bean.InviterCodeResponse;
import com.okinc.business.defi.biz.net.bean.JitoInfoReq;
import com.okinc.business.defi.biz.net.bean.JitoInfoResult;
import com.okinc.business.defi.biz.net.bean.KaspaUtxoResp;
import com.okinc.business.defi.biz.net.bean.ListChainResponse;
import com.okinc.business.defi.biz.net.bean.MainChainBalanceResp;
import com.okinc.business.defi.biz.net.bean.MarketDetail;
import com.okinc.business.defi.biz.net.bean.MoreFunctionModuleInfo;
import com.okinc.business.defi.biz.net.bean.MpcSendTxBody;
import com.okinc.business.defi.biz.net.bean.MpcSendTxResponse;
import com.okinc.business.defi.biz.net.bean.MultiAddressReq;
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
import com.okinc.business.defi.biz.net.bean.ReferralSubInviterInvitationResponse;
import com.okinc.business.defi.biz.net.bean.RegisterAddressStatusRes;
import com.okinc.business.defi.biz.net.bean.RegisterStatusReq;
import com.okinc.business.defi.biz.net.bean.RegisterStatusResp;
import com.okinc.business.defi.biz.net.bean.ReportRiskyTokenReq;
import com.okinc.business.defi.biz.net.bean.ReportRiskyTokenResp;
import com.okinc.business.defi.biz.net.bean.ResetMpcBody;
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
import com.okinc.business.defi.biz.net.bean.SimulateTransactionParam;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.biz.net.bean.SupportCustomCoinChain;
import com.okinc.business.defi.biz.net.bean.SupportedMevNodeBean;
import com.okinc.business.defi.biz.net.bean.SyncCoinsReq;
import com.okinc.business.defi.biz.net.bean.SyncMpcEscapeStatusRequestBody;
import com.okinc.business.defi.biz.net.bean.SyncMpcEscapeStatusRes;
import com.okinc.business.defi.biz.net.bean.SyncRespBatch;
import com.okinc.business.defi.biz.net.bean.SyncShareRequestBody;
import com.okinc.business.defi.biz.net.bean.SyncShareResponse;
import com.okinc.business.defi.biz.net.bean.SyncWalletReqs;
import com.okinc.business.defi.biz.net.bean.TeeAnd7702WalletStatusResp;
import com.okinc.business.defi.biz.net.bean.TeeAndEip7702Item;
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
import com.okinc.business.defi.biz.net.bean.VerifyRes;
import com.okinc.business.defi.biz.net.bean.VerifyResp;
import com.okinc.business.defi.biz.net.bean.WalletAccountDetail;
import com.okinc.business.defi.biz.net.bean.WalletActivityFreeGasRes;
import com.okinc.business.defi.biz.net.bean.WalletCeFiBindQrResponse;
import com.okinc.business.defi.biz.net.bean.WalletCoinAddrRegisterBean;
import com.okinc.business.defi.biz.net.bean.WalletCoinLatestPnlResponse;
import com.okinc.business.defi.biz.net.bean.WalletCoinTxHistoryReq;
import com.okinc.business.defi.biz.net.bean.WalletDeleteRes;
import com.okinc.business.defi.biz.net.bean.WalletGasLimitRes;
import com.okinc.business.defi.biz.net.bean.WalletHaveAssetResp;
import com.okinc.business.defi.biz.net.bean.WalletIdsReq;
import com.okinc.business.defi.biz.net.bean.WalletIdsUniqueIdReq;
import com.okinc.business.defi.biz.net.bean.WalletMarketReq;
import com.okinc.business.defi.biz.net.bean.WalletNameReqBean;
import com.okinc.business.defi.biz.net.bean.WalletNameUpdateReqs;
import com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisResponse;
import com.okinc.business.defi.biz.net.bean.WalletPnlShareInfoResponse;
import com.okinc.business.defi.biz.net.bean.WalletPnlTokenListResponse;
import com.okinc.business.defi.biz.net.bean.WalletSupportPnlChainListResponse;
import com.okinc.business.defi.biz.net.bean.WalletTotalAssetModel;
import com.okinc.business.defi.biz.net.bean.WalletTotalAssetReq;
import com.okinc.business.defi.biz.net.bean.WalletTxHistoryDetailReq;
import com.okinc.business.defi.biz.net.bean.WalletTxJavaReq;
import com.okinc.business.defi.biz.net.bean.WalletsTokensAssetReq;
import com.okinc.business.defi.biz.net.bean.Web3LoginReq;
import com.okinc.business.defi.biz.net.bean.Web3LoginResp;
import com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoReq;
import com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoResp;
import com.okinc.business.defi.biz.net.bean.XRC20TokenReq;
import com.okinc.business.defi.biz.net.bean.ZkTransferFeeReq;
import com.okinc.business.defi.biz.net.bean.ZkTransferFeeResp;
import com.okinc.business.defi.biz.net.loader.WalletLoader$activateTee$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$addressCheck$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$batchExtendTee$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$batchSendEscapeTransactionUop$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$batchUpgradeTee$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$blockAddressCheck$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$blockAddressCheck$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$cancelBTCTransaction$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$checkAAAddressTypeSuspend$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$checkAaAddressStatus$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$checkBatchCommonChain$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$checkBatchCommonChain$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$checkCanRecovery$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$checkCeDefiAddress$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$checkCreateAddressAvailable$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$checkCreateAddressAvailable$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$checkCreateAvailable$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$checkCreateAvailable$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$checkIfTokenIsDynamic$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$checkIfTokenIsDynamic$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$checkNearAddressSuspend$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$checkUsdgCountryLimit$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$checkWalletHaveAsset$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$checkWalletSignStatus$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$checkWalletSignStatus$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$createPasskeyAccount$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$createPasskeyWalletUop$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$createWalletBatch$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$dexReferralCode$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$dexReferralCode$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$dexReferralIpCheck$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$dexReferralIpCheck$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$dexReferralSubmitV2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$dexReferralSubmitV2$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$eosAccountBatchSuspend$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$eosAccountKeysSuspend$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$eosAccountSuspend$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$evm5792QueryTx$2;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAddressAssetAllInformation$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAddressAssetAllInformation$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAddressCoinAssetInformation$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAddressCoinAssetInformation$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAddressCoinHistory$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAddressCoinHistory$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAddressCoinInformation$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAddressCoinInformation$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAddressTxInformation$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAddressTxInformation$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAlertChainIdList$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAlertChainIdList$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAllTagMeta$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAllTagMeta$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAssetAllSuspend$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAssetsUnderUtxo$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAssetsUnderUtxo$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getAttestationFile$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getBannerInfoListNew$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getBannerInfoListNew$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getCefiBindQrData$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getCefiBindQrData$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getChartTypeData$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getChartTypeData$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getChartTypeID$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getChartTypeID$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getCoinInfoByCoinNo$2;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getCoinLatestPnlSuspend$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getCoinLatestPnlSuspend$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getCoinProtocolList$2;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getCosmosChainIdsSuspend$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getEIP7702ChainStatus$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getEIP7702ChainStatus$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getEIP7702WalletStatus$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getEIP7702WalletStatus$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getEscapeDetailInfo$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getEscapeListInfo$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getHotSearch$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getHotSearch$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getInviterRefCode$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getInviterRefCode$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getListChain$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getListChain$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getMarketChainList$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getMarketChainList$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getMessageForSigning$2;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getMoreInfoList$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getMoreInfoList$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getMpcMaxIndex$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getMpcMaxIndex$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getMpcsMaxIndexs$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getMpcsMaxIndexs$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getNearAccountIds$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getOfflineAssetDetail$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getOfflineAssetDetail$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getPWAccountInfo$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getRecoveryInfo$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getSearchAddressProfile$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getSearchAddressProfile$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getSearchRecommendResult$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getSearchRecommendResult$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getSearchResult$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getSearchResult$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getTeeAnd7702WalletsStatus$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getTeeAnd7702WalletsStatus$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getTeeMetadata$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getTeeMetadata$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getTeeWalletsStatus$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getTeeWalletsStatus$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getTermsVersion$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getTermsVersion$result$1$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getTokenShareInfo$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getTokenShareInfo$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getTradeTypes$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getTradeTypes$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getUtxoByType$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getUtxoByType$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getWalletAccountPnlTokenList$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getWalletAccountPnlTokenList$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getWalletAddressPnlTokenList$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getWalletAddressPnlTokenList$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getWalletBannerEvent$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getWalletBannerEvent$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getWalletBindToken$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getWalletBindToken$result$1$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getWalletPnlAnalysis$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getWalletPnlAnalysis$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$getWalletPnlSupportChainList$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$hasUtxo$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$judgeUserEmail$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$loginWeb3Account$2;
import com.okinc.business.defi.biz.net.loader.WalletLoader$parseDomainAddress$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$preCheckAccount$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$queryAddressRegisterStatus$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$queryAddressRegisterStatus$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$queryCoinPriceSuspend$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$queryCryptoReadsArticleList$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$queryCryptoReadsArticleList$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$queryFusionData$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$queryFusionData$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$querySegWitInfoBatchSuspend$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$queryTeeUpgradeStatus$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$rebroadcastBTCTransaction$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$registerActivityAddress$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$registerActivityAddress$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$removeTee$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$requestBindRelationship$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$requestBindRelationship$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$sendPasskeyWalletUop$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$subInviterInvitationDetail$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$subInviterInvitationDetail$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$syncCefiBindStatus$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$syncCefiBindStatus$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$syncWalletBatch$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$syncWalletBatch$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$syncWalletNames$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$unBindWalletAndDevice$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$updateUtxoStatus$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$updateUtxoStatus$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$utxoDoubleCheck$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$utxoDoubleCheck$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$verifyAccount$2;
import com.okinc.business.defi.biz.net.loader.WalletLoader$verifyDAppDomain$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$verifyDAppDomain$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$verifyDAppDomainUrl$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$verifyDAppDomainUrl$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$verifyDAppDomainUrlV2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$verifyDAppDomainUrlV2$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$verifyWalletAddresses$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$verifyWalletAddresses$2$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$wantBind$1;
import com.okinc.business.defi.biz.net.loader.WalletLoader$wantBind$2$1;
import com.okinc.business.defi.common.utils.ReferralBindReportManagerV2;
import com.okinc.business.defi.wallet.BuildConfig;
import com.okinc.business.defi.wallet.bean.CustomNetwork;
import com.okinc.business.defi.wallet.bean.CustomNetworkConfig;
import com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountListResp;
import com.okinc.business.defi.wallet.home.escapebind.model.EscapeBindStatusResp;
import com.okinc.business.defi.wallet.home.usdgActivity.data.model.AddressRegisterBean;
import com.okinc.business.defi.wallet.mine.search.banner.data.model.WalletBannerEventData;
import com.okinc.business.defi.wallet.mine.search.data.model.DiscoverSearchParam;
import com.okinc.business.defi.wallet.mine.search.data.model.MarketChainBean;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.TagMetaData;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletHotSearchResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchResponse;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.GetBindingTokenRequestBody;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.GetBindingTokenResponseBody;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.WalletBindApiService;
import com.okinc.business.defi.wallet.passkey.common.bean.EscapeBatchSendUopReq;
import com.okinc.business.defi.wallet.passkey.common.bean.EscapeBatchSendUopRes;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyAccountData;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletAccountInfoRes;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCheckRecoverRes;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCreateUopRes;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletRecoverInfoRes;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSendUopReq;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSendUopRes;
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
import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.net.MalformedURLException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC43419rot;
import o.C12827cuN;
import o.InterfaceC13857daW;
import o.InterfaceC13915dbb;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.dbu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13934dbu {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    @yCM
    public C13934dbu() {
        C6887aXp.copydefault.copydefault(new InterfaceC6895aXx() { // from class: o.dbu.2
            @Override // o.InterfaceC6895aXx
            public java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return xYW.AEQbTJ.EZpvd(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: o.dbu$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dbu.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final java.util.HashMap<java.lang.String, java.lang.String> OLrzqt() {
            java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
            map.put("currency", C13912dbY.copydefault.EZpvd());
            map.put("device-token", xVW.copydefault());
            map.put("product", "okex-com");
            map.put(MTPushConstants.PlatformNode.KEY_PLATFORM, "android");
            map.put("app-version", BuildConfig.WALLET_VERSION);
            map.put("platform-version", Build.VERSION.RELEASE);
            map.put("userUniqueId", WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).AhwBna());
            map.put("real-app-version", C32979mnm.EZpvd.EZpvd());
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
            if (abstractC12782ctV != null) {
                WalletType.Application application = WalletType.Companion;
                map.put("wallet-type", java.lang.String.valueOf(application.EZpvd(abstractC12782ctV)));
                map.put("wallet-account-type", java.lang.String.valueOf(application.AEQbTJ(abstractC12782ctV)));
            }
            if (mNP.AEQbTJ.copydefault()) {
                map.put("e2e", C33129mqd.gEmmrt(java.lang.Boolean.TRUE));
            }
            return map;
        }

        public final java.util.HashMap<java.lang.String, java.lang.String> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            java.lang.String strValueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
            map.put("X-Client-Private-Key", str);
            map.put("X-Client-Public-Key", str2);
            map.put("OKAsymmetricSignEnable", "true");
            map.put("X-Sign-Type-Key", SignTypeEnum.K1.getType());
            map.put("timestamp", strValueOf);
            map.put("key-id", str3);
            map.put("sign", EZpvd(str, str3, str4, str5, strValueOf));
            if (mNP.AEQbTJ.copydefault()) {
                map.put("e2e", C33129mqd.gEmmrt(java.lang.Boolean.TRUE));
            }
            return map;
        }

        public final java.util.HashMap<java.lang.String, java.lang.String> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
            java.lang.String strValueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            map.put("timestamp", strValueOf);
            map.put("key-id", str2);
            map.put("sign", EZpvd(str, str2, str3, str4, strValueOf));
            if (mNP.AEQbTJ.copydefault()) {
                map.put("e2e", C33129mqd.gEmmrt(java.lang.Boolean.TRUE));
            }
            return map;
        }

        public static /* synthetic */ java.lang.String getSign$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 16) != 0) {
                str5 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            }
            return stateListAnimator.EZpvd(str, str2, str3, str4, str5);
        }

        public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            java.util.ArrayList arrayListCopydefault = yDY.copydefault("currency=" + C13912dbY.copydefault.EZpvd(), "device-token=" + xVW.copydefault(), "key-id=" + str2, "platform=android", "product=okex-com", "timestamp=" + str5);
            if (str3.length() > 0) {
                arrayListCopydefault.add("param=" + str3);
            }
            if (str4.length() > 0) {
                arrayListCopydefault.add("body=" + str4);
            }
            return xYW.AEQbTJ.AEQbTJ(str, CollectionsKt___CollectionsKt.joinToString$default(arrayListCopydefault, ContainerUtils.FIELD_DELIMITER, null, null, 0, null, null, 62, null));
        }
    }

    public final java.util.HashMap<java.lang.String, java.lang.String> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        StateListAnimator stateListAnimator = Companion;
        java.util.HashMap<java.lang.String, java.lang.String> mapOLrzqt = stateListAnimator.OLrzqt();
        mapOLrzqt.putAll(stateListAnimator.OLrzqt(str, str2, str3, str4));
        return mapOLrzqt;
    }

    public final InterfaceC13915dbb EZpvd() {
        return InterfaceC13915dbb.Companion.copydefault();
    }

    public final InterfaceC13857daW AhwBna() {
        return InterfaceC13857daW.Companion.copydefault();
    }

    public final WalletBindApiService KWHzl() {
        return WalletBindApiService.Companion.AEQbTJ();
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull WalletTxJavaReq walletTxJavaReq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(walletTxJavaReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(new C13894dbG(str2, str, str3), C12764ctD.OLrzqt.KWHzl(walletTxJavaReq)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull BroadcastBean broadcastBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(broadcastBean, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(new C13894dbG(str2, str, str3), C12764ctD.OLrzqt.KWHzl(broadcastBean)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.HashMap<java.lang.String, java.lang.String>>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull BatchBroadcastModel batchBroadcastModel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(batchBroadcastModel, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().djBIcL(new C13894dbG(str2, str, str3), C12764ctD.OLrzqt.KWHzl(batchBroadcastModel)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.HashMap<java.lang.String, java.lang.String>>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull BatchBroadcastModel batchBroadcastModel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(batchBroadcastModel, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().valueOf(new C13894dbG(str2, str, str3), C12764ctD.OLrzqt.KWHzl(batchBroadcastModel)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<UTXOConfirmBalanceResp>> AEQbTJ(@NotNull UTXOConfirmBalanceReq uTXOConfirmBalanceReq) {
        Intrinsics.checkNotNullParameter(uTXOConfirmBalanceReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(uTXOConfirmBalanceReq), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<UTXONFTListResp>> OLrzqt(@NotNull UTXONFTListReq uTXONFTListReq) {
        Intrinsics.checkNotNullParameter(uTXONFTListReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(uTXONFTListReq), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<BTCNFTDetailsResp>> KWHzl(@NotNull BTCNFTDetailsReq bTCNFTDetailsReq) {
        Intrinsics.checkNotNullParameter(bTCNFTDetailsReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(bTCNFTDetailsReq), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull SimpleSubmitTxReq simpleSubmitTxReq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(simpleSubmitTxReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(new C13894dbG(str2, str, str3), C12764ctD.OLrzqt.KWHzl(simpleSubmitTxReq)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<PlatformCoinCDNUrlBean>> djBIcL() {
        return C13933dbt.okServerExceptionFilter$default(EZpvd().valueOf(), null, 1, null);
    }

    public final AbstractC58185ywX<ResponseBody> AkhnZx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd().OLrzqt(str);
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> AEQbTJ(@NotNull java.lang.String str, boolean z) {
        CacheStrategy cacheStrategy;
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            cacheStrategy = CacheStrategy.NO_CACHE;
        } else {
            cacheStrategy = CacheStrategy.FIRST_CACHE;
        }
        return C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(cacheStrategy, str), null, 1, null);
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> OLrzqt(@NotNull java.util.List<java.lang.Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(list), null, 1, null);
    }

    public final AbstractC58185ywX<ResponseData<SearchCoinResp>> OLrzqt(@NotNull SearchCoinReq searchCoinReq) {
        Intrinsics.checkNotNullParameter(searchCoinReq, "");
        return C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(searchCoinReq), null, 1, null);
    }

    public final AbstractC58185ywX<ResponseData<ContractAddressResp>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull java.lang.String str3, java.lang.Integer num, java.lang.Boolean bool, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(new C13894dbG(str, str2, null, 4, null), new ContractAddressReq(j, str3, bool, num, str4)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<CoinMetaBean>> KWHzl(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(new XRC20TokenReq(i, str)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<TokenInfoResp>> djBIcL(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(new TokenInfoReq(j, str)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<CoinMetaBean>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Long l, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, @NotNull java.lang.String str5, java.lang.Integer num, java.lang.Long l2, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(new C13894dbG(str, str2, str6), new AddCoinReq(l, str3, str4, i, str5, str2, num, l2)), null, 1, null));
    }

    public static /* synthetic */ AbstractC58185ywX addCoins$default(C13934dbu c13934dbu, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str3 = "";
        }
        return c13934dbu.KWHzl(str, str2, (java.util.List<AddCoinReq>) list, str3);
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<AddCoinReq> list, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(new C13894dbG(str, str2, str3), new AddCoinBatchReq(list)), null, 1, null);
    }

    public final AbstractC58185ywX<ResponseData<java.lang.Object>> AhwBna(@NotNull java.util.List<WalletCoinAddrRegisterBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.addCoinAddr$default(EZpvd(), new AddCoinAddrReq(list), null, 2, null), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<CreateRespBatch>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull CreateWalletReqs createWalletReqs) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(createWalletReqs, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.batchCreateWallet$default(EZpvd(), new C13894dbG(str, str2, null, 4, null), createWalletReqs, null, 4, null), null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull CreateWalletReqs createWalletReqs, @NotNull Continuation<? super AbstractC43419rot<CreateRespBatch, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$createWalletBatch$1 walletLoader$createWalletBatch$1;
        if (continuation instanceof WalletLoader$createWalletBatch$1) {
            walletLoader$createWalletBatch$1 = (WalletLoader$createWalletBatch$1) continuation;
            int i = walletLoader$createWalletBatch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$createWalletBatch$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$createWalletBatch$1 = new WalletLoader$createWalletBatch$1(this, continuation);
            }
        }
        WalletLoader$createWalletBatch$1 walletLoader$createWalletBatch$12 = walletLoader$createWalletBatch$1;
        java.lang.Object objCreateWalletBatchSuspend$default = walletLoader$createWalletBatch$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$createWalletBatch$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCreateWalletBatchSuspend$default);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                C13894dbG c13894dbG = new C13894dbG(str, str2, null, 4, null);
                walletLoader$createWalletBatch$12.label = 1;
                objCreateWalletBatchSuspend$default = InterfaceC13915dbb.Application.createWalletBatchSuspend$default(interfaceC13915dbbEZpvd, c13894dbG, createWalletReqs, null, walletLoader$createWalletBatch$12, 4, null);
                if (objCreateWalletBatchSuspend$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCreateWalletBatchSuspend$default);
            }
            ResponseData responseData = (ResponseData) objCreateWalletBatchSuspend$default;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    public final AbstractC58185ywX<ResponseData<SyncRespBatch>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull SyncWalletReqs syncWalletReqs, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(syncWalletReqs, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(new C13894dbG(str, str2, str3), syncWalletReqs), null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull SyncWalletReqs syncWalletReqs, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<SyncRespBatch, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$syncWalletBatch$1 walletLoader$syncWalletBatch$1;
        if (continuation instanceof WalletLoader$syncWalletBatch$1) {
            walletLoader$syncWalletBatch$1 = (WalletLoader$syncWalletBatch$1) continuation;
            int i = walletLoader$syncWalletBatch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$syncWalletBatch$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$syncWalletBatch$1 = new WalletLoader$syncWalletBatch$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$syncWalletBatch$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$syncWalletBatch$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                WalletLoader$syncWalletBatch$2$1 walletLoader$syncWalletBatch$2$1 = new WalletLoader$syncWalletBatch$2$1(this, str2, str, str3, syncWalletReqs, null);
                walletLoader$syncWalletBatch$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, walletLoader$syncWalletBatch$2$1, walletLoader$syncWalletBatch$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<VerifyResp, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$checkWalletSignStatus$1 walletLoader$checkWalletSignStatus$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$checkWalletSignStatus$1) {
            walletLoader$checkWalletSignStatus$1 = (WalletLoader$checkWalletSignStatus$1) continuation;
            int i = walletLoader$checkWalletSignStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$checkWalletSignStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$checkWalletSignStatus$1 = new WalletLoader$checkWalletSignStatus$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$checkWalletSignStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$checkWalletSignStatus$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                WalletLoader$checkWalletSignStatus$2$1 walletLoader$checkWalletSignStatus$2$1 = new WalletLoader$checkWalletSignStatus$2$1(this, str, null);
                walletLoader$checkWalletSignStatus$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, walletLoader$checkWalletSignStatus$2$1, walletLoader$checkWalletSignStatus$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<RefInfoResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$wantBind$1 walletLoader$wantBind$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$wantBind$1) {
            walletLoader$wantBind$1 = (WalletLoader$wantBind$1) continuation;
            int i = walletLoader$wantBind$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$wantBind$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$wantBind$1 = new WalletLoader$wantBind$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$wantBind$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$wantBind$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                WalletLoader$wantBind$2$1 walletLoader$wantBind$2$1 = new WalletLoader$wantBind$2$1(this, str, str2, null);
                walletLoader$wantBind$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, walletLoader$wantBind$2$1, walletLoader$wantBind$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    public static /* synthetic */ java.lang.Object dexReferralCode$default(C13934dbu c13934dbu, java.lang.String str, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c13934dbu.KWHzl(str, z, (Continuation<? super AbstractC43419rot<PreferRefCodeInfoResponse, OKServerException>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super AbstractC43419rot<PreferRefCodeInfoResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$dexReferralCode$1 walletLoader$dexReferralCode$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$dexReferralCode$1) {
            walletLoader$dexReferralCode$1 = (WalletLoader$dexReferralCode$1) continuation;
            int i = walletLoader$dexReferralCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$dexReferralCode$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$dexReferralCode$1 = new WalletLoader$dexReferralCode$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$dexReferralCode$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$dexReferralCode$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                WalletLoader$dexReferralCode$2$1 walletLoader$dexReferralCode$2$1 = new WalletLoader$dexReferralCode$2$1(this, str, z, null);
                walletLoader$dexReferralCode$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, walletLoader$dexReferralCode$2$1, walletLoader$dexReferralCode$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AkhnZx(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<ReferralSubInviterInvitationResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$subInviterInvitationDetail$1 walletLoader$subInviterInvitationDetail$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$subInviterInvitationDetail$1) {
            walletLoader$subInviterInvitationDetail$1 = (WalletLoader$subInviterInvitationDetail$1) continuation;
            int i = walletLoader$subInviterInvitationDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$subInviterInvitationDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$subInviterInvitationDetail$1 = new WalletLoader$subInviterInvitationDetail$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$subInviterInvitationDetail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$subInviterInvitationDetail$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                WalletLoader$subInviterInvitationDetail$2$1 walletLoader$subInviterInvitationDetail$2$1 = new WalletLoader$subInviterInvitationDetail$2$1(this, str, null);
                walletLoader$subInviterInvitationDetail$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, walletLoader$subInviterInvitationDetail$2$1, walletLoader$subInviterInvitationDetail$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43419rot<BlockAddressCheckResp, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$blockAddressCheck$1 walletLoader$blockAddressCheck$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$blockAddressCheck$1) {
            walletLoader$blockAddressCheck$1 = (WalletLoader$blockAddressCheck$1) continuation;
            int i = walletLoader$blockAddressCheck$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$blockAddressCheck$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$blockAddressCheck$1 = new WalletLoader$blockAddressCheck$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$blockAddressCheck$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$blockAddressCheck$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                WalletLoader$blockAddressCheck$2$1 walletLoader$blockAddressCheck$2$1 = new WalletLoader$blockAddressCheck$2$1(this, map, null);
                walletLoader$blockAddressCheck$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, walletLoader$blockAddressCheck$2$1, walletLoader$blockAddressCheck$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<InviteeInfoResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$requestBindRelationship$1 walletLoader$requestBindRelationship$1;
        if (continuation instanceof WalletLoader$requestBindRelationship$1) {
            walletLoader$requestBindRelationship$1 = (WalletLoader$requestBindRelationship$1) continuation;
            int i = walletLoader$requestBindRelationship$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$requestBindRelationship$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$requestBindRelationship$1 = new WalletLoader$requestBindRelationship$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$requestBindRelationship$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$requestBindRelationship$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                WalletLoader$requestBindRelationship$2$1 walletLoader$requestBindRelationship$2$1 = new WalletLoader$requestBindRelationship$2$1(this, str, str2, str3, str4, null);
                walletLoader$requestBindRelationship$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, walletLoader$requestBindRelationship$2$1, walletLoader$requestBindRelationship$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC43419rot<RefIpCheckResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$dexReferralIpCheck$1 walletLoader$dexReferralIpCheck$1;
        if (continuation instanceof WalletLoader$dexReferralIpCheck$1) {
            walletLoader$dexReferralIpCheck$1 = (WalletLoader$dexReferralIpCheck$1) continuation;
            int i = walletLoader$dexReferralIpCheck$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$dexReferralIpCheck$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$dexReferralIpCheck$1 = new WalletLoader$dexReferralIpCheck$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$dexReferralIpCheck$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$dexReferralIpCheck$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                WalletLoader$dexReferralIpCheck$2$1 walletLoader$dexReferralIpCheck$2$1 = new WalletLoader$dexReferralIpCheck$2$1(this, null);
                walletLoader$dexReferralIpCheck$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, walletLoader$dexReferralIpCheck$2$1, walletLoader$dexReferralIpCheck$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull ReferralBindReportManagerV2.ReferralBindReportDataV2 referralBindReportDataV2, @NotNull Continuation<? super AbstractC43419rot<? extends java.lang.Object, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$dexReferralSubmitV2$1 walletLoader$dexReferralSubmitV2$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$dexReferralSubmitV2$1) {
            walletLoader$dexReferralSubmitV2$1 = (WalletLoader$dexReferralSubmitV2$1) continuation;
            int i = walletLoader$dexReferralSubmitV2$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$dexReferralSubmitV2$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$dexReferralSubmitV2$1 = new WalletLoader$dexReferralSubmitV2$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$dexReferralSubmitV2$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$dexReferralSubmitV2$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                WalletLoader$dexReferralSubmitV2$2$1 walletLoader$dexReferralSubmitV2$2$1 = new WalletLoader$dexReferralSubmitV2$2$1(this, referralBindReportDataV2, null);
                walletLoader$dexReferralSubmitV2$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, walletLoader$dexReferralSubmitV2$2$1, walletLoader$dexReferralSubmitV2$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object djBIcL(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<InviterCodeResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getInviterRefCode$1 walletLoader$getInviterRefCode$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$getInviterRefCode$1) {
            walletLoader$getInviterRefCode$1 = (WalletLoader$getInviterRefCode$1) continuation;
            int i = walletLoader$getInviterRefCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getInviterRefCode$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getInviterRefCode$1 = new WalletLoader$getInviterRefCode$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getInviterRefCode$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getInviterRefCode$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                WalletLoader$getInviterRefCode$2$1 walletLoader$getInviterRefCode$2$1 = new WalletLoader$getInviterRefCode$2$1(this, str, null);
                walletLoader$getInviterRefCode$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, walletLoader$getInviterRefCode$2$1, walletLoader$getInviterRefCode$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isConnected(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ListChainResponse>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getListChain$1 walletLoader$getListChain$1;
        if (continuation instanceof WalletLoader$getListChain$1) {
            walletLoader$getListChain$1 = (WalletLoader$getListChain$1) continuation;
            int i = walletLoader$getListChain$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getListChain$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getListChain$1 = new WalletLoader$getListChain$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getListChain$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getListChain$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                WalletLoader$getListChain$2$1 walletLoader$getListChain$2$1 = new WalletLoader$getListChain$2$1(this, null);
                walletLoader$getListChain$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, walletLoader$getListChain$2$1, walletLoader$getListChain$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull CreateWalletReqNew createWalletReqNew, @NotNull Continuation<? super AbstractC43419rot<VerifyResp, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$verifyWalletAddresses$1 walletLoader$verifyWalletAddresses$1;
        if (continuation instanceof WalletLoader$verifyWalletAddresses$1) {
            walletLoader$verifyWalletAddresses$1 = (WalletLoader$verifyWalletAddresses$1) continuation;
            int i = walletLoader$verifyWalletAddresses$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$verifyWalletAddresses$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$verifyWalletAddresses$1 = new WalletLoader$verifyWalletAddresses$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$verifyWalletAddresses$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$verifyWalletAddresses$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                WalletLoader$verifyWalletAddresses$2$1 walletLoader$verifyWalletAddresses$2$1 = new WalletLoader$verifyWalletAddresses$2$1(this, str2, str, str3, createWalletReqNew, null);
                walletLoader$verifyWalletAddresses$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, walletLoader$verifyWalletAddresses$2$1, walletLoader$verifyWalletAddresses$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    public static /* synthetic */ AbstractC58185ywX deleteWalletsInCallThread$default(C13934dbu c13934dbu, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str3 = "";
        }
        return c13934dbu.OLrzqt(str, str2, (java.util.List<java.lang.String>) list, str3);
    }

    public final AbstractC58185ywX<ResponseData<WalletDeleteRes>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(new C13894dbG(str, str2, str3), new WalletIdsReq(list)), null, 1, null);
    }

    public final AbstractC58185ywX<ResponseData<ApproveRiskResponse>> copydefault(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(str, i, str2, num), null, 1, null);
    }

    public static /* synthetic */ AbstractC58185ywX getApproveListInCallThread$default(C13934dbu c13934dbu, java.util.List list, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return c13934dbu.EZpvd((java.util.List<java.lang.String>) list, num);
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<ApproveItem>>> EZpvd(@NotNull java.util.List<java.lang.String> list, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        return C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(new ApproveListReq(list, num)), null, 1, null);
    }

    public final AbstractC58185ywX<ResponseData<WalletGasLimitRes>> copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.Long l, java.lang.String str4, boolean z, java.util.List<EVMAuthorization> list, java.lang.String str5, java.util.List<EVMStateOverride> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58185ywX<ResponseData<WalletGasLimitRes>> abstractC58185ywXKWHzl = EZpvd().KWHzl(new GasLimitReq(str, str2, str3, l, (str4 == null || str4.length() == 0) ? null : C33129mqd.gEmmrt(C33129mqd.KWHzl(str4)), list, str5, list2));
        if (z) {
            return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(abstractC58185ywXKWHzl, null, 1, null));
        }
        return C33527myD.KWHzl(abstractC58185ywXKWHzl);
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<TxToastCheckRes>>> copydefault(@NotNull java.util.List<java.lang.Integer> list, java.lang.Long l, long j, java.lang.Integer num, java.lang.Integer num2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, DappGasParam dappGasParam, java.lang.Integer num3, java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, java.util.List<SimulateTransactionParam> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.postTxToastCheck$default(EZpvd(), new TxToastCheckReq(list, l, num, num2, str, str2, str3, str4, str5, str6, str7, null, dappGasParam, num3, str8, list2, j, str9, str10, 0 == true ? 1 : 0, null, null, 3672064, null), null, 2, null), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<TxToastCheckRes>>> copydefault(@NotNull TxToastCheckReq txToastCheckReq) {
        Intrinsics.checkNotNullParameter(txToastCheckReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.postTxToastCheck$default(EZpvd(), txToastCheckReq, null, 2, null), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<PreExecTransactionRes>> copydefault(@NotNull PreExecTransactionReq preExecTransactionReq) {
        Intrinsics.checkNotNullParameter(preExecTransactionReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.preExecTransaction$default(EZpvd(), preExecTransactionReq, null, 2, null), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<JitoInfoResult>> copydefault(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(new JitoInfoReq(str, j)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<ReportRiskyTokenResp>> KWHzl(@NotNull ReportRiskyTokenReq reportRiskyTokenReq, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(reportRiskyTokenReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(new C13894dbG(str, str2, str3), reportRiskyTokenReq), null, 1, null));
        final Function1 function1 = new Function1() { // from class: o.dbv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13934dbu.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<ReportRiskyTokenResp>> abstractC58185ywXDjBIcL = abstractC58185ywXKWHzl.djBIcL(new InterfaceC58229yxO() { // from class: o.dbw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13934dbu.DbNXlk(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXDjBIcL, "");
        return abstractC58185ywXDjBIcL;
    }

    public static final ResponseData DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new ResponseData(0, null, null, null, new ReportRiskyTokenResp(java.lang.Boolean.FALSE), null, 47, null);
    }

    public final AbstractC58185ywX<ResponseData<SignCallDataCheckRes>> EZpvd(@NotNull SignCallDataCheckReq signCallDataCheckReq) {
        Intrinsics.checkNotNullParameter(signCallDataCheckReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(signCallDataCheckReq), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<TxHistory>> EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, long j, @NotNull java.util.List<java.lang.String> list2, @NotNull java.lang.String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().AEQbTJ(new C13894dbG(str, (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(list), null, 4, null), new WalletCoinTxHistoryReq(list, j, list2, str2, i, z)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<MarketDetail>>> KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(new WalletMarketReq(str, list)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull UTXOInfoReq uTXOInfoReq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(uTXOInfoReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().AEQbTJ(Companion.OLrzqt(str, str2, "", C13933dbt.AEQbTJ(UTXOInfoReq.Companion.serializer(), uTXOInfoReq)), uTXOInfoReq), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<CardanoUTXOResp>>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull CardanoUTXOReq cardanoUTXOReq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(cardanoUTXOReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(Companion.OLrzqt(str, str2, "", C13933dbt.AEQbTJ(CardanoUTXOReq.Companion.serializer(), cardanoUTXOReq)), cardanoUTXOReq), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<BTCSpeedUpFeeRateResp>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull BTCSpeedUpFeeRateReq bTCSpeedUpFeeRateReq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(bTCSpeedUpFeeRateReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().AEQbTJ(Companion.OLrzqt(str, str2, "", C13933dbt.AEQbTJ(BTCSpeedUpFeeRateReq.Companion.serializer(), bTCSpeedUpFeeRateReq)), bTCSpeedUpFeeRateReq), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<XRC20BalanceDetailInfoResp>> KWHzl(@NotNull XRC20BalanceDetailInfoReq xRC20BalanceDetailInfoReq) {
        Intrinsics.checkNotNullParameter(xRC20BalanceDetailInfoReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(xRC20BalanceDetailInfoReq), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<KaspaUtxoResp>>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, long j, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(new C13894dbG(str2, str, str3), j, str6, str4, str5), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<SignInfo>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull SignInfoReq signInfoReq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(signInfoReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.getSignInfo$default(EZpvd(), new C13894dbG(str, str2, null, 4, null), signInfoReq, null, 4, null), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<ExtFeeResp>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InputDataReq inputDataReq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(inputDataReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.getExtFee$default(EZpvd(), new C13894dbG(str, str2, null, 4, null), inputDataReq, null, 4, null), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<ParseENSResp>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(new ParseENSReq(str, str2)), null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object DbNXlk(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<ParseENSResp, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$parseDomainAddress$1 walletLoader$parseDomainAddress$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$parseDomainAddress$1) {
            walletLoader$parseDomainAddress$1 = (WalletLoader$parseDomainAddress$1) continuation;
            int i = walletLoader$parseDomainAddress$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$parseDomainAddress$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$parseDomainAddress$1 = new WalletLoader$parseDomainAddress$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = walletLoader$parseDomainAddress$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$parseDomainAddress$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                ParseDomainReq parseDomainReq = new ParseDomainReq(str);
                walletLoader$parseDomainAddress$1.label = 1;
                objAEQbTJ = interfaceC13915dbbEZpvd.AEQbTJ(parseDomainReq, walletLoader$parseDomainAddress$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            responseData = (ResponseData) objAEQbTJ;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object gEmmrt(@NotNull java.util.List<WalletEntity> list, @NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$syncWalletNames$1 walletLoader$syncWalletNames$1;
        AbstractC43419rot.ActionBar actionBar;
        java.lang.String xpriv;
        java.lang.String id;
        WalletEntity walletEntity;
        java.lang.String xpub;
        WalletEntity walletEntity2;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$syncWalletNames$1) {
            walletLoader$syncWalletNames$1 = (WalletLoader$syncWalletNames$1) continuation;
            int i = walletLoader$syncWalletNames$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$syncWalletNames$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$syncWalletNames$1 = new WalletLoader$syncWalletNames$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = walletLoader$syncWalletNames$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$syncWalletNames$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                for (WalletEntity walletEntity3 : list) {
                    arrayList.add(new WalletNameReqBean(walletEntity3.getName(), walletEntity3.getId()));
                }
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                WalletEntity walletEntity4 = (WalletEntity) CollectionsKt___CollectionsKt.firstOrNull(list);
                java.lang.String str = "";
                if (walletEntity4 == null || (xpriv = walletEntity4.getXpriv()) == null) {
                    xpriv = "";
                }
                if (list == null || (walletEntity2 = (WalletEntity) CollectionsKt___CollectionsKt.firstOrNull(list)) == null || (id = walletEntity2.getId()) == null) {
                    id = "";
                }
                if (list != null && (walletEntity = (WalletEntity) CollectionsKt___CollectionsKt.firstOrNull(list)) != null && (xpub = walletEntity.getXpub()) != null) {
                    str = xpub;
                }
                C13894dbG c13894dbG = new C13894dbG(xpriv, id, str);
                WalletNameUpdateReqs walletNameUpdateReqs = new WalletNameUpdateReqs(arrayList);
                walletLoader$syncWalletNames$1.label = 1;
                objKWHzl = interfaceC13915dbbEZpvd.KWHzl(c13894dbG, walletNameUpdateReqs, walletLoader$syncWalletNames$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            responseData = (ResponseData) objKWHzl;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    public final AbstractC58185ywX<ResponseData<ChainInfo>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull java.lang.String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.chainAvailable$default(EZpvd(), new C13894dbG(str, str2, null, 4, null), j, str3, i, null, 16, null), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<GasPrice>> AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(EZpvd().copydefault(str));
    }

    public final AbstractC58185ywX<ResponseData<GasPrice>> copydefault(long j) {
        return C33527myD.KWHzl(EZpvd().copydefault(j));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<WalletActivityFreeGasRes>>> copydefault() {
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<FreeGasCheckAuthorityRes>> AEQbTJ(java.lang.Integer num, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(num, str, str2, str3, str4), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<AssetAll>>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str4, java.lang.Long l, java.lang.Boolean bool, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        AbstractC58185ywX abstractC58185ywXOkServerExceptionFilter$default = C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.getAssetAll$default(EZpvd(), new C13894dbG(str, str3, str2), new WalletIdsUniqueIdReq(list, str4, l, i, bool), null, 4, null), null, 1, null);
        final Function1 function1 = new Function1() { // from class: o.dbA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13934dbu.copydefault((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXDjBIcL = abstractC58185ywXOkServerExceptionFilter$default.djBIcL(new InterfaceC58229yxO() { // from class: o.dbE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13934dbu.gEmmrt(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dbC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13934dbu.KWHzl(i, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<AssetAll>>> abstractC58185ywXAEQbTJ = abstractC58185ywXDjBIcL.AEQbTJ(new InterfaceC58229yxO() { // from class: o.dbB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13934dbu.isConnected(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData copydefault(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new ResponseData(1000000, null, null, null, null, null, 62, null);
    }

    public static final ResponseData isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData KWHzl(int i, ResponseData responseData) {
        java.util.List<AssetAll> list;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (i == 1) {
            java.util.List<AssetAll> list2 = (java.util.List) responseData.getData();
            if (list2 != null) {
                for (AssetAll assetAll : list2) {
                    assetAll.setDefis(null);
                    assetAll.setNfts(null);
                }
            }
        } else if (i == 2) {
            java.util.List<AssetAll> list3 = (java.util.List) responseData.getData();
            if (list3 != null) {
                for (AssetAll assetAll2 : list3) {
                    assetAll2.setTokens(null);
                    assetAll2.setNfts(null);
                }
            }
        } else if (i == 3 && (list = (java.util.List) responseData.getData()) != null) {
            for (AssetAll assetAll3 : list) {
                assetAll3.setTokens(null);
                assetAll3.setDefis(null);
            }
        }
        return responseData;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str4, java.lang.Long l, java.lang.Boolean bool, int i, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<AssetAll>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getAssetAllSuspend$1 walletLoader$getAssetAllSuspend$1;
        int i2;
        java.util.List<AssetAll> list2;
        if (continuation instanceof WalletLoader$getAssetAllSuspend$1) {
            walletLoader$getAssetAllSuspend$1 = (WalletLoader$getAssetAllSuspend$1) continuation;
            int i3 = walletLoader$getAssetAllSuspend$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                walletLoader$getAssetAllSuspend$1.label = i3 - Integer.MIN_VALUE;
            } else {
                walletLoader$getAssetAllSuspend$1 = new WalletLoader$getAssetAllSuspend$1(this, continuation);
            }
        }
        java.lang.Object assetAllSuspend$default = walletLoader$getAssetAllSuspend$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = walletLoader$getAssetAllSuspend$1.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(assetAllSuspend$default);
                WalletIdsUniqueIdReq walletIdsUniqueIdReq = new WalletIdsUniqueIdReq(list, str4, l, i, bool);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                C13894dbG c13894dbG = new C13894dbG(str, str3, str2);
                i2 = i;
                walletLoader$getAssetAllSuspend$1.I$0 = i2;
                walletLoader$getAssetAllSuspend$1.label = 1;
                assetAllSuspend$default = InterfaceC13915dbb.Application.getAssetAllSuspend$default(interfaceC13915dbbEZpvd, c13894dbG, walletIdsUniqueIdReq, null, walletLoader$getAssetAllSuspend$1, 4, null);
                if (assetAllSuspend$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i4 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = walletLoader$getAssetAllSuspend$1.I$0;
                C56391yDq.AEQbTJ(assetAllSuspend$default);
                i2 = i5;
            }
            ResponseData responseData = (ResponseData) assetAllSuspend$default;
            if (i2 == 1) {
                java.util.List<AssetAll> list3 = (java.util.List) responseData.getData();
                if (list3 != null) {
                    for (AssetAll assetAll : list3) {
                        assetAll.setDefis(null);
                        assetAll.setNfts(null);
                    }
                }
            } else if (i2 == 2) {
                java.util.List<AssetAll> list4 = (java.util.List) responseData.getData();
                if (list4 != null) {
                    for (AssetAll assetAll2 : list4) {
                        assetAll2.setTokens(null);
                        assetAll2.setNfts(null);
                    }
                }
            } else if (i2 == 3 && (list2 = (java.util.List) responseData.getData()) != null) {
                for (AssetAll assetAll3 : list2) {
                    assetAll3.setTokens(null);
                    assetAll3.setDefis(null);
                }
            }
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<AssetAll>>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.Long> list2, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.getTokenAssets$default(EZpvd(), new C13894dbG(str, str2, null, 4, null), new WalletsTokensAssetReq(list, list2, str3, java.lang.Boolean.valueOf(z)), null, 4, null), null, 1, null));
    }

    public static /* synthetic */ java.lang.Object getWalletTotalAssets$default(C13934dbu c13934dbu, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, java.lang.Double d, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            d = null;
        }
        return c13934dbu.KWHzl(str, str2, (java.util.List<WalletAccountDetail>) list, str3, d, (Continuation<? super ResponseData<java.util.List<WalletTotalAssetModel>>>) continuation);
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<WalletAccountDetail> list, @NotNull java.lang.String str3, java.lang.Double d, @NotNull Continuation<? super ResponseData<java.util.List<WalletTotalAssetModel>>> continuation) {
        return InterfaceC13915dbb.Application.getWalletTotalAssets$default(EZpvd(), new C13894dbG(str, str2, null, 4, null), new WalletTotalAssetReq(list, str3, d), null, continuation, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<WalletHaveAssetResp, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$checkWalletHaveAsset$1 walletLoader$checkWalletHaveAsset$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$checkWalletHaveAsset$1) {
            walletLoader$checkWalletHaveAsset$1 = (WalletLoader$checkWalletHaveAsset$1) continuation;
            int i = walletLoader$checkWalletHaveAsset$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$checkWalletHaveAsset$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$checkWalletHaveAsset$1 = new WalletLoader$checkWalletHaveAsset$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = walletLoader$checkWalletHaveAsset$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = walletLoader$checkWalletHaveAsset$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                walletLoader$checkWalletHaveAsset$1.label = 1;
                objCopydefault = interfaceC13915dbbEZpvd.copydefault(str, walletLoader$checkWalletHaveAsset$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            responseData = (ResponseData) objCopydefault;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<AssetRsp>>> AEQbTJ(@NotNull java.util.List<AssetReq> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(list), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<SegWitInfoBeanRes>>> gEmmrt(@NotNull java.util.List<SegWitInfoBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().AEQbTJ(list), null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AhwBna(@NotNull java.util.List<SegWitInfoBean> list, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<SegWitInfoBeanBatchRes>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$querySegWitInfoBatchSuspend$1 walletLoader$querySegWitInfoBatchSuspend$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$querySegWitInfoBatchSuspend$1) {
            walletLoader$querySegWitInfoBatchSuspend$1 = (WalletLoader$querySegWitInfoBatchSuspend$1) continuation;
            int i = walletLoader$querySegWitInfoBatchSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$querySegWitInfoBatchSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$querySegWitInfoBatchSuspend$1 = new WalletLoader$querySegWitInfoBatchSuspend$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = walletLoader$querySegWitInfoBatchSuspend$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$querySegWitInfoBatchSuspend$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                walletLoader$querySegWitInfoBatchSuspend$1.label = 1;
                objOLrzqt = interfaceC13915dbbEZpvd.OLrzqt(list, walletLoader$querySegWitInfoBatchSuspend$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            responseData = (ResponseData) objOLrzqt;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    public final AbstractC58185ywX<ResponseData<TxRecordList>> OLrzqt(@NotNull java.lang.String str, java.lang.Long l, long j, long j2, java.lang.String str2, boolean z, int i, java.lang.Integer num, java.lang.Long l2) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(str, l, j, j2, str2, i, z, num, l2), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<EosAccountResp>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(new C13894dbG(str, str3, str2), str4), null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<EosAccountResp, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$eosAccountSuspend$1 walletLoader$eosAccountSuspend$1;
        if (continuation instanceof WalletLoader$eosAccountSuspend$1) {
            walletLoader$eosAccountSuspend$1 = (WalletLoader$eosAccountSuspend$1) continuation;
            int i = walletLoader$eosAccountSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$eosAccountSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$eosAccountSuspend$1 = new WalletLoader$eosAccountSuspend$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = walletLoader$eosAccountSuspend$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$eosAccountSuspend$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                C13894dbG c13894dbG = new C13894dbG(str, str3, str2);
                walletLoader$eosAccountSuspend$1.label = 1;
                objKWHzl = interfaceC13915dbbEZpvd.KWHzl(c13894dbG, str4, walletLoader$eosAccountSuspend$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            ResponseData responseData = (ResponseData) objKWHzl;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<EosAccountRespBatch>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$eosAccountBatchSuspend$1 walletLoader$eosAccountBatchSuspend$1;
        if (continuation instanceof WalletLoader$eosAccountBatchSuspend$1) {
            walletLoader$eosAccountBatchSuspend$1 = (WalletLoader$eosAccountBatchSuspend$1) continuation;
            int i = walletLoader$eosAccountBatchSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$eosAccountBatchSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$eosAccountBatchSuspend$1 = new WalletLoader$eosAccountBatchSuspend$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = walletLoader$eosAccountBatchSuspend$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$eosAccountBatchSuspend$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                C13894dbG c13894dbG = new C13894dbG(str, str2, null, 4, null);
                walletLoader$eosAccountBatchSuspend$1.label = 1;
                objAEQbTJ = interfaceC13915dbbEZpvd.AEQbTJ(c13894dbG, list, walletLoader$eosAccountBatchSuspend$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            ResponseData responseData = (ResponseData) objAEQbTJ;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<EosAccountKeyResp>>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(new C13894dbG(str, str3, str2), str4), null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<EosAccountKeysReq> list, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<EosAccountKeyRespBatch>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$eosAccountKeysSuspend$1 walletLoader$eosAccountKeysSuspend$1;
        if (continuation instanceof WalletLoader$eosAccountKeysSuspend$1) {
            walletLoader$eosAccountKeysSuspend$1 = (WalletLoader$eosAccountKeysSuspend$1) continuation;
            int i = walletLoader$eosAccountKeysSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$eosAccountKeysSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$eosAccountKeysSuspend$1 = new WalletLoader$eosAccountKeysSuspend$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = walletLoader$eosAccountKeysSuspend$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$eosAccountKeysSuspend$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                C13894dbG c13894dbG = new C13894dbG(str, str2, null, 4, null);
                walletLoader$eosAccountKeysSuspend$1.label = 1;
                objKWHzl = interfaceC13915dbbEZpvd.KWHzl(c13894dbG, list, walletLoader$eosAccountKeysSuspend$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            ResponseData responseData = (ResponseData) objKWHzl;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list, @NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$addressCheck$1 walletLoader$addressCheck$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$addressCheck$1) {
            walletLoader$addressCheck$1 = (WalletLoader$addressCheck$1) continuation;
            int i = walletLoader$addressCheck$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$addressCheck$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$addressCheck$1 = new WalletLoader$addressCheck$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = walletLoader$addressCheck$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$addressCheck$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                AddressCheckReq addressCheckReq = new AddressCheckReq(str, list);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                walletLoader$addressCheck$1.label = 1;
                objOLrzqt = interfaceC13915dbbEZpvd.OLrzqt(addressCheckReq, walletLoader$addressCheck$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            responseData = (ResponseData) objOLrzqt;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    public final AbstractC58185ywX<ResponseData<EosRes>> gEmmrt() {
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().djBIcL(), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<Unit>> EZpvd(@NotNull java.util.List<java.lang.Long> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(new SyncCoinsReq(list, str)), null, 1, null);
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<SupportCustomCoinChain>>> fetchVPNInfo() {
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().AhwBna(), null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object valueOf(@NotNull Continuation<? super AbstractC43419rot<InfoListNew, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getBannerInfoListNew$1 walletLoader$getBannerInfoListNew$1;
        if (continuation instanceof WalletLoader$getBannerInfoListNew$1) {
            walletLoader$getBannerInfoListNew$1 = (WalletLoader$getBannerInfoListNew$1) continuation;
            int i = walletLoader$getBannerInfoListNew$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getBannerInfoListNew$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getBannerInfoListNew$1 = new WalletLoader$getBannerInfoListNew$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getBannerInfoListNew$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getBannerInfoListNew$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getBannerInfoListNew$2$1 walletLoader$getBannerInfoListNew$2$1 = new WalletLoader$getBannerInfoListNew$2$1(this, null);
                walletLoader$getBannerInfoListNew$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getBannerInfoListNew$2$1, walletLoader$getBannerInfoListNew$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchVPNInfo(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<MoreFunctionModuleInfo>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getMoreInfoList$1 walletLoader$getMoreInfoList$1;
        if (continuation instanceof WalletLoader$getMoreInfoList$1) {
            walletLoader$getMoreInfoList$1 = (WalletLoader$getMoreInfoList$1) continuation;
            int i = walletLoader$getMoreInfoList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getMoreInfoList$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getMoreInfoList$1 = new WalletLoader$getMoreInfoList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getMoreInfoList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getMoreInfoList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getMoreInfoList$2$1 walletLoader$getMoreInfoList$2$1 = new WalletLoader$getMoreInfoList$2$1(this, null);
                walletLoader$getMoreInfoList$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getMoreInfoList$2$1, walletLoader$getMoreInfoList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<CoinPrice>>> copydefault(@NotNull java.util.List<java.lang.Long> list, java.util.List<java.lang.Long> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(new CoinIdsReq(list, list2)), null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.util.List<java.lang.Long> list, java.util.List<java.lang.Long> list2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CoinPrice>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$queryCoinPriceSuspend$1 walletLoader$queryCoinPriceSuspend$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$queryCoinPriceSuspend$1) {
            walletLoader$queryCoinPriceSuspend$1 = (WalletLoader$queryCoinPriceSuspend$1) continuation;
            int i = walletLoader$queryCoinPriceSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$queryCoinPriceSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$queryCoinPriceSuspend$1 = new WalletLoader$queryCoinPriceSuspend$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = walletLoader$queryCoinPriceSuspend$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$queryCoinPriceSuspend$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                CoinIdsReq coinIdsReq = new CoinIdsReq(list, list2);
                walletLoader$queryCoinPriceSuspend$1.label = 1;
                objKWHzl = interfaceC13915dbbEZpvd.KWHzl(coinIdsReq, walletLoader$queryCoinPriceSuspend$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            responseData = (ResponseData) objKWHzl;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<CoinPrice>>> KWHzl(@NotNull java.util.List<java.lang.Long> list, java.util.List<java.lang.Long> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        return C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(new CoinIdsReq(list, list2)), null, 1, null);
    }

    public final AbstractC58185ywX<ResponseData<java.lang.Boolean>> KWHzl(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
        if (str.length() <= 0) {
            str = null;
        }
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(interfaceC13915dbbEZpvd.OLrzqt(str, java.lang.String.valueOf(j)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<NewCurvePrice>> AEQbTJ(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().AEQbTJ(j, str), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.Boolean>> OLrzqt() {
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<CoinInfoBean>> OLrzqt(long j) {
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().AEQbTJ(j), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<JsonObject>> AYXKKw() {
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(), null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object gEmmrt(@NotNull Continuation<? super AbstractC43419rot<JsonObject, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getCosmosChainIdsSuspend$1 walletLoader$getCosmosChainIdsSuspend$1;
        if (continuation instanceof WalletLoader$getCosmosChainIdsSuspend$1) {
            walletLoader$getCosmosChainIdsSuspend$1 = (WalletLoader$getCosmosChainIdsSuspend$1) continuation;
            int i = walletLoader$getCosmosChainIdsSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getCosmosChainIdsSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getCosmosChainIdsSuspend$1 = new WalletLoader$getCosmosChainIdsSuspend$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = walletLoader$getCosmosChainIdsSuspend$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getCosmosChainIdsSuspend$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                walletLoader$getCosmosChainIdsSuspend$1.label = 1;
                objAEQbTJ = interfaceC13915dbbEZpvd.AEQbTJ(walletLoader$getCosmosChainIdsSuspend$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            ResponseData responseData = (ResponseData) objAEQbTJ;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    public final AbstractC58185ywX<ResponseData<DuplicateOrder>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(str, str2), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<TxIdOrHashHistoryDetail>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, long j, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(new WalletTxHistoryDetailReq(str, str2, str3, j, str4, str5, str6, C33129mqd.OLrzqt((java.lang.CharSequence) str7) ? str7 : null)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, EosTxReq eosTxReq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(new C13894dbG(str2, str, str3), eosTxReq != null ? C12764ctD.OLrzqt.KWHzl(eosTxReq) : null), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, EosOpenAccountReq eosOpenAccountReq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().AEQbTJ(new C13894dbG(str, str2, null, 4, null), eosOpenAccountReq != null ? C12764ctD.OLrzqt.KWHzl(eosOpenAccountReq) : null), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, EosOpenAccountReq eosOpenAccountReq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(new C13894dbG(str, str2, null, 4, null), eosOpenAccountReq != null ? C12764ctD.OLrzqt.KWHzl(eosOpenAccountReq) : null), null, 1, null));
    }

    public static /* synthetic */ AbstractC58185ywX queryAddressRegisterStatus$default(C13934dbu c13934dbu, long j, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            bool = null;
        }
        return c13934dbu.copydefault(j, str, str2, bool);
    }

    public final AbstractC58185ywX<ResponseData<RegisterStatusResp>> copydefault(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(new RegisterStatusReq(java.lang.String.valueOf(j), str, str2, bool)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<CheckTransferResp>> EZpvd(long j) {
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(new CheckTransferReq(java.lang.String.valueOf(j))), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<ZkTransferFeeResp>> EZpvd(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().AEQbTJ(new ZkTransferFeeReq(java.lang.Long.valueOf(j), str, str2)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<CheckAddressResp>> OLrzqt(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(new CheckAddressReq(j, str)), null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(long j, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<CheckAddressResp, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$checkNearAddressSuspend$1 walletLoader$checkNearAddressSuspend$1;
        if (continuation instanceof WalletLoader$checkNearAddressSuspend$1) {
            walletLoader$checkNearAddressSuspend$1 = (WalletLoader$checkNearAddressSuspend$1) continuation;
            int i = walletLoader$checkNearAddressSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$checkNearAddressSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$checkNearAddressSuspend$1 = new WalletLoader$checkNearAddressSuspend$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = walletLoader$checkNearAddressSuspend$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$checkNearAddressSuspend$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                CheckAddressReq checkAddressReq = new CheckAddressReq(j, str);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                walletLoader$checkNearAddressSuspend$1.label = 1;
                objKWHzl = interfaceC13915dbbEZpvd.KWHzl(checkAddressReq, walletLoader$checkNearAddressSuspend$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            ResponseData responseData = (ResponseData) objKWHzl;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    public final AbstractC58185ywX<ResponseData<GetNearAccountIdResp>> DbNXlk(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(new GetNearAccountIdReq(str, (java.lang.String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0))), null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.util.List<GetNearAccountIdReq> list, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<GetNearAccountIdRespBatch>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getNearAccountIds$1 walletLoader$getNearAccountIds$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$getNearAccountIds$1) {
            walletLoader$getNearAccountIds$1 = (WalletLoader$getNearAccountIds$1) continuation;
            int i = walletLoader$getNearAccountIds$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getNearAccountIds$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getNearAccountIds$1 = new WalletLoader$getNearAccountIds$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = walletLoader$getNearAccountIds$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getNearAccountIds$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                walletLoader$getNearAccountIds$1.label = 1;
                objAEQbTJ = interfaceC13915dbbEZpvd.AEQbTJ(list, walletLoader$getNearAccountIds$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            responseData = (ResponseData) objAEQbTJ;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<AddressAssetResp>>> AEQbTJ(long j, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().AEQbTJ(new MultiAddressReq(j, list)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<AddressAssetResp>>> fetchVPNInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().AEQbTJ(new EvmAddressReq(str)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<NFTCollectionName>> copydefault(java.lang.Long l, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(l, str), null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AuCTel(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<Article>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$queryCryptoReadsArticleList$1 walletLoader$queryCryptoReadsArticleList$1;
        if (continuation instanceof WalletLoader$queryCryptoReadsArticleList$1) {
            walletLoader$queryCryptoReadsArticleList$1 = (WalletLoader$queryCryptoReadsArticleList$1) continuation;
            int i = walletLoader$queryCryptoReadsArticleList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$queryCryptoReadsArticleList$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$queryCryptoReadsArticleList$1 = new WalletLoader$queryCryptoReadsArticleList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$queryCryptoReadsArticleList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$queryCryptoReadsArticleList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$queryCryptoReadsArticleList$2$1 walletLoader$queryCryptoReadsArticleList$2$1 = new WalletLoader$queryCryptoReadsArticleList$2$1(this, null);
                walletLoader$queryCryptoReadsArticleList$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$queryCryptoReadsArticleList$2$1, walletLoader$queryCryptoReadsArticleList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fIwbmz(@NotNull Continuation<? super AbstractC43419rot<FusionData, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$queryFusionData$1 walletLoader$queryFusionData$1;
        if (continuation instanceof WalletLoader$queryFusionData$1) {
            walletLoader$queryFusionData$1 = (WalletLoader$queryFusionData$1) continuation;
            int i = walletLoader$queryFusionData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$queryFusionData$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$queryFusionData$1 = new WalletLoader$queryFusionData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$queryFusionData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$queryFusionData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$queryFusionData$2$1 walletLoader$queryFusionData$2$1 = new WalletLoader$queryFusionData$2$1(this, null);
                walletLoader$queryFusionData$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$queryFusionData$2$1, walletLoader$queryFusionData$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    public final AbstractC58185ywX<ResponseData<InnerUrlResp>> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(new InnerUrlReq(str)), null, 1, null));
    }

    public static /* synthetic */ AbstractC58185ywX handshake$default(C13934dbu c13934dbu, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i2, java.lang.Object obj) {
        if ((i2 & 32) != 0) {
            str5 = "";
        }
        return c13934dbu.copydefault(i, str, str2, str3, str4, str5);
    }

    public final AbstractC58185ywX<ResponseData<HandshakeResponse>> copydefault(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(AhwBna().AEQbTJ(new HandshakeBody(i, str, str2, str3, str4, str5)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<CreateMpcResponse>> OLrzqt(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(AhwBna().OLrzqt(new ResetMpcBody(i, str, str2, str3, str4, str5, str6, i2)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<MpcSendTxResponse>> OLrzqt(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(AhwBna().EZpvd(new MpcSendTxBody(i, str, str2, str3, i2, i3)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<AccountMpcResponse>> AEQbTJ(AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final AccountMpcBody accountMpcBody = new AccountMpcBody(str);
        if (abstractC12782ctV == null) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(false).EZpvd();
            final Function1 function1 = new Function1() { // from class: o.dbJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13934dbu.KWHzl((java.lang.Boolean) obj);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.dbH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C13934dbu.AhwBna(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.dbx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13934dbu.copydefault(this.AEQbTJ, accountMpcBody, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX<ResponseData<AccountMpcResponse>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.dbz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C13934dbu.djBIcL(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.getAccountMpcInformation$default(EZpvd(), new C13894dbG(abstractC12782ctV.USBtdM(), abstractC12782ctV.DbNXlk(), null, 4, null), accountMpcBody, null, 4, null), null, 1, null));
    }

    public static final InterfaceC60096zvd AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
            final Function1 function1 = new Function1() { // from class: o.dby
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13934dbu.copydefault((AbstractC12782ctV) obj);
                }
            };
            return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.dbD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C13934dbu.valueOf(function1, obj);
                }
            }).EZpvd();
        }
        return AbstractC58260yxt.copydefault(C56390yDp.OLrzqt("4a6bf6c5e461341e16f25be7207c4575595a49a3c1d572f4cb47f54b99b83bff", "00D7E6E1-4124-4E8F-9473-3E966D26665C")).EZpvd();
    }

    public static final kotlin.Pair valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (abstractC12782ctV.QCjLjM() == WalletSyncStatus.HasSync.getValue()) {
            return C56390yDp.OLrzqt(abstractC12782ctV.USBtdM(), abstractC12782ctV.DbNXlk());
        }
        return C56390yDp.OLrzqt("4a6bf6c5e461341e16f25be7207c4575595a49a3c1d572f4cb47f54b99b83bff", "00D7E6E1-4124-4E8F-9473-3E966D26665C");
    }

    public static final InterfaceC60096zvd djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dbb.Application.getAccountMpcInformation$default(o.dbb, o.dbG, com.okinc.business.defi.biz.net.bean.AccountMpcBody, java.lang.String, int, java.lang.Object):o.ywX */
    /* JADX DEBUG: Class process forced to load method for inline: o.dbt.okServerExceptionFilter$default(o.ywX, java.lang.reflect.Type, int, java.lang.Object):o.ywX */
    public static final InterfaceC60096zvd copydefault(C13934dbu c13934dbu, AccountMpcBody accountMpcBody, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.getAccountMpcInformation$default(c13934dbu.EZpvd(), new C13894dbG((java.lang.String) pair.getFirst(), (java.lang.String) pair.getSecond(), null, 4, null), accountMpcBody, null, 4, null), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<AccountMpcResponse>> valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.getAccountMpcInformation$default(EZpvd(), new C13894dbG("4a6bf6c5e461341e16f25be7207c4575595a49a3c1d572f4cb47f54b99b83bff", "00D7E6E1-4124-4E8F-9473-3E966D26665C", null, 4, null), new AccountMpcBody(str), null, 4, null), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<SyncShareResponse>> copydefault(@NotNull SyncShareRequestBody syncShareRequestBody) {
        Intrinsics.checkNotNullParameter(syncShareRequestBody, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(AhwBna().OLrzqt(syncShareRequestBody), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<CheckShareResponse>> KWHzl(@NotNull CheckShareRequestBody checkShareRequestBody) {
        Intrinsics.checkNotNullParameter(checkShareRequestBody, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(checkShareRequestBody), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<ScanStatusResponseBody>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull UploadScanStatusRequestBody uploadScanStatusRequestBody) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(uploadScanStatusRequestBody, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(new C13894dbG(str, str2, str3), uploadScanStatusRequestBody), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<ScanStatusResponseBody>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull UploadScanShareRequestBody uploadScanShareRequestBody) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(uploadScanShareRequestBody, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(new C13894dbG(str, str2, str3), uploadScanShareRequestBody), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<GetScanShareResponseBody>> gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(AhwBna().KWHzl(str), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<CheckMpcStatusResponse>>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<CheckMpcStatusRequestBody> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(new C13894dbG(str, str2, null, 4, null), list), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<SyncMpcEscapeStatusRes>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(new C13894dbG(str, str2, str3), new SyncMpcEscapeStatusRequestBody(str4, str5)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<CheckDappResonse>> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(new CheckDapp(AYXKKw(str))), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<CheckDappResonse>> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(new CheckDapp(AYXKKw(str))), null, 1, null));
    }

    public final java.lang.String AYXKKw(java.lang.String str) {
        try {
            java.lang.String host = new java.net.URL(str).getHost();
            Intrinsics.checkNotNullExpressionValue(host, "");
            return host;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return str;
        }
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<EscapeCoinMetaBean>>> djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(new CheckMpcStatusRequestBody(str)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<BrcJsonRes>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().AEQbTJ(str, str2, str3), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<BrcJsonRes>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(str, str2, str3, str4, str5), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<BackupCloudTypeRes>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(new BackupCloudTypeRequest(str, str2)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<AAGenerateRes>>> EZpvd(@NotNull java.util.List<AAGenerateReq> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.getAAAccountAddress$default(EZpvd(), list, null, 2, null), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<AAActiveRes>>> KWHzl(@NotNull java.util.List<AAGenerateReq> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(list), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<AAOwnerRes>> OLrzqt(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(str, j), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<AABook>> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().AEQbTJ(str), null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<AABook, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$checkAAAddressTypeSuspend$1 walletLoader$checkAAAddressTypeSuspend$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$checkAAAddressTypeSuspend$1) {
            walletLoader$checkAAAddressTypeSuspend$1 = (WalletLoader$checkAAAddressTypeSuspend$1) continuation;
            int i = walletLoader$checkAAAddressTypeSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$checkAAAddressTypeSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$checkAAAddressTypeSuspend$1 = new WalletLoader$checkAAAddressTypeSuspend$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = walletLoader$checkAAAddressTypeSuspend$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$checkAAAddressTypeSuspend$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                walletLoader$checkAAAddressTypeSuspend$1.label = 1;
                objAEQbTJ = interfaceC13915dbbEZpvd.AEQbTJ(str, walletLoader$checkAAAddressTypeSuspend$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            responseData = (ResponseData) objAEQbTJ;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    public final AbstractC58185ywX<ResponseData<AAAddressResponse>> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(str), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> EZpvd(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(j, str), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.ArrayList<PaymasterToken>>> AYXKKw(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(j, str), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.ArrayList<AAApprovalInfo>>> OLrzqt(@NotNull ApproveAASubRequest approveAASubRequest) {
        Intrinsics.checkNotNullParameter(approveAASubRequest, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(approveAASubRequest), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<AAAccountInfo>> copydefault(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(j, str), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<AAGasLimit>>> copydefault(@NotNull AAGasLimitReq aAGasLimitReq) {
        Intrinsics.checkNotNullParameter(aAGasLimitReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(aAGasLimitReq), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> AEQbTJ(@NotNull PayMasterSignatureReq payMasterSignatureReq) {
        Intrinsics.checkNotNullParameter(payMasterSignatureReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(payMasterSignatureReq), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> copydefault(@NotNull UOPSignedHashReq uOPSignedHashReq) {
        Intrinsics.checkNotNullParameter(uOPSignedHashReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(uOPSignedHashReq), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> AEQbTJ(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().AEQbTJ(new EVMReadContract(j, str, str2)), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<Unit>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull ApproveAASubRequest approveAASubRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(approveAASubRequest, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().KWHzl(new C13894dbG(str, str2, null, 4, null), approveAASubRequest), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<ContractAddressResp>>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<ContractAddressReq> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(new C13894dbG(str, str2, null, 4, null), list), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<CustomNetwork>>> isConnected() {
        return EZpvd().gEmmrt();
    }

    public final AbstractC58185ywX<ResponseData<CustomNetworkConfig>> values() {
        return C33527myD.KWHzl(InterfaceC13915dbb.Application.getTestNetworksConfig$default(EZpvd(), null, 0, 3, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<SupportedMevNodeBean>>> AkhnZx() {
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().AYXKKw(), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<DAppBTCSignPrompt>> valueOf() {
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(), null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<java.lang.Boolean, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$checkIfTokenIsDynamic$1 walletLoader$checkIfTokenIsDynamic$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$checkIfTokenIsDynamic$1) {
            walletLoader$checkIfTokenIsDynamic$1 = (WalletLoader$checkIfTokenIsDynamic$1) continuation;
            int i = walletLoader$checkIfTokenIsDynamic$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$checkIfTokenIsDynamic$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$checkIfTokenIsDynamic$1 = new WalletLoader$checkIfTokenIsDynamic$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$checkIfTokenIsDynamic$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$checkIfTokenIsDynamic$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$checkIfTokenIsDynamic$2$1 walletLoader$checkIfTokenIsDynamic$2$1 = new WalletLoader$checkIfTokenIsDynamic$2$1(this, str, null);
                walletLoader$checkIfTokenIsDynamic$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$checkIfTokenIsDynamic$2$1, walletLoader$checkIfTokenIsDynamic$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    public final AbstractC58185ywX<ResponseData<java.lang.Boolean>> KWHzl(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(new BTCTooManyTransactionReq(str, j)), null, 1, null));
    }

    public final java.lang.Object OLrzqt(long j, @NotNull Continuation<? super ResponseData<java.util.List<CoinProtocol>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletLoader$getCoinProtocolList$2(this, j, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j, @NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$rebroadcastBTCTransaction$1 walletLoader$rebroadcastBTCTransaction$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$rebroadcastBTCTransaction$1) {
            walletLoader$rebroadcastBTCTransaction$1 = (WalletLoader$rebroadcastBTCTransaction$1) continuation;
            int i = walletLoader$rebroadcastBTCTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$rebroadcastBTCTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$rebroadcastBTCTransaction$1 = new WalletLoader$rebroadcastBTCTransaction$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = walletLoader$rebroadcastBTCTransaction$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$rebroadcastBTCTransaction$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                C13894dbG c13894dbG = new C13894dbG(str2, str, str3);
                CancelRebroadcastBTCTransactionReq cancelRebroadcastBTCTransactionReq = new CancelRebroadcastBTCTransactionReq(str, C56443yFo.KWHzl(j), str4);
                walletLoader$rebroadcastBTCTransaction$1.label = 1;
                objAEQbTJ = interfaceC13915dbbEZpvd.AEQbTJ(c13894dbG, cancelRebroadcastBTCTransactionReq, walletLoader$rebroadcastBTCTransaction$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            responseData = (ResponseData) objAEQbTJ;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j, @NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$cancelBTCTransaction$1 walletLoader$cancelBTCTransaction$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$cancelBTCTransaction$1) {
            walletLoader$cancelBTCTransaction$1 = (WalletLoader$cancelBTCTransaction$1) continuation;
            int i = walletLoader$cancelBTCTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$cancelBTCTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$cancelBTCTransaction$1 = new WalletLoader$cancelBTCTransaction$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = walletLoader$cancelBTCTransaction$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$cancelBTCTransaction$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                C13894dbG c13894dbG = new C13894dbG(str2, str, str3);
                CancelRebroadcastBTCTransactionReq cancelRebroadcastBTCTransactionReq = new CancelRebroadcastBTCTransactionReq(str, C56443yFo.KWHzl(j), str4);
                walletLoader$cancelBTCTransaction$1.label = 1;
                objEZpvd = interfaceC13915dbbEZpvd.EZpvd(c13894dbG, cancelRebroadcastBTCTransactionReq, walletLoader$cancelBTCTransaction$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            responseData = (ResponseData) objEZpvd;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    public final AbstractC58185ywX<ResponseData<DappBTCUTXOResp>> EZpvd(@NotNull DappBtcUtxoFeeReq dappBtcUtxoFeeReq) {
        Intrinsics.checkNotNullParameter(dappBtcUtxoFeeReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(dappBtcUtxoFeeReq), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<Unit>> AEQbTJ(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(EZpvd().KWHzl(new MpcDeriveSync(str, i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AhwBna(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<MpcMaxIndexResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getMpcMaxIndex$1 walletLoader$getMpcMaxIndex$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$getMpcMaxIndex$1) {
            walletLoader$getMpcMaxIndex$1 = (WalletLoader$getMpcMaxIndex$1) continuation;
            int i = walletLoader$getMpcMaxIndex$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getMpcMaxIndex$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getMpcMaxIndex$1 = new WalletLoader$getMpcMaxIndex$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getMpcMaxIndex$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getMpcMaxIndex$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getMpcMaxIndex$2$1 walletLoader$getMpcMaxIndex$2$1 = new WalletLoader$getMpcMaxIndex$2$1(this, str, null);
                walletLoader$getMpcMaxIndex$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getMpcMaxIndex$2$1, walletLoader$getMpcMaxIndex$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC43419rot<DeriveInfoList, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getMpcsMaxIndexs$1 walletLoader$getMpcsMaxIndexs$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$getMpcsMaxIndexs$1) {
            walletLoader$getMpcsMaxIndexs$1 = (WalletLoader$getMpcsMaxIndexs$1) continuation;
            int i = walletLoader$getMpcsMaxIndexs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getMpcsMaxIndexs$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getMpcsMaxIndexs$1 = new WalletLoader$getMpcsMaxIndexs$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getMpcsMaxIndexs$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getMpcsMaxIndexs$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getMpcsMaxIndexs$2$1 walletLoader$getMpcsMaxIndexs$2$1 = new WalletLoader$getMpcsMaxIndexs$2$1(this, list, null);
                walletLoader$getMpcsMaxIndexs$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getMpcsMaxIndexs$2$1, walletLoader$getMpcsMaxIndexs$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.util.List<CheckAaAddressRequest> list, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CheckAaAddressResponse>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$checkAaAddressStatus$1 walletLoader$checkAaAddressStatus$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$checkAaAddressStatus$1) {
            walletLoader$checkAaAddressStatus$1 = (WalletLoader$checkAaAddressStatus$1) continuation;
            int i = walletLoader$checkAaAddressStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$checkAaAddressStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$checkAaAddressStatus$1 = new WalletLoader$checkAaAddressStatus$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = walletLoader$checkAaAddressStatus$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = walletLoader$checkAaAddressStatus$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                walletLoader$checkAaAddressStatus$1.label = 1;
                objCopydefault = interfaceC13915dbbEZpvd.copydefault(list, walletLoader$checkAaAddressStatus$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            responseData = (ResponseData) objCopydefault;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object djBIcL(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChartType>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getChartTypeID$1 walletLoader$getChartTypeID$1;
        if (continuation instanceof WalletLoader$getChartTypeID$1) {
            walletLoader$getChartTypeID$1 = (WalletLoader$getChartTypeID$1) continuation;
            int i = walletLoader$getChartTypeID$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getChartTypeID$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getChartTypeID$1 = new WalletLoader$getChartTypeID$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getChartTypeID$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getChartTypeID$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getChartTypeID$2$1 walletLoader$getChartTypeID$2$1 = new WalletLoader$getChartTypeID$2$1(this, null);
                walletLoader$getChartTypeID$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getChartTypeID$2$1, walletLoader$getChartTypeID$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x00d8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:42:0x002b */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r2v2, r0v3 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.List<java.lang.String> list, int i, @NotNull java.lang.String str4, java.lang.Long l, boolean z, java.lang.Double d, @NotNull java.util.List<java.lang.Long> list2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChartData>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getChartTypeData$1 walletLoader$getChartTypeData$1;
        ?? r3;
        ?? r2;
        java.lang.Object obj;
        java.lang.Object obj2;
        if (continuation instanceof WalletLoader$getChartTypeData$1) {
            walletLoader$getChartTypeData$1 = (WalletLoader$getChartTypeData$1) continuation;
            int i2 = walletLoader$getChartTypeData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletLoader$getChartTypeData$1.label = i2 - Integer.MIN_VALUE;
            } else {
                walletLoader$getChartTypeData$1 = new WalletLoader$getChartTypeData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getChartTypeData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = walletLoader$getChartTypeData$1.label;
        java.lang.Object obj3 = "Error: ";
        ?? r11 = AbstractC43419rot.TAG;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                obj = AbstractC43419rot.TAG;
                boolean z2 = z;
                obj2 = "Error: ";
                java.lang.Double d2 = d;
                try {
                    WalletLoader$getChartTypeData$2$1 walletLoader$getChartTypeData$2$1 = new WalletLoader$getChartTypeData$2$1(this, str, str3, str2, list, str4, i, l, z2, d2, list2, null);
                    walletLoader$getChartTypeData$1.label = 1;
                    objWithContext = BuildersKt.withContext(io2, walletLoader$getChartTypeData$2$1, walletLoader$getChartTypeData$1);
                    r11 = z2;
                    obj3 = d2;
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    r3 = obj;
                    r2 = obj2;
                    ?? sb = new java.lang.StringBuilder();
                    sb.append(r2);
                    sb.append(th);
                    pUU.copydefault((java.lang.String) r3, sb.toString());
                    return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                obj = AbstractC43419rot.TAG;
                obj2 = "Error: ";
                r11 = r11;
                obj3 = obj3;
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            ?? sb2 = new java.lang.StringBuilder();
            r2 = obj2;
            try {
                sb2.append(r2);
                sb2.append(responseData);
                r3 = obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                r3 = obj;
            }
            try {
                pUU.copydefault((java.lang.String) r3, sb2.toString());
                return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            } catch (java.lang.Throwable th3) {
                th = th3;
                ?? sb3 = new java.lang.StringBuilder();
                sb3.append(r2);
                sb3.append(th);
                pUU.copydefault((java.lang.String) r3, sb3.toString());
                return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            r3 = r11;
            r2 = obj3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<VerifyDAppDomainResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$verifyDAppDomain$1 walletLoader$verifyDAppDomain$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$verifyDAppDomain$1) {
            walletLoader$verifyDAppDomain$1 = (WalletLoader$verifyDAppDomain$1) continuation;
            int i = walletLoader$verifyDAppDomain$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$verifyDAppDomain$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$verifyDAppDomain$1 = new WalletLoader$verifyDAppDomain$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$verifyDAppDomain$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$verifyDAppDomain$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$verifyDAppDomain$2$1 walletLoader$verifyDAppDomain$2$1 = new WalletLoader$verifyDAppDomain$2$1(this, str, str2, null);
                walletLoader$verifyDAppDomain$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$verifyDAppDomain$2$1, walletLoader$verifyDAppDomain$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fARcdN(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<VerifyDAppDomainUrlResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$verifyDAppDomainUrl$1 walletLoader$verifyDAppDomainUrl$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$verifyDAppDomainUrl$1) {
            walletLoader$verifyDAppDomainUrl$1 = (WalletLoader$verifyDAppDomainUrl$1) continuation;
            int i = walletLoader$verifyDAppDomainUrl$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$verifyDAppDomainUrl$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$verifyDAppDomainUrl$1 = new WalletLoader$verifyDAppDomainUrl$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$verifyDAppDomainUrl$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$verifyDAppDomainUrl$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$verifyDAppDomainUrl$2$1 walletLoader$verifyDAppDomainUrl$2$1 = new WalletLoader$verifyDAppDomainUrl$2$1(this, str, null);
                walletLoader$verifyDAppDomainUrl$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$verifyDAppDomainUrl$2$1, walletLoader$verifyDAppDomainUrl$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fJNWhG(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<VerifyDAppDomainUrlResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$verifyDAppDomainUrlV2$1 walletLoader$verifyDAppDomainUrlV2$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$verifyDAppDomainUrlV2$1) {
            walletLoader$verifyDAppDomainUrlV2$1 = (WalletLoader$verifyDAppDomainUrlV2$1) continuation;
            int i = walletLoader$verifyDAppDomainUrlV2$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$verifyDAppDomainUrlV2$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$verifyDAppDomainUrlV2$1 = new WalletLoader$verifyDAppDomainUrlV2$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$verifyDAppDomainUrlV2$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$verifyDAppDomainUrlV2$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$verifyDAppDomainUrlV2$2$1 walletLoader$verifyDAppDomainUrlV2$2$1 = new WalletLoader$verifyDAppDomainUrlV2$2$1(this, str, null);
                walletLoader$verifyDAppDomainUrlV2$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$verifyDAppDomainUrlV2$2$1, walletLoader$verifyDAppDomainUrlV2$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<AlertChainIdListResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getAlertChainIdList$1 walletLoader$getAlertChainIdList$1;
        if (continuation instanceof WalletLoader$getAlertChainIdList$1) {
            walletLoader$getAlertChainIdList$1 = (WalletLoader$getAlertChainIdList$1) continuation;
            int i = walletLoader$getAlertChainIdList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getAlertChainIdList$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getAlertChainIdList$1 = new WalletLoader$getAlertChainIdList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getAlertChainIdList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getAlertChainIdList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getAlertChainIdList$2$1 walletLoader$getAlertChainIdList$2$1 = new WalletLoader$getAlertChainIdList$2$1(this, null);
                walletLoader$getAlertChainIdList$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getAlertChainIdList$2$1, walletLoader$getAlertChainIdList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(long j, int i, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC43419rot<CheckBatchChainResp, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$checkBatchCommonChain$1 walletLoader$checkBatchCommonChain$1;
        if (continuation instanceof WalletLoader$checkBatchCommonChain$1) {
            walletLoader$checkBatchCommonChain$1 = (WalletLoader$checkBatchCommonChain$1) continuation;
            int i2 = walletLoader$checkBatchCommonChain$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletLoader$checkBatchCommonChain$1.label = i2 - Integer.MIN_VALUE;
            } else {
                walletLoader$checkBatchCommonChain$1 = new WalletLoader$checkBatchCommonChain$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$checkBatchCommonChain$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = walletLoader$checkBatchCommonChain$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$checkBatchCommonChain$2$1 walletLoader$checkBatchCommonChain$2$1 = new WalletLoader$checkBatchCommonChain$2$1(this, j, i, list, null);
                walletLoader$checkBatchCommonChain$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$checkBatchCommonChain$2$1, walletLoader$checkBatchCommonChain$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    public final AbstractC58185ywX<ResponseData<java.util.Map<java.lang.String, java.lang.String>>> copydefault(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C33527myD.KWHzl(EZpvd().EZpvd(new TxStatusBatchReq(list)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(long j, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<OfflineAssetDetailResp, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getOfflineAssetDetail$1 walletLoader$getOfflineAssetDetail$1;
        if (continuation instanceof WalletLoader$getOfflineAssetDetail$1) {
            walletLoader$getOfflineAssetDetail$1 = (WalletLoader$getOfflineAssetDetail$1) continuation;
            int i = walletLoader$getOfflineAssetDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getOfflineAssetDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getOfflineAssetDetail$1 = new WalletLoader$getOfflineAssetDetail$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getOfflineAssetDetail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getOfflineAssetDetail$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getOfflineAssetDetail$2$1 walletLoader$getOfflineAssetDetail$2$1 = new WalletLoader$getOfflineAssetDetail$2$1(this, j, str, null);
                walletLoader$getOfflineAssetDetail$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getOfflineAssetDetail$2$1, walletLoader$getOfflineAssetDetail$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AhwBna(@NotNull Continuation<? super AbstractC43419rot<WalletHotSearchResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getHotSearch$1 walletLoader$getHotSearch$1;
        if (continuation instanceof WalletLoader$getHotSearch$1) {
            walletLoader$getHotSearch$1 = (WalletLoader$getHotSearch$1) continuation;
            int i = walletLoader$getHotSearch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getHotSearch$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getHotSearch$1 = new WalletLoader$getHotSearch$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getHotSearch$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getHotSearch$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getHotSearch$2$1 walletLoader$getHotSearch$2$1 = new WalletLoader$getHotSearch$2$1(this, null);
                walletLoader$getHotSearch$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getHotSearch$2$1, walletLoader$getHotSearch$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.Long l, @NotNull java.util.List<java.lang.String> list, @NotNull DiscoverSearchParam discoverSearchParam, @NotNull Continuation<? super AbstractC43419rot<WalletSearchResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getSearchResult$1 walletLoader$getSearchResult$1;
        if (continuation instanceof WalletLoader$getSearchResult$1) {
            walletLoader$getSearchResult$1 = (WalletLoader$getSearchResult$1) continuation;
            int i = walletLoader$getSearchResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getSearchResult$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getSearchResult$1 = new WalletLoader$getSearchResult$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getSearchResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getSearchResult$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getSearchResult$2$1 walletLoader$getSearchResult$2$1 = new WalletLoader$getSearchResult$2$1(this, str, l, list, discoverSearchParam, null);
                walletLoader$getSearchResult$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getSearchResult$2$1, walletLoader$getSearchResult$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<SearchRecommendResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getSearchRecommendResult$1 walletLoader$getSearchRecommendResult$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$getSearchRecommendResult$1) {
            walletLoader$getSearchRecommendResult$1 = (WalletLoader$getSearchRecommendResult$1) continuation;
            int i = walletLoader$getSearchRecommendResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getSearchRecommendResult$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getSearchRecommendResult$1 = new WalletLoader$getSearchRecommendResult$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getSearchRecommendResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getSearchRecommendResult$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getSearchRecommendResult$2$1 walletLoader$getSearchRecommendResult$2$1 = new WalletLoader$getSearchRecommendResult$2$1(this, str, str2, null);
                walletLoader$getSearchRecommendResult$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getSearchRecommendResult$2$1, walletLoader$getSearchRecommendResult$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AkhnZx(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<MarketChainBean>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getMarketChainList$1 walletLoader$getMarketChainList$1;
        if (continuation instanceof WalletLoader$getMarketChainList$1) {
            walletLoader$getMarketChainList$1 = (WalletLoader$getMarketChainList$1) continuation;
            int i = walletLoader$getMarketChainList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getMarketChainList$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getMarketChainList$1 = new WalletLoader$getMarketChainList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getMarketChainList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getMarketChainList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getMarketChainList$2$1 walletLoader$getMarketChainList$2$1 = new WalletLoader$getMarketChainList$2$1(this, null);
                walletLoader$getMarketChainList$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getMarketChainList$2$1, walletLoader$getMarketChainList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AYXKKw(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<SearchAddressResponse>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getSearchAddressProfile$1 walletLoader$getSearchAddressProfile$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$getSearchAddressProfile$1) {
            walletLoader$getSearchAddressProfile$1 = (WalletLoader$getSearchAddressProfile$1) continuation;
            int i = walletLoader$getSearchAddressProfile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getSearchAddressProfile$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getSearchAddressProfile$1 = new WalletLoader$getSearchAddressProfile$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getSearchAddressProfile$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getSearchAddressProfile$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getSearchAddressProfile$2$1 walletLoader$getSearchAddressProfile$2$1 = new WalletLoader$getSearchAddressProfile$2$1(this, str, null);
                walletLoader$getSearchAddressProfile$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getSearchAddressProfile$2$1, walletLoader$getSearchAddressProfile$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, java.util.List<java.lang.Long> list, boolean z, boolean z2, int i, int i2, @NotNull Continuation<? super AbstractC43419rot<AddressAllAssetResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getAddressAssetAllInformation$1 walletLoader$getAddressAssetAllInformation$1;
        if (continuation instanceof WalletLoader$getAddressAssetAllInformation$1) {
            walletLoader$getAddressAssetAllInformation$1 = (WalletLoader$getAddressAssetAllInformation$1) continuation;
            int i3 = walletLoader$getAddressAssetAllInformation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                walletLoader$getAddressAssetAllInformation$1.label = i3 - Integer.MIN_VALUE;
            } else {
                walletLoader$getAddressAssetAllInformation$1 = new WalletLoader$getAddressAssetAllInformation$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getAddressAssetAllInformation$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = walletLoader$getAddressAssetAllInformation$1.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getAddressAssetAllInformation$2$1 walletLoader$getAddressAssetAllInformation$2$1 = new WalletLoader$getAddressAssetAllInformation$2$1(this, str, list, z, z2, i, i2, null);
                walletLoader$getAddressAssetAllInformation$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getAddressAssetAllInformation$2$1, walletLoader$getAddressAssetAllInformation$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i4 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, @NotNull Continuation<? super AbstractC43419rot<AddressCoinHistoryResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getAddressCoinHistory$1 walletLoader$getAddressCoinHistory$1;
        if (continuation instanceof WalletLoader$getAddressCoinHistory$1) {
            walletLoader$getAddressCoinHistory$1 = (WalletLoader$getAddressCoinHistory$1) continuation;
            int i2 = walletLoader$getAddressCoinHistory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletLoader$getAddressCoinHistory$1.label = i2 - Integer.MIN_VALUE;
            } else {
                walletLoader$getAddressCoinHistory$1 = new WalletLoader$getAddressCoinHistory$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getAddressCoinHistory$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = walletLoader$getAddressCoinHistory$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getAddressCoinHistory$2$1 walletLoader$getAddressCoinHistory$2$1 = new WalletLoader$getAddressCoinHistory$2$1(this, str, j, str2, str3, i, null);
                walletLoader$getAddressCoinHistory$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getAddressCoinHistory$2$1, walletLoader$getAddressCoinHistory$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Long l, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<AddressTokenAsset, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getAddressCoinAssetInformation$1 walletLoader$getAddressCoinAssetInformation$1;
        if (continuation instanceof WalletLoader$getAddressCoinAssetInformation$1) {
            walletLoader$getAddressCoinAssetInformation$1 = (WalletLoader$getAddressCoinAssetInformation$1) continuation;
            int i = walletLoader$getAddressCoinAssetInformation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getAddressCoinAssetInformation$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getAddressCoinAssetInformation$1 = new WalletLoader$getAddressCoinAssetInformation$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getAddressCoinAssetInformation$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getAddressCoinAssetInformation$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getAddressCoinAssetInformation$2$1 walletLoader$getAddressCoinAssetInformation$2$1 = new WalletLoader$getAddressCoinAssetInformation$2$1(this, str, str2, l, str3, null);
                walletLoader$getAddressCoinAssetInformation$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getAddressCoinAssetInformation$2$1, walletLoader$getAddressCoinAssetInformation$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(long j, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<CoinInfoBean, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getAddressCoinInformation$1 walletLoader$getAddressCoinInformation$1;
        if (continuation instanceof WalletLoader$getAddressCoinInformation$1) {
            walletLoader$getAddressCoinInformation$1 = (WalletLoader$getAddressCoinInformation$1) continuation;
            int i = walletLoader$getAddressCoinInformation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getAddressCoinInformation$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getAddressCoinInformation$1 = new WalletLoader$getAddressCoinInformation$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getAddressCoinInformation$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getAddressCoinInformation$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getAddressCoinInformation$2$1 walletLoader$getAddressCoinInformation$2$1 = new WalletLoader$getAddressCoinInformation$2$1(this, j, str, null);
                walletLoader$getAddressCoinInformation$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getAddressCoinInformation$2$1, walletLoader$getAddressCoinInformation$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0) {
                return new AbstractC43419rot.StateListAnimator(responseData.getData());
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, long j, int i, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<AddressTxHistoryDetail, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getAddressTxInformation$1 walletLoader$getAddressTxInformation$1;
        if (continuation instanceof WalletLoader$getAddressTxInformation$1) {
            walletLoader$getAddressTxInformation$1 = (WalletLoader$getAddressTxInformation$1) continuation;
            int i2 = walletLoader$getAddressTxInformation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletLoader$getAddressTxInformation$1.label = i2 - Integer.MIN_VALUE;
            } else {
                walletLoader$getAddressTxInformation$1 = new WalletLoader$getAddressTxInformation$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getAddressTxInformation$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = walletLoader$getAddressTxInformation$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getAddressTxInformation$2$1 walletLoader$getAddressTxInformation$2$1 = new WalletLoader$getAddressTxInformation$2$1(this, str, j, i, str2, null);
                walletLoader$getAddressTxInformation$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getAddressTxInformation$2$1, walletLoader$getAddressTxInformation$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fARcdN(@NotNull Continuation<? super AbstractC43419rot<TxTypes, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getTradeTypes$1 walletLoader$getTradeTypes$1;
        if (continuation instanceof WalletLoader$getTradeTypes$1) {
            walletLoader$getTradeTypes$1 = (WalletLoader$getTradeTypes$1) continuation;
            int i = walletLoader$getTradeTypes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getTradeTypes$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getTradeTypes$1 = new WalletLoader$getTradeTypes$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getTradeTypes$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getTradeTypes$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getTradeTypes$2$1 walletLoader$getTradeTypes$2$1 = new WalletLoader$getTradeTypes$2$1(this, null);
                walletLoader$getTradeTypes$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getTradeTypes$2$1, walletLoader$getTradeTypes$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    public final AbstractC58185ywX<ResponseData<java.lang.Object>> AEQbTJ() {
        return C13933dbt.okServerExceptionFilter$default(EZpvd().AEQbTJ(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.Long l, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<WalletPnlAnalysisResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getWalletPnlAnalysis$1 walletLoader$getWalletPnlAnalysis$1;
        if (continuation instanceof WalletLoader$getWalletPnlAnalysis$1) {
            walletLoader$getWalletPnlAnalysis$1 = (WalletLoader$getWalletPnlAnalysis$1) continuation;
            int i = walletLoader$getWalletPnlAnalysis$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getWalletPnlAnalysis$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getWalletPnlAnalysis$1 = new WalletLoader$getWalletPnlAnalysis$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getWalletPnlAnalysis$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getWalletPnlAnalysis$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getWalletPnlAnalysis$2$1 walletLoader$getWalletPnlAnalysis$2$1 = new WalletLoader$getWalletPnlAnalysis$2$1(this, str, str2, l, str3, null);
                walletLoader$getWalletPnlAnalysis$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getWalletPnlAnalysis$2$1, walletLoader$getWalletPnlAnalysis$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, java.lang.Long l, int i, boolean z, int i2, int i3, @NotNull Continuation<? super AbstractC43419rot<WalletPnlTokenListResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getWalletAccountPnlTokenList$1 walletLoader$getWalletAccountPnlTokenList$1;
        if (continuation instanceof WalletLoader$getWalletAccountPnlTokenList$1) {
            walletLoader$getWalletAccountPnlTokenList$1 = (WalletLoader$getWalletAccountPnlTokenList$1) continuation;
            int i4 = walletLoader$getWalletAccountPnlTokenList$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                walletLoader$getWalletAccountPnlTokenList$1.label = i4 - Integer.MIN_VALUE;
            } else {
                walletLoader$getWalletAccountPnlTokenList$1 = new WalletLoader$getWalletAccountPnlTokenList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getWalletAccountPnlTokenList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = walletLoader$getWalletAccountPnlTokenList$1.label;
        try {
            if (i5 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getWalletAccountPnlTokenList$2$1 walletLoader$getWalletAccountPnlTokenList$2$1 = new WalletLoader$getWalletAccountPnlTokenList$2$1(this, str, l, i, z, i2, i3, null);
                walletLoader$getWalletAccountPnlTokenList$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getWalletAccountPnlTokenList$2$1, walletLoader$getWalletAccountPnlTokenList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i5 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, java.lang.Long l, int i, boolean z, int i2, int i3, boolean z2, @NotNull Continuation<? super AbstractC43419rot<WalletPnlTokenListResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getWalletAddressPnlTokenList$1 walletLoader$getWalletAddressPnlTokenList$1;
        java.lang.String str2;
        java.lang.String str3;
        if (continuation instanceof WalletLoader$getWalletAddressPnlTokenList$1) {
            walletLoader$getWalletAddressPnlTokenList$1 = (WalletLoader$getWalletAddressPnlTokenList$1) continuation;
            int i4 = walletLoader$getWalletAddressPnlTokenList$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                walletLoader$getWalletAddressPnlTokenList$1.label = i4 - Integer.MIN_VALUE;
            } else {
                walletLoader$getWalletAddressPnlTokenList$1 = new WalletLoader$getWalletAddressPnlTokenList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getWalletAddressPnlTokenList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = walletLoader$getWalletAddressPnlTokenList$1.label;
        java.lang.String str4 = AbstractC43419rot.TAG;
        try {
            if (i5 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                str3 = AbstractC43419rot.TAG;
                str4 = null;
                try {
                    WalletLoader$getWalletAddressPnlTokenList$2$1 walletLoader$getWalletAddressPnlTokenList$2$1 = new WalletLoader$getWalletAddressPnlTokenList$2$1(this, str, l, i, z, i2, i3, z2, null);
                    walletLoader$getWalletAddressPnlTokenList$1.label = 1;
                    objWithContext = BuildersKt.withContext(io2, walletLoader$getWalletAddressPnlTokenList$2$1, walletLoader$getWalletAddressPnlTokenList$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    str2 = str3;
                    pUU.copydefault(str2, "Error: " + th);
                    return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } else {
                if (i5 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                str3 = AbstractC43419rot.TAG;
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            str2 = str3;
            try {
                pUU.copydefault(str2, "Error: " + responseData);
                return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            } catch (java.lang.Throwable th2) {
                th = th2;
                pUU.copydefault(str2, "Error: " + th);
                return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            str2 = str4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fJNWhG(@NotNull Continuation<? super AbstractC43419rot<WalletSupportPnlChainListResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getWalletPnlSupportChainList$1 walletLoader$getWalletPnlSupportChainList$1;
        if (continuation instanceof WalletLoader$getWalletPnlSupportChainList$1) {
            walletLoader$getWalletPnlSupportChainList$1 = (WalletLoader$getWalletPnlSupportChainList$1) continuation;
            int i = walletLoader$getWalletPnlSupportChainList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getWalletPnlSupportChainList$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getWalletPnlSupportChainList$1 = new WalletLoader$getWalletPnlSupportChainList$1(this, continuation);
            }
        }
        java.lang.Object objValueOf = walletLoader$getWalletPnlSupportChainList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getWalletPnlSupportChainList$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objValueOf);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                walletLoader$getWalletPnlSupportChainList$1.label = 1;
                objValueOf = interfaceC13915dbbEZpvd.valueOf(walletLoader$getWalletPnlSupportChainList$1);
                if (objValueOf == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objValueOf);
            }
            ResponseData responseData = (ResponseData) objValueOf;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43419rot<CheckCreateAvailableResp, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$checkCreateAvailable$1 walletLoader$checkCreateAvailable$1;
        if (continuation instanceof WalletLoader$checkCreateAvailable$1) {
            walletLoader$checkCreateAvailable$1 = (WalletLoader$checkCreateAvailable$1) continuation;
            int i = walletLoader$checkCreateAvailable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$checkCreateAvailable$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$checkCreateAvailable$1 = new WalletLoader$checkCreateAvailable$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$checkCreateAvailable$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$checkCreateAvailable$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$checkCreateAvailable$2$1 walletLoader$checkCreateAvailable$2$1 = new WalletLoader$checkCreateAvailable$2$1(this, null);
                walletLoader$checkCreateAvailable$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$checkCreateAvailable$2$1, walletLoader$checkCreateAvailable$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(long j, @NotNull java.lang.String str, int i, @NotNull Continuation<? super AbstractC43419rot<java.lang.Integer, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$checkCreateAddressAvailable$1 walletLoader$checkCreateAddressAvailable$1;
        if (continuation instanceof WalletLoader$checkCreateAddressAvailable$1) {
            walletLoader$checkCreateAddressAvailable$1 = (WalletLoader$checkCreateAddressAvailable$1) continuation;
            int i2 = walletLoader$checkCreateAddressAvailable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletLoader$checkCreateAddressAvailable$1.label = i2 - Integer.MIN_VALUE;
            } else {
                walletLoader$checkCreateAddressAvailable$1 = new WalletLoader$checkCreateAddressAvailable$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$checkCreateAddressAvailable$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = walletLoader$checkCreateAddressAvailable$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$checkCreateAddressAvailable$2$1 walletLoader$checkCreateAddressAvailable$2$1 = new WalletLoader$checkCreateAddressAvailable$2$1(this, j, str, i, null);
                walletLoader$checkCreateAddressAvailable$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$checkCreateAddressAvailable$2$1, walletLoader$checkCreateAddressAvailable$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    public final AbstractC58185ywX<ResponseData<MainChainBalanceResp>> AEQbTJ(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(EZpvd().EZpvd(str, j));
    }

    public final AbstractC58185ywX<ResponseData<FromAddressCheckRes>> copydefault(@NotNull FromAddressCheckReq fromAddressCheckReq) {
        Intrinsics.checkNotNullParameter(fromAddressCheckReq, "");
        return C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.checkFromAddress$default(EZpvd(), fromAddressCheckReq, null, 2, null), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AYXKKw(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TagMetaData>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getAllTagMeta$1 walletLoader$getAllTagMeta$1;
        if (continuation instanceof WalletLoader$getAllTagMeta$1) {
            walletLoader$getAllTagMeta$1 = (WalletLoader$getAllTagMeta$1) continuation;
            int i = walletLoader$getAllTagMeta$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getAllTagMeta$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getAllTagMeta$1 = new WalletLoader$getAllTagMeta$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getAllTagMeta$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getAllTagMeta$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getAllTagMeta$2$1 walletLoader$getAllTagMeta$2$1 = new WalletLoader$getAllTagMeta$2$1(this, null);
                walletLoader$getAllTagMeta$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getAllTagMeta$2$1, walletLoader$getAllTagMeta$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<EIP7702WalletStatusResp>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getEIP7702WalletStatus$1 walletLoader$getEIP7702WalletStatus$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$getEIP7702WalletStatus$1) {
            walletLoader$getEIP7702WalletStatus$1 = (WalletLoader$getEIP7702WalletStatus$1) continuation;
            int i = walletLoader$getEIP7702WalletStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getEIP7702WalletStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getEIP7702WalletStatus$1 = new WalletLoader$getEIP7702WalletStatus$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getEIP7702WalletStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getEIP7702WalletStatus$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getEIP7702WalletStatus$2$1 walletLoader$getEIP7702WalletStatus$2$1 = new WalletLoader$getEIP7702WalletStatus$2$1(this, list, null);
                walletLoader$getEIP7702WalletStatus$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getEIP7702WalletStatus$2$1, walletLoader$getEIP7702WalletStatus$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object gEmmrt(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<EIP7702ChainStatusResp, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getEIP7702ChainStatus$1 walletLoader$getEIP7702ChainStatus$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$getEIP7702ChainStatus$1) {
            walletLoader$getEIP7702ChainStatus$1 = (WalletLoader$getEIP7702ChainStatus$1) continuation;
            int i = walletLoader$getEIP7702ChainStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getEIP7702ChainStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getEIP7702ChainStatus$1 = new WalletLoader$getEIP7702ChainStatus$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getEIP7702ChainStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getEIP7702ChainStatus$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getEIP7702ChainStatus$2$1 walletLoader$getEIP7702ChainStatus$2$1 = new WalletLoader$getEIP7702ChainStatus$2$1(this, str, null);
                walletLoader$getEIP7702ChainStatus$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getEIP7702ChainStatus$2$1, walletLoader$getEIP7702ChainStatus$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    public static /* synthetic */ java.lang.Object hasUtxo$default(C13934dbu c13934dbu, java.lang.String str, long j, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return c13934dbu.OLrzqt(str, j, (Continuation<? super java.lang.Boolean>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, long j, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        WalletLoader$hasUtxo$1 walletLoader$hasUtxo$1;
        UtxoResponseItem utxoResponseItem;
        if (continuation instanceof WalletLoader$hasUtxo$1) {
            walletLoader$hasUtxo$1 = (WalletLoader$hasUtxo$1) continuation;
            int i = walletLoader$hasUtxo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$hasUtxo$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$hasUtxo$1 = new WalletLoader$hasUtxo$1(this, continuation);
            }
        }
        WalletLoader$hasUtxo$1 walletLoader$hasUtxo$12 = walletLoader$hasUtxo$1;
        java.lang.Object objAEQbTJ = walletLoader$hasUtxo$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$hasUtxo$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            C10854bwM c10854bwMOLrzqt = C10954byG.EZpvd.valueOf().copydefault(j);
            long jAhwBna = c10854bwMOLrzqt != null ? c10854bwMOLrzqt.AhwBna() : 0L;
            walletLoader$hasUtxo$12.label = 1;
            objAEQbTJ = AEQbTJ(jAhwBna, 12, str, (java.lang.Integer) null, (java.lang.Integer) null, walletLoader$hasUtxo$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        java.util.List list = (java.util.List) ((AbstractC43419rot) objAEQbTJ).copydefault();
        UtxoByType utxoByTypeOLrzqt = (list == null || (utxoResponseItem = (UtxoResponseItem) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : utxoResponseItem.OLrzqt();
        return C56443yFo.KWHzl(C33129mqd.KWHzl((java.util.Collection) (utxoByTypeOLrzqt != null ? utxoByTypeOLrzqt.AEQbTJ() : null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(long j, int i, @NotNull java.lang.String str, java.lang.Integer num, java.lang.Integer num2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<UtxoResponseItem>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getUtxoByType$1 walletLoader$getUtxoByType$1;
        if (continuation instanceof WalletLoader$getUtxoByType$1) {
            walletLoader$getUtxoByType$1 = (WalletLoader$getUtxoByType$1) continuation;
            int i2 = walletLoader$getUtxoByType$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletLoader$getUtxoByType$1.label = i2 - Integer.MIN_VALUE;
            } else {
                walletLoader$getUtxoByType$1 = new WalletLoader$getUtxoByType$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getUtxoByType$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = walletLoader$getUtxoByType$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                UtxoRequestBody utxoRequestBody = new UtxoRequestBody(j, C56402yEa.EZpvd(new UtxoRequestItem(str, num, num2, C56443yFo.AEQbTJ(i))));
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getUtxoByType$2$1 walletLoader$getUtxoByType$2$1 = new WalletLoader$getUtxoByType$2$1(this, utxoRequestBody, null);
                walletLoader$getUtxoByType$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getUtxoByType$2$1, walletLoader$getUtxoByType$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.util.List<UtxoItemIdentity> list, int i, long j, @NotNull Continuation<? super AbstractC43419rot<UtxoStatusUpdateResponseItem, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$updateUtxoStatus$1 walletLoader$updateUtxoStatus$1;
        if (continuation instanceof WalletLoader$updateUtxoStatus$1) {
            walletLoader$updateUtxoStatus$1 = (WalletLoader$updateUtxoStatus$1) continuation;
            int i2 = walletLoader$updateUtxoStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletLoader$updateUtxoStatus$1.label = i2 - Integer.MIN_VALUE;
            } else {
                walletLoader$updateUtxoStatus$1 = new WalletLoader$updateUtxoStatus$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$updateUtxoStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = walletLoader$updateUtxoStatus$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                UtxoStatusUpdateRequestBody utxoStatusUpdateRequestBody = new UtxoStatusUpdateRequestBody(list, str4, i, j);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$updateUtxoStatus$2$1 walletLoader$updateUtxoStatus$2$1 = new WalletLoader$updateUtxoStatus$2$1(this, str2, str, str3, utxoStatusUpdateRequestBody, null);
                walletLoader$updateUtxoStatus$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$updateUtxoStatus$2$1, walletLoader$updateUtxoStatus$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, int i, long j, int i2, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<AssetsUnderUtxo, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getAssetsUnderUtxo$1 walletLoader$getAssetsUnderUtxo$1;
        if (continuation instanceof WalletLoader$getAssetsUnderUtxo$1) {
            walletLoader$getAssetsUnderUtxo$1 = (WalletLoader$getAssetsUnderUtxo$1) continuation;
            int i3 = walletLoader$getAssetsUnderUtxo$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                walletLoader$getAssetsUnderUtxo$1.label = i3 - Integer.MIN_VALUE;
            } else {
                walletLoader$getAssetsUnderUtxo$1 = new WalletLoader$getAssetsUnderUtxo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getAssetsUnderUtxo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = walletLoader$getAssetsUnderUtxo$1.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                UtxoAssetsRequestBody utxoAssetsRequestBody = new UtxoAssetsRequestBody(str, i, j, i2, str2);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getAssetsUnderUtxo$2$1 walletLoader$getAssetsUnderUtxo$2$1 = new WalletLoader$getAssetsUnderUtxo$2$1(this, utxoAssetsRequestBody, null);
                walletLoader$getAssetsUnderUtxo$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getAssetsUnderUtxo$2$1, walletLoader$getAssetsUnderUtxo$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i4 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull UtxoConfirmationRequest utxoConfirmationRequest, @NotNull Continuation<? super AbstractC43419rot<UtxoConfirmationResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$utxoDoubleCheck$1 walletLoader$utxoDoubleCheck$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$utxoDoubleCheck$1) {
            walletLoader$utxoDoubleCheck$1 = (WalletLoader$utxoDoubleCheck$1) continuation;
            int i = walletLoader$utxoDoubleCheck$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$utxoDoubleCheck$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$utxoDoubleCheck$1 = new WalletLoader$utxoDoubleCheck$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$utxoDoubleCheck$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$utxoDoubleCheck$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$utxoDoubleCheck$2$1 walletLoader$utxoDoubleCheck$2$1 = new WalletLoader$utxoDoubleCheck$2$1(this, utxoConfirmationRequest, null);
                walletLoader$utxoDoubleCheck$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$utxoDoubleCheck$2$1, walletLoader$utxoDoubleCheck$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<WalletPnlShareInfoResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getTokenShareInfo$1 walletLoader$getTokenShareInfo$1;
        if (continuation instanceof WalletLoader$getTokenShareInfo$1) {
            walletLoader$getTokenShareInfo$1 = (WalletLoader$getTokenShareInfo$1) continuation;
            int i = walletLoader$getTokenShareInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getTokenShareInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getTokenShareInfo$1 = new WalletLoader$getTokenShareInfo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getTokenShareInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getTokenShareInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getTokenShareInfo$2$1 walletLoader$getTokenShareInfo$2$1 = new WalletLoader$getTokenShareInfo$2$1(this, str, str2, str3, str4, null);
                walletLoader$getTokenShareInfo$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getTokenShareInfo$2$1, walletLoader$getTokenShareInfo$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    public final AbstractC58185ywX<JsonObject> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        return C33527myD.KWHzl(InterfaceC13915dbb.Application.getRequest$default(EZpvd(), new C13894dbG(str, str2, null, 4, null), str3, map, null, 8, null));
    }

    public final AbstractC58185ywX<JsonObject> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String string = new JSONObject(map).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return C33527myD.KWHzl(InterfaceC13915dbb.Application.postRequest$default(EZpvd(), new C13894dbG(str, str2, null, 4, null), str3, Json.Default.parseToJsonElement(string), null, 8, null));
    }

    public final AbstractC58185ywX<ResponseData<WalletCoinLatestPnlResponse>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().EZpvd(str, str2, str3), null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<WalletCoinLatestPnlResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getCoinLatestPnlSuspend$1 walletLoader$getCoinLatestPnlSuspend$1;
        if (continuation instanceof WalletLoader$getCoinLatestPnlSuspend$1) {
            walletLoader$getCoinLatestPnlSuspend$1 = (WalletLoader$getCoinLatestPnlSuspend$1) continuation;
            int i = walletLoader$getCoinLatestPnlSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getCoinLatestPnlSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getCoinLatestPnlSuspend$1 = new WalletLoader$getCoinLatestPnlSuspend$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getCoinLatestPnlSuspend$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getCoinLatestPnlSuspend$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getCoinLatestPnlSuspend$2$1 walletLoader$getCoinLatestPnlSuspend$2$1 = new WalletLoader$getCoinLatestPnlSuspend$2$1(this, str, str2, str3, null);
                walletLoader$getCoinLatestPnlSuspend$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getCoinLatestPnlSuspend$2$1, walletLoader$getCoinLatestPnlSuspend$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<WalletCeFiBindQrResponse, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getCefiBindQrData$1 walletLoader$getCefiBindQrData$1;
        if (continuation instanceof WalletLoader$getCefiBindQrData$1) {
            walletLoader$getCefiBindQrData$1 = (WalletLoader$getCefiBindQrData$1) continuation;
            int i = walletLoader$getCefiBindQrData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getCefiBindQrData$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getCefiBindQrData$1 = new WalletLoader$getCefiBindQrData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getCefiBindQrData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getCefiBindQrData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getCefiBindQrData$2$1 walletLoader$getCefiBindQrData$2$1 = new WalletLoader$getCefiBindQrData$2$1(this, str, str2, str3, null);
                walletLoader$getCefiBindQrData$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getCefiBindQrData$2$1, walletLoader$getCefiBindQrData$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull Continuation<? super AbstractC43419rot<? extends java.lang.Object, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$syncCefiBindStatus$1 walletLoader$syncCefiBindStatus$1;
        if (continuation instanceof WalletLoader$syncCefiBindStatus$1) {
            walletLoader$syncCefiBindStatus$1 = (WalletLoader$syncCefiBindStatus$1) continuation;
            int i = walletLoader$syncCefiBindStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$syncCefiBindStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$syncCefiBindStatus$1 = new WalletLoader$syncCefiBindStatus$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$syncCefiBindStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$syncCefiBindStatus$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$syncCefiBindStatus$2$1 walletLoader$syncCefiBindStatus$2$1 = new WalletLoader$syncCefiBindStatus$2$1(this, str2, str, str3, str4, str5, str6, null);
                walletLoader$syncCefiBindStatus$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$syncCefiBindStatus$2$1, walletLoader$syncCefiBindStatus$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object values(@NotNull Continuation<? super AbstractC43419rot<TeeMetadata, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getTeeMetadata$1 walletLoader$getTeeMetadata$1;
        if (continuation instanceof WalletLoader$getTeeMetadata$1) {
            walletLoader$getTeeMetadata$1 = (WalletLoader$getTeeMetadata$1) continuation;
            int i = walletLoader$getTeeMetadata$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getTeeMetadata$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getTeeMetadata$1 = new WalletLoader$getTeeMetadata$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getTeeMetadata$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getTeeMetadata$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getTeeMetadata$2$1 walletLoader$getTeeMetadata$2$1 = new WalletLoader$getTeeMetadata$2$1(this, null);
                walletLoader$getTeeMetadata$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getTeeMetadata$2$1, walletLoader$getTeeMetadata$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    public static /* synthetic */ java.lang.Object getTeeAnd7702WalletsStatus$default(C13934dbu c13934dbu, java.util.List list, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c13934dbu.copydefault((java.util.List<TeeAndEip7702Item>) list, z, (Continuation<? super AbstractC43419rot<TeeAnd7702WalletStatusResp, OKServerException>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.util.List<TeeAndEip7702Item> list, boolean z, @NotNull Continuation<? super AbstractC43419rot<TeeAnd7702WalletStatusResp, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getTeeAnd7702WalletsStatus$1 walletLoader$getTeeAnd7702WalletsStatus$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$getTeeAnd7702WalletsStatus$1) {
            walletLoader$getTeeAnd7702WalletsStatus$1 = (WalletLoader$getTeeAnd7702WalletsStatus$1) continuation;
            int i = walletLoader$getTeeAnd7702WalletsStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getTeeAnd7702WalletsStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getTeeAnd7702WalletsStatus$1 = new WalletLoader$getTeeAnd7702WalletsStatus$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getTeeAnd7702WalletsStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getTeeAnd7702WalletsStatus$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getTeeAnd7702WalletsStatus$2$1 walletLoader$getTeeAnd7702WalletsStatus$2$1 = new WalletLoader$getTeeAnd7702WalletsStatus$2$1(this, z, list, null);
                walletLoader$getTeeAnd7702WalletsStatus$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getTeeAnd7702WalletsStatus$2$1, walletLoader$getTeeAnd7702WalletsStatus$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, @NotNull Continuation<? super AbstractC43419rot<SingleTeeStatus, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getTeeWalletsStatus$1 walletLoader$getTeeWalletsStatus$1;
        if (continuation instanceof WalletLoader$getTeeWalletsStatus$1) {
            walletLoader$getTeeWalletsStatus$1 = (WalletLoader$getTeeWalletsStatus$1) continuation;
            int i = walletLoader$getTeeWalletsStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getTeeWalletsStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getTeeWalletsStatus$1 = new WalletLoader$getTeeWalletsStatus$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getTeeWalletsStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getTeeWalletsStatus$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getTeeWalletsStatus$2$1 walletLoader$getTeeWalletsStatus$2$1 = new WalletLoader$getTeeWalletsStatus$2$1(this, str2, str, z, z2, null);
                walletLoader$getTeeWalletsStatus$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getTeeWalletsStatus$2$1, walletLoader$getTeeWalletsStatus$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object valueOf(@NotNull java.lang.String str, @NotNull Continuation<? super Result<AttestationFileResult>> continuation) throws java.lang.Throwable {
        WalletLoader$getAttestationFile$1 walletLoader$getAttestationFile$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$getAttestationFile$1) {
            walletLoader$getAttestationFile$1 = (WalletLoader$getAttestationFile$1) continuation;
            int i = walletLoader$getAttestationFile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getAttestationFile$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getAttestationFile$1 = new WalletLoader$getAttestationFile$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = walletLoader$getAttestationFile$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getAttestationFile$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                FrontendPubkeyVersionRequest frontendPubkeyVersionRequest = new FrontendPubkeyVersionRequest(str);
                walletLoader$getAttestationFile$1.label = 1;
                objAEQbTJ = interfaceC13915dbbEZpvd.AEQbTJ(frontendPubkeyVersionRequest, walletLoader$getAttestationFile$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            responseData = (ResponseData) objAEQbTJ;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull ActivateTEERequest activateTEERequest, @NotNull Continuation<? super Result<ActivateTEEResult>> continuation) throws java.lang.Throwable {
        WalletLoader$activateTee$1 walletLoader$activateTee$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof WalletLoader$activateTee$1) {
            walletLoader$activateTee$1 = (WalletLoader$activateTee$1) continuation;
            int i = walletLoader$activateTee$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$activateTee$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$activateTee$1 = new WalletLoader$activateTee$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = walletLoader$activateTee$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$activateTee$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                C13894dbG c13894dbG = new C13894dbG(str, str2, str3);
                walletLoader$activateTee$1.label = 1;
                objEZpvd = interfaceC13915dbbEZpvd.EZpvd(c13894dbG, activateTEERequest, walletLoader$activateTee$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            ResponseData responseData = (ResponseData) objEZpvd;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull TeeBatchAuthorizeReqData teeBatchAuthorizeReqData, @NotNull Continuation<? super Result<UpgradeTeeResult>> continuation) throws java.lang.Throwable {
        WalletLoader$batchUpgradeTee$1 walletLoader$batchUpgradeTee$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof WalletLoader$batchUpgradeTee$1) {
            walletLoader$batchUpgradeTee$1 = (WalletLoader$batchUpgradeTee$1) continuation;
            int i = walletLoader$batchUpgradeTee$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$batchUpgradeTee$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$batchUpgradeTee$1 = new WalletLoader$batchUpgradeTee$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = walletLoader$batchUpgradeTee$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$batchUpgradeTee$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                C13894dbG c13894dbG = new C13894dbG(str, str2, str3);
                walletLoader$batchUpgradeTee$1.label = 1;
                objEZpvd = interfaceC13915dbbEZpvd.EZpvd(c13894dbG, teeBatchAuthorizeReqData, walletLoader$batchUpgradeTee$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            ResponseData responseData = (ResponseData) objEZpvd;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull ExtendTeeReqData extendTeeReqData, @NotNull Continuation<? super Result<ExtendTeeResult>> continuation) throws java.lang.Throwable {
        WalletLoader$batchExtendTee$1 walletLoader$batchExtendTee$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof WalletLoader$batchExtendTee$1) {
            walletLoader$batchExtendTee$1 = (WalletLoader$batchExtendTee$1) continuation;
            int i = walletLoader$batchExtendTee$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$batchExtendTee$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$batchExtendTee$1 = new WalletLoader$batchExtendTee$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = walletLoader$batchExtendTee$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$batchExtendTee$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                C13894dbG c13894dbG = new C13894dbG(str, str2, str3);
                walletLoader$batchExtendTee$1.label = 1;
                objAEQbTJ = interfaceC13915dbbEZpvd.AEQbTJ(c13894dbG, extendTeeReqData, walletLoader$batchExtendTee$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            ResponseData responseData = (ResponseData) objAEQbTJ;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull TeeRemoveRequest teeRemoveRequest, @NotNull Continuation<? super Result<RemoveTeeResult>> continuation) throws java.lang.Throwable {
        WalletLoader$removeTee$1 walletLoader$removeTee$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof WalletLoader$removeTee$1) {
            walletLoader$removeTee$1 = (WalletLoader$removeTee$1) continuation;
            int i = walletLoader$removeTee$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$removeTee$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$removeTee$1 = new WalletLoader$removeTee$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = walletLoader$removeTee$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = walletLoader$removeTee$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                C13894dbG c13894dbG = new C13894dbG(str, str2, str3);
                walletLoader$removeTee$1.label = 1;
                objCopydefault = interfaceC13915dbbEZpvd.copydefault(c13894dbG, teeRemoveRequest, walletLoader$removeTee$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            ResponseData responseData = (ResponseData) objCopydefault;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchVPNInfo(@NotNull java.lang.String str, @NotNull Continuation<? super Result<TeeUpgradeStatus>> continuation) throws java.lang.Throwable {
        WalletLoader$queryTeeUpgradeStatus$1 walletLoader$queryTeeUpgradeStatus$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$queryTeeUpgradeStatus$1) {
            walletLoader$queryTeeUpgradeStatus$1 = (WalletLoader$queryTeeUpgradeStatus$1) continuation;
            int i = walletLoader$queryTeeUpgradeStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$queryTeeUpgradeStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$queryTeeUpgradeStatus$1 = new WalletLoader$queryTeeUpgradeStatus$1(this, continuation);
            }
        }
        WalletLoader$queryTeeUpgradeStatus$1 walletLoader$queryTeeUpgradeStatus$12 = walletLoader$queryTeeUpgradeStatus$1;
        java.lang.Object objQueryTeeUpgradeStatus$default = walletLoader$queryTeeUpgradeStatus$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$queryTeeUpgradeStatus$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objQueryTeeUpgradeStatus$default);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                walletLoader$queryTeeUpgradeStatus$12.label = 1;
                objQueryTeeUpgradeStatus$default = InterfaceC13915dbb.Application.queryTeeUpgradeStatus$default(interfaceC13915dbbEZpvd, str, null, walletLoader$queryTeeUpgradeStatus$12, 2, null);
                if (objQueryTeeUpgradeStatus$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objQueryTeeUpgradeStatus$default);
            }
            responseData = (ResponseData) objQueryTeeUpgradeStatus$default;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    public final AbstractC58185ywX<ResponseData<EVM5792CallDataRes>> EZpvd(@NotNull EVM5792CallDataReq eVM5792CallDataReq) {
        Intrinsics.checkNotNullParameter(eVM5792CallDataReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.evm5792CallData$default(EZpvd(), eVM5792CallDataReq, null, 2, null), null, 1, null));
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<java.lang.String, OKServerException>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletLoader$evm5792QueryTx$2(this, str, str2, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isConnected(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<UnbindWalletAndDeviceRes, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$unBindWalletAndDevice$1 walletLoader$unBindWalletAndDevice$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$unBindWalletAndDevice$1) {
            walletLoader$unBindWalletAndDevice$1 = (WalletLoader$unBindWalletAndDevice$1) continuation;
            int i = walletLoader$unBindWalletAndDevice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$unBindWalletAndDevice$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$unBindWalletAndDevice$1 = new WalletLoader$unBindWalletAndDevice$1(this, continuation);
            }
        }
        WalletLoader$unBindWalletAndDevice$1 walletLoader$unBindWalletAndDevice$12 = walletLoader$unBindWalletAndDevice$1;
        java.lang.Object objUnBindWalletAndDevice$default = walletLoader$unBindWalletAndDevice$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$unBindWalletAndDevice$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objUnBindWalletAndDevice$default);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                UnbindWalletAndDeviceReq unbindWalletAndDeviceReq = new UnbindWalletAndDeviceReq(str);
                walletLoader$unBindWalletAndDevice$12.label = 1;
                objUnBindWalletAndDevice$default = InterfaceC13915dbb.Application.unBindWalletAndDevice$default(interfaceC13915dbbEZpvd, unbindWalletAndDeviceReq, null, walletLoader$unBindWalletAndDevice$12, 2, null);
                if (objUnBindWalletAndDevice$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objUnBindWalletAndDevice$default);
            }
            responseData = (ResponseData) objUnBindWalletAndDevice$default;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }

    public final java.lang.Object AEQbTJ(@NotNull java.util.List<java.lang.Integer> list, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CoinInfoResponse>, OKServerException>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletLoader$getCoinInfoByCoinNo$2(this, list, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, long j, @NotNull java.util.List<AddressRegisterBean> list, @NotNull Continuation<? super AbstractC43419rot<QueryAddressRegisterStatusRes, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$queryAddressRegisterStatus$1 walletLoader$queryAddressRegisterStatus$1;
        if (continuation instanceof WalletLoader$queryAddressRegisterStatus$1) {
            walletLoader$queryAddressRegisterStatus$1 = (WalletLoader$queryAddressRegisterStatus$1) continuation;
            int i = walletLoader$queryAddressRegisterStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$queryAddressRegisterStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$queryAddressRegisterStatus$1 = new WalletLoader$queryAddressRegisterStatus$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$queryAddressRegisterStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$queryAddressRegisterStatus$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$queryAddressRegisterStatus$2$1 walletLoader$queryAddressRegisterStatus$2$1 = new WalletLoader$queryAddressRegisterStatus$2$1(this, str2, str, str3, j, list, null);
                walletLoader$queryAddressRegisterStatus$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$queryAddressRegisterStatus$2$1, walletLoader$queryAddressRegisterStatus$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j, @NotNull java.util.List<AddressRegisterBean> list, @NotNull Continuation<? super AbstractC43419rot<RegisterAddressStatusRes, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$registerActivityAddress$1 walletLoader$registerActivityAddress$1;
        java.lang.String str5;
        java.lang.String str6;
        if (continuation instanceof WalletLoader$registerActivityAddress$1) {
            walletLoader$registerActivityAddress$1 = (WalletLoader$registerActivityAddress$1) continuation;
            int i = walletLoader$registerActivityAddress$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$registerActivityAddress$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$registerActivityAddress$1 = new WalletLoader$registerActivityAddress$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$registerActivityAddress$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$registerActivityAddress$1.label;
        java.lang.String str7 = AbstractC43419rot.TAG;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                str6 = AbstractC43419rot.TAG;
                str7 = null;
                try {
                    WalletLoader$registerActivityAddress$2$1 walletLoader$registerActivityAddress$2$1 = new WalletLoader$registerActivityAddress$2$1(this, str2, str, str3, str4, j, list, null);
                    walletLoader$registerActivityAddress$1.label = 1;
                    objWithContext = BuildersKt.withContext(io2, walletLoader$registerActivityAddress$2$1, walletLoader$registerActivityAddress$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    str5 = str6;
                    pUU.copydefault(str5, "Error: " + th);
                    return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                str6 = AbstractC43419rot.TAG;
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            str5 = str6;
            try {
                pUU.copydefault(str5, "Error: " + responseData);
                return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            } catch (java.lang.Throwable th2) {
                th = th2;
                pUU.copydefault(str5, "Error: " + th);
                return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            str5 = str7;
        }
    }

    public final AbstractC58185ywX<ResponseData<HotActivityAddressStatusResp>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().copydefault(new C13894dbG(str2, str, str3), new HotActivityAddressStatusReq(str4, j, str5)), null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(int i, @NotNull Continuation<? super Result<BindEmailData>> continuation) throws java.lang.Throwable {
        WalletLoader$judgeUserEmail$1 walletLoader$judgeUserEmail$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$judgeUserEmail$1) {
            walletLoader$judgeUserEmail$1 = (WalletLoader$judgeUserEmail$1) continuation;
            int i2 = walletLoader$judgeUserEmail$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletLoader$judgeUserEmail$1.label = i2 - Integer.MIN_VALUE;
            } else {
                walletLoader$judgeUserEmail$1 = new WalletLoader$judgeUserEmail$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = walletLoader$judgeUserEmail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = walletLoader$judgeUserEmail$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC13857daW interfaceC13857daWAhwBna = AhwBna();
                walletLoader$judgeUserEmail$1.label = 1;
                objEZpvd = interfaceC13857daWAhwBna.EZpvd(i, walletLoader$judgeUserEmail$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            responseData = (ResponseData) objEZpvd;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<PasskeyAccountData>> continuation) throws java.lang.Throwable {
        WalletLoader$createPasskeyAccount$1 walletLoader$createPasskeyAccount$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof WalletLoader$createPasskeyAccount$1) {
            walletLoader$createPasskeyAccount$1 = (WalletLoader$createPasskeyAccount$1) continuation;
            int i = walletLoader$createPasskeyAccount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$createPasskeyAccount$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$createPasskeyAccount$1 = new WalletLoader$createPasskeyAccount$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = walletLoader$createPasskeyAccount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$createPasskeyAccount$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC13857daW interfaceC13857daWAhwBna = AhwBna();
                walletLoader$createPasskeyAccount$1.label = 1;
                objOLrzqt = interfaceC13857daWAhwBna.OLrzqt(walletLoader$createPasskeyAccount$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            ResponseData responseData = (ResponseData) objOLrzqt;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull JsonElement jsonElement, @NotNull Continuation<? super Result<PasskeyWalletCreateUopRes>> continuation) throws java.lang.Throwable {
        WalletLoader$createPasskeyWalletUop$1 walletLoader$createPasskeyWalletUop$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$createPasskeyWalletUop$1) {
            walletLoader$createPasskeyWalletUop$1 = (WalletLoader$createPasskeyWalletUop$1) continuation;
            int i = walletLoader$createPasskeyWalletUop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$createPasskeyWalletUop$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$createPasskeyWalletUop$1 = new WalletLoader$createPasskeyWalletUop$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = walletLoader$createPasskeyWalletUop$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$createPasskeyWalletUop$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC13857daW interfaceC13857daWAhwBna = AhwBna();
                walletLoader$createPasskeyWalletUop$1.label = 1;
                objAEQbTJ = interfaceC13857daWAhwBna.AEQbTJ(str, jsonElement, walletLoader$createPasskeyWalletUop$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            responseData = (ResponseData) objAEQbTJ;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull PasskeyWalletSendUopReq passkeyWalletSendUopReq, @NotNull Continuation<? super Result<PasskeyWalletSendUopRes>> continuation) throws java.lang.Throwable {
        WalletLoader$sendPasskeyWalletUop$1 walletLoader$sendPasskeyWalletUop$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$sendPasskeyWalletUop$1) {
            walletLoader$sendPasskeyWalletUop$1 = (WalletLoader$sendPasskeyWalletUop$1) continuation;
            int i = walletLoader$sendPasskeyWalletUop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$sendPasskeyWalletUop$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$sendPasskeyWalletUop$1 = new WalletLoader$sendPasskeyWalletUop$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = walletLoader$sendPasskeyWalletUop$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = walletLoader$sendPasskeyWalletUop$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC13857daW interfaceC13857daWAhwBna = AhwBna();
                walletLoader$sendPasskeyWalletUop$1.label = 1;
                objCopydefault = interfaceC13857daWAhwBna.copydefault(str, passkeyWalletSendUopReq, walletLoader$sendPasskeyWalletUop$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            responseData = (ResponseData) objCopydefault;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(int i, @NotNull Continuation<? super Result<PasskeyWalletCheckRecoverRes>> continuation) throws java.lang.Throwable {
        WalletLoader$checkCanRecovery$1 walletLoader$checkCanRecovery$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$checkCanRecovery$1) {
            walletLoader$checkCanRecovery$1 = (WalletLoader$checkCanRecovery$1) continuation;
            int i2 = walletLoader$checkCanRecovery$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletLoader$checkCanRecovery$1.label = i2 - Integer.MIN_VALUE;
            } else {
                walletLoader$checkCanRecovery$1 = new WalletLoader$checkCanRecovery$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = walletLoader$checkCanRecovery$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = walletLoader$checkCanRecovery$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC13857daW interfaceC13857daWAhwBna = AhwBna();
                walletLoader$checkCanRecovery$1.label = 1;
                objKWHzl = interfaceC13857daWAhwBna.KWHzl(i, walletLoader$checkCanRecovery$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            responseData = (ResponseData) objKWHzl;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(int i, @NotNull Continuation<? super Result<PasskeyWalletRecoverInfoRes>> continuation) throws java.lang.Throwable {
        WalletLoader$getRecoveryInfo$1 walletLoader$getRecoveryInfo$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$getRecoveryInfo$1) {
            walletLoader$getRecoveryInfo$1 = (WalletLoader$getRecoveryInfo$1) continuation;
            int i2 = walletLoader$getRecoveryInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletLoader$getRecoveryInfo$1.label = i2 - Integer.MIN_VALUE;
            } else {
                walletLoader$getRecoveryInfo$1 = new WalletLoader$getRecoveryInfo$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = walletLoader$getRecoveryInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = walletLoader$getRecoveryInfo$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                InterfaceC13857daW interfaceC13857daWAhwBna = AhwBna();
                walletLoader$getRecoveryInfo$1.label = 1;
                objAEQbTJ = interfaceC13857daWAhwBna.AEQbTJ(i, walletLoader$getRecoveryInfo$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            responseData = (ResponseData) objAEQbTJ;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(int i, @NotNull Continuation<? super Result<PasskeyWalletAccountInfoRes>> continuation) throws java.lang.Throwable {
        WalletLoader$getPWAccountInfo$1 walletLoader$getPWAccountInfo$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$getPWAccountInfo$1) {
            walletLoader$getPWAccountInfo$1 = (WalletLoader$getPWAccountInfo$1) continuation;
            int i2 = walletLoader$getPWAccountInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletLoader$getPWAccountInfo$1.label = i2 - Integer.MIN_VALUE;
            } else {
                walletLoader$getPWAccountInfo$1 = new WalletLoader$getPWAccountInfo$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = walletLoader$getPWAccountInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = walletLoader$getPWAccountInfo$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC13857daW interfaceC13857daWAhwBna = AhwBna();
                walletLoader$getPWAccountInfo$1.label = 1;
                objOLrzqt = interfaceC13857daWAhwBna.OLrzqt(i, walletLoader$getPWAccountInfo$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            responseData = (ResponseData) objOLrzqt;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull EscapeBatchSendUopReq escapeBatchSendUopReq, @NotNull Continuation<? super Result<EscapeBatchSendUopRes>> continuation) throws java.lang.Throwable {
        WalletLoader$batchSendEscapeTransactionUop$1 walletLoader$batchSendEscapeTransactionUop$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$batchSendEscapeTransactionUop$1) {
            walletLoader$batchSendEscapeTransactionUop$1 = (WalletLoader$batchSendEscapeTransactionUop$1) continuation;
            int i = walletLoader$batchSendEscapeTransactionUop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$batchSendEscapeTransactionUop$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$batchSendEscapeTransactionUop$1 = new WalletLoader$batchSendEscapeTransactionUop$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = walletLoader$batchSendEscapeTransactionUop$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$batchSendEscapeTransactionUop$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC13857daW interfaceC13857daWAhwBna = AhwBna();
                walletLoader$batchSendEscapeTransactionUop$1.label = 1;
                objKWHzl = interfaceC13857daWAhwBna.KWHzl(escapeBatchSendUopReq, walletLoader$batchSendEscapeTransactionUop$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            responseData = (ResponseData) objKWHzl;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX INFO: renamed from: getEscapeDetailInfo-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8564getEscapeDetailInfo0E7RQCE$default(C13934dbu c13934dbu, int i, java.lang.String str, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return c13934dbu.OLrzqt(i, str, (Continuation<? super Result<EscapeDetailDataResp>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(int i, java.lang.String str, @NotNull Continuation<? super Result<EscapeDetailDataResp>> continuation) throws java.lang.Throwable {
        WalletLoader$getEscapeDetailInfo$1 walletLoader$getEscapeDetailInfo$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$getEscapeDetailInfo$1) {
            walletLoader$getEscapeDetailInfo$1 = (WalletLoader$getEscapeDetailInfo$1) continuation;
            int i2 = walletLoader$getEscapeDetailInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletLoader$getEscapeDetailInfo$1.label = i2 - Integer.MIN_VALUE;
            } else {
                walletLoader$getEscapeDetailInfo$1 = new WalletLoader$getEscapeDetailInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = walletLoader$getEscapeDetailInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = walletLoader$getEscapeDetailInfo$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC13857daW interfaceC13857daWAhwBna = AhwBna();
                walletLoader$getEscapeDetailInfo$1.label = 1;
                objKWHzl = interfaceC13857daWAhwBna.KWHzl(i, str, walletLoader$getEscapeDetailInfo$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            responseData = (ResponseData) objKWHzl;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX INFO: renamed from: getEscapeListInfo-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8565getEscapeListInfo0E7RQCE$default(C13934dbu c13934dbu, int i, java.lang.String str, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return c13934dbu.KWHzl(i, str, (Continuation<? super Result<EscapeListDataResp>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(int i, java.lang.String str, @NotNull Continuation<? super Result<EscapeListDataResp>> continuation) throws java.lang.Throwable {
        WalletLoader$getEscapeListInfo$1 walletLoader$getEscapeListInfo$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$getEscapeListInfo$1) {
            walletLoader$getEscapeListInfo$1 = (WalletLoader$getEscapeListInfo$1) continuation;
            int i2 = walletLoader$getEscapeListInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletLoader$getEscapeListInfo$1.label = i2 - Integer.MIN_VALUE;
            } else {
                walletLoader$getEscapeListInfo$1 = new WalletLoader$getEscapeListInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = walletLoader$getEscapeListInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = walletLoader$getEscapeListInfo$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC13857daW interfaceC13857daWAhwBna = AhwBna();
                java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(i);
                walletLoader$getEscapeListInfo$1.label = 1;
                objKWHzl = interfaceC13857daWAhwBna.KWHzl(numAEQbTJ, str, walletLoader$getEscapeListInfo$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            responseData = (ResponseData) objKWHzl;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(int i, int i2, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        WalletLoader$preCheckAccount$1 walletLoader$preCheckAccount$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$preCheckAccount$1) {
            walletLoader$preCheckAccount$1 = (WalletLoader$preCheckAccount$1) continuation;
            int i3 = walletLoader$preCheckAccount$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                walletLoader$preCheckAccount$1.label = i3 - Integer.MIN_VALUE;
            } else {
                walletLoader$preCheckAccount$1 = new WalletLoader$preCheckAccount$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = walletLoader$preCheckAccount$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = walletLoader$preCheckAccount$1.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC13857daW interfaceC13857daWAhwBna = AhwBna();
                walletLoader$preCheckAccount$1.label = 1;
                objEZpvd = interfaceC13857daWAhwBna.EZpvd(i, i2, walletLoader$preCheckAccount$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i4 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            responseData = (ResponseData) objEZpvd;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(Unit.INSTANCE);
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull GetBindingTokenRequestBody getBindingTokenRequestBody, @NotNull Continuation<? super Result<GetBindingTokenResponseBody>> continuation) throws java.lang.Throwable {
        WalletLoader$getWalletBindToken$1 walletLoader$getWalletBindToken$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$getWalletBindToken$1) {
            walletLoader$getWalletBindToken$1 = (WalletLoader$getWalletBindToken$1) continuation;
            int i = walletLoader$getWalletBindToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getWalletBindToken$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getWalletBindToken$1 = new WalletLoader$getWalletBindToken$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getWalletBindToken$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getWalletBindToken$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getWalletBindToken$result$1$1 walletLoader$getWalletBindToken$result$1$1 = new WalletLoader$getWalletBindToken$result$1$1(this, getBindingTokenRequestBody, null);
                walletLoader$getWalletBindToken$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getWalletBindToken$result$1$1, walletLoader$getWalletBindToken$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            responseData = (ResponseData) objWithContext;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object ejfBZ(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<WalletBannerEventData>, OKServerException>> continuation) throws java.lang.Throwable {
        WalletLoader$getWalletBannerEvent$1 walletLoader$getWalletBannerEvent$1;
        if (continuation instanceof WalletLoader$getWalletBannerEvent$1) {
            walletLoader$getWalletBannerEvent$1 = (WalletLoader$getWalletBannerEvent$1) continuation;
            int i = walletLoader$getWalletBannerEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getWalletBannerEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getWalletBannerEvent$1 = new WalletLoader$getWalletBannerEvent$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getWalletBannerEvent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getWalletBannerEvent$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getWalletBannerEvent$2$1 walletLoader$getWalletBannerEvent$2$1 = new WalletLoader$getWalletBannerEvent$2$1(this, null);
                walletLoader$getWalletBannerEvent$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getWalletBannerEvent$2$1, walletLoader$getWalletBannerEvent$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        WalletLoader$checkUsdgCountryLimit$1 walletLoader$checkUsdgCountryLimit$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof WalletLoader$checkUsdgCountryLimit$1) {
            walletLoader$checkUsdgCountryLimit$1 = (WalletLoader$checkUsdgCountryLimit$1) continuation;
            int i = walletLoader$checkUsdgCountryLimit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$checkUsdgCountryLimit$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$checkUsdgCountryLimit$1 = new WalletLoader$checkUsdgCountryLimit$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = walletLoader$checkUsdgCountryLimit$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$checkUsdgCountryLimit$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC13915dbb interfaceC13915dbbEZpvd = EZpvd();
                walletLoader$checkUsdgCountryLimit$1.label = 1;
                objEZpvd = interfaceC13915dbbEZpvd.EZpvd(str, walletLoader$checkUsdgCountryLimit$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            responseData = (ResponseData) objEZpvd;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object DbNXlk(@NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        WalletLoader$getTermsVersion$1 walletLoader$getTermsVersion$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof WalletLoader$getTermsVersion$1) {
            walletLoader$getTermsVersion$1 = (WalletLoader$getTermsVersion$1) continuation;
            int i = walletLoader$getTermsVersion$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$getTermsVersion$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$getTermsVersion$1 = new WalletLoader$getTermsVersion$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletLoader$getTermsVersion$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$getTermsVersion$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletLoader$getTermsVersion$result$1$1 walletLoader$getTermsVersion$result$1$1 = new WalletLoader$getTermsVersion$result$1$1(this, null);
                walletLoader$getTermsVersion$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, walletLoader$getTermsVersion$result$1$1, walletLoader$getTermsVersion$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
            if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
        }
        Result.Application application2 = Result.Companion;
        java.lang.String version = ((TermsVersionResp) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()).getVersion();
        if (version == null) {
            version = "";
        }
        return Result.m7377constructorimpl(version);
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2, @NotNull Continuation<? super AbstractC43419rot<GetMessageForSigningResp, OKServerException>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletLoader$getMessageForSigning$2(this, str, str2, i, i2, null), continuation);
    }

    public final java.lang.Object EZpvd(@NotNull Web3LoginReq web3LoginReq, @NotNull Continuation<? super AbstractC43419rot<Web3LoginResp, OKServerException>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletLoader$loginWeb3Account$2(this, web3LoginReq, null), continuation);
    }

    public final AbstractC58185ywX<ResponseData<EscapeBindStatusResp>> values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.queryEscapeBindStatus$default(EZpvd(), str, null, 2, null), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<EscapeAccountListResp>>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.queryEscapeAccountList$default(EZpvd(), new C13894dbG(str2, str, str3), str4, WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).AhwBna(), null, 8, null), null, 1, null));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.daW.ActionBar.checkAddressSuspend$default(o.daW, int, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        WalletLoader$checkCeDefiAddress$1 walletLoader$checkCeDefiAddress$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof WalletLoader$checkCeDefiAddress$1) {
            walletLoader$checkCeDefiAddress$1 = (WalletLoader$checkCeDefiAddress$1) continuation;
            int i = walletLoader$checkCeDefiAddress$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoader$checkCeDefiAddress$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoader$checkCeDefiAddress$1 = new WalletLoader$checkCeDefiAddress$1(this, continuation);
            }
        }
        java.lang.Object objCheckAddressSuspend$default = walletLoader$checkCeDefiAddress$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletLoader$checkCeDefiAddress$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCheckAddressSuspend$default);
                InterfaceC13857daW interfaceC13857daWAhwBna = AhwBna();
                walletLoader$checkCeDefiAddress$1.label = 1;
                objCheckAddressSuspend$default = InterfaceC13857daW.ActionBar.checkAddressSuspend$default(interfaceC13857daWAhwBna, 0, walletLoader$checkCeDefiAddress$1, 1, null);
                if (objCheckAddressSuspend$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCheckAddressSuspend$default);
            }
            ResponseData responseData = (ResponseData) objCheckAddressSuspend$default;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56443yFo.KWHzl(((CeDefiAddressCheckResult) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()).isBlackAddress()));
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
    }

    public final AbstractC58185ywX<ResponseData<CeDefiGasResp>> OLrzqt(@NotNull CeDefiGasLimitReq ceDefiGasLimitReq) {
        Intrinsics.checkNotNullParameter(ceDefiGasLimitReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.gasLimit$default(EZpvd(), ceDefiGasLimitReq, null, 2, null), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<CeDefiPreCreateOrderResp>> OLrzqt(@NotNull CeDefiPreCreateOrderReq ceDefiPreCreateOrderReq) {
        Intrinsics.checkNotNullParameter(ceDefiPreCreateOrderReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(InterfaceC13915dbb.Application.preCreateOrder$default(EZpvd(), ceDefiPreCreateOrderReq, null, 2, null), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<CeDefiCreateUopResp>> EZpvd(@NotNull CeDefiCreateUopReq ceDefiCreateUopReq) {
        Intrinsics.checkNotNullParameter(ceDefiCreateUopReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(ceDefiCreateUopReq), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<JsonElement>> KWHzl(@NotNull CeDefiSendUopReq ceDefiSendUopReq) {
        Intrinsics.checkNotNullParameter(ceDefiSendUopReq, "");
        return C33527myD.KWHzl(C13933dbt.okServerExceptionFilter$default(EZpvd().OLrzqt(ceDefiSendUopReq), null, 1, null));
    }

    public final java.lang.Object values(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<VerifyRes, OKServerException>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletLoader$verifyAccount$2(this, str, null), continuation);
    }
}
