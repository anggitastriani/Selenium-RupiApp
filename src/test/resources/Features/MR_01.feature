Feature: MR-01

  Scenario: TS-MR-001
    Given The user login
    When The user login with username "testing2" password "Fadli798@"
    And The user entering OTP
    And The user directed to "Mutasi"
    And The user choose date
    Then The Text filter should be displayed

  Scenario: TS-MR-002
    Given The user login
    When The user login with username "testing2" password "Fadli798@"
    And The user entering OTP
    And The user directed to "Mutasi"
    And The user click kategori transaksi
    And The user choose kategori transaksi
    Then The Text pengeluaran should be displayed

  Scenario: TS-MR-006
    Given The user login
    When The user login with username "testing2" password "Fadli798@"
    And The user entering OTP
    And The user directed to "Mutasi"
    And The user click lihat bukti
    Then The Bukti Transfer should be displayed
