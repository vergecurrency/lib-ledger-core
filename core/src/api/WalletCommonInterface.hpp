// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet_common_interface.djinni

#pragma once

#include <cstdint>
#include <memory>
#include <string>
#include <vector>

namespace ledger { namespace core { namespace api {

class Amount;
class BitcoinLikeWallet;
class CryptoCurrencyDescription;
class EthereumLikeWallet;
enum class WalletType;

class WalletCommonInterface {
public:
    virtual ~WalletCommonInterface() {}

    virtual std::string getIdentifier() = 0;

    virtual std::string getWalletName() = 0;

    virtual std::shared_ptr<CryptoCurrencyDescription> getCrypoCurrencyDescription() = 0;

    virtual WalletType getWalletType() = 0;

    virtual std::shared_ptr<Amount> getTotalBalance() = 0;

    virtual int32_t getAccountsCount() = 0;

    virtual std::vector<std::shared_ptr<Amount>> getAccountBalances() = 0;

    virtual int32_t getOperationsCount() = 0;

    virtual std::vector<int32_t> getAccountOperationsCount() = 0;

    virtual std::shared_ptr<BitcoinLikeWallet> asInstanceOfBitcoinWallet() = 0;

    virtual std::shared_ptr<EthereumLikeWallet> asInstanceOfEthereumWallet() = 0;
};

} } }  // namespace ledger::core::api